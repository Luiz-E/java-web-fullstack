package org.example.thread;

import javax.swing.JDialog;
import java.awt.*;

public class TelaTimeThread extends JDialog {
    public TelaTimeThread() {
        setTitle("Minha tela de tempo com Thread");
        setSize(new Dimension(240, 240));
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
}
