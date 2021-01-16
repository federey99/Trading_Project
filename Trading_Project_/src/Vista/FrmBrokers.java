package Vista;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrmBrokers extends JDialog{
    private JPanel pnlPrincipal;
    private JTable tablaBroker;
    private JButton agregarBrokerButton;
    private FrmBrokers self;

    DefaultTableModel model;

    public FrmBrokers (Window owner, String titulo) {
        super(owner, titulo);

        this.setContentPane(pnlPrincipal);
        this.setSize(500, 450);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setModal(true);

        model = new DefaultTableModel();
        model.addColumn("ID Broker");
        model.addColumn("Com. Compra");
        model.addColumn("Der. Compra");
        model.addColumn("Com. Venta");
        model.addColumn("Der. Venta");
        LoadTabla();

        agregarBrokerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrmAgregarBroker frame = new FrmAgregarBroker(self,"Agregar Broker");
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

        tablaBroker.setModel(model);
    }
}
