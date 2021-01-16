package Vista;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrmDivisa extends JDialog{
    private JPanel pnlPrincipal;
    private JTable tablaDivisa;
    private JButton agregarDivisaButton;
    private FrmDivisa self;

    DefaultTableModel model;

    public FrmDivisa (Window owner, String titulo) {
        super(owner, titulo);

        this.setContentPane(pnlPrincipal);
        this.setSize(500, 450);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setModal(true);

        model = new DefaultTableModel();
        model.addColumn("ID Divisa");
        model.addColumn("Moneda");
        model.addColumn("Valor");
        model.addColumn("Fecha");
        LoadTabla();


        agregarDivisaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrmAgregarDivisa frame = new FrmAgregarDivisa(self,"Alta Divisa");
                frame.setVisible(true);
                frame.addWindowListener(new WindowAdapter() {
                    public void windowClosed(WindowEvent e) {
                        LoadTabla();
                    }
                });
            }
        });
    }
    private void LoadTabla() {

        tablaDivisa.setModel(model);
    }
}


