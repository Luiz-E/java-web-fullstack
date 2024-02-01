package org.example.thread;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TelaTimeThread extends JDialog {

    private JPanel jPanel = new JPanel(new GridBagLayout());
    private JLabel descricaoHora = new JLabel("Nome:");
    private JTextField mostraTempo = new JTextField();
    private JLabel descricaoHora2 = new JLabel("Email:");
    private JTextField mostraTempo2 = new JTextField();
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

        descricaoHora.setPreferredSize(new Dimension(200, 25));
        jPanel.add(descricaoHora, gridBagConstraints);

        mostraTempo.setPreferredSize(new Dimension(200,25));
        gridBagConstraints.gridy++;
        jPanel.add(mostraTempo, gridBagConstraints);

        descricaoHora2.setPreferredSize(new Dimension(200, 25));
        gridBagConstraints.gridy++;
        jPanel.add(descricaoHora2, gridBagConstraints);

        mostraTempo2.setPreferredSize(new Dimension(200,25));
        gridBagConstraints.gridy++;
        jPanel.add(mostraTempo2, gridBagConstraints);

        gridBagConstraints.gridwidth = 1;

        jButton.setPreferredSize(new Dimension(92, 25));
        gridBagConstraints.gridy++;
        jPanel.add(jButton, gridBagConstraints);

        jButton2.setPreferredSize(new Dimension(92, 25));
        gridBagConstraints.gridx++;
        jPanel.add(jButton2, gridBagConstraints);

        jButton.addActionListener((e) -> {
            FilaThread filaThread = new FilaThread(mostraTempo.getText(), mostraTempo2.getText());
            ImplementacaoFilaThread.add(filaThread);
        });

        jButton2.addActionListener(e -> {


        });

        fila.start();
        add(jPanel, BorderLayout.WEST);
        setVisible(true);
    }
}
