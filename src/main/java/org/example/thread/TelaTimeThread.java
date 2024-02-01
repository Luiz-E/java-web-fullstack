package org.example.thread;

import javax.swing.*;
import java.awt.*;

public class TelaTimeThread extends JDialog {

    private JPanel jPanel = new JPanel(new GridBagLayout());
    private JLabel labelNome = new JLabel("Nome:");
    private JTextField campoNome = new JTextField();
    private JLabel labelEmail = new JLabel("Email:");
    private JTextField campoEmail = new JTextField();
    private JButton jButton = new JButton("Adicionar");
    private JButton jButton2 = new JButton("Stop");
    private ImplementacaoFilaThread fila = new ImplementacaoFilaThread();

    public TelaTimeThread() {
        setTitle("Minha tela de tempo com Thread");
        setSize(new Dimension(240, 240));
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new Insets(5,10, 5, 5);
        gridBagConstraints.anchor = GridBagConstraints.WEST;

        labelNome.setPreferredSize(new Dimension(200, 25));
        jPanel.add(labelNome, gridBagConstraints);

        campoNome.setPreferredSize(new Dimension(200,25));
        gridBagConstraints.gridy++;
        jPanel.add(campoNome, gridBagConstraints);

        labelEmail.setPreferredSize(new Dimension(200, 25));
        gridBagConstraints.gridy++;
        jPanel.add(labelEmail, gridBagConstraints);

        campoEmail.setPreferredSize(new Dimension(200,25));
        gridBagConstraints.gridy++;
        jPanel.add(campoEmail, gridBagConstraints);

        gridBagConstraints.gridwidth = 1;

        jButton.setPreferredSize(new Dimension(92, 25));
        gridBagConstraints.gridy++;
        jPanel.add(jButton, gridBagConstraints);

        jButton2.setPreferredSize(new Dimension(92, 25));
        gridBagConstraints.gridx++;
        jPanel.add(jButton2, gridBagConstraints);

        jButton.addActionListener((e) -> {
            if (fila == null) {
                fila = new ImplementacaoFilaThread();
                fila.start();
            }
            for (int i = 0; i < 100; i++) {
                FilaThread filaThread = new FilaThread(campoNome.getText() + i, campoEmail.getText() + i);
                fila.add(filaThread);
            }
        });

        jButton2.addActionListener(e -> {
            fila.stop();
            fila = null;
        });

        fila.start();
        add(jPanel, BorderLayout.WEST);
        setVisible(true);
    }
}
