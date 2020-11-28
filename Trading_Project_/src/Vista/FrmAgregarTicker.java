package Vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrmAgregarTicker extends JDialog {

    private JPanel pnlPrincipal;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JButton aceptarButton;
    private JButton cancelarButton;

public FrmAgregarTicker(Window owner, String titulo) {
    super(owner, titulo);

    this.setContentPane(pnlPrincipal);
    this.setSize(400, 400);
    this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    this.setLocationRelativeTo(null);
    this.setModal(true);

    cancelarButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {dispose();}
    });
}
}

