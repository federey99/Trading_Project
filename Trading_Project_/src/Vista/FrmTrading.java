package Vista;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrmTrading extends JDialog {
    private JPanel pnlPrincipal;
    private JTable tablaTrading;
    private JScrollBar scrollBar1;
    private JScrollBar scrollBar2;
    private JButton agregarTradingButton;
    DefaultTableModel model;
    private FrmTrading self;

    public FrmTrading(Window owner, String titulo) {
        super(owner, titulo);

        this.setContentPane(pnlPrincipal);
        this.setSize(1200, 700);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setModal(true);
        this.self = this;


        model = new DefaultTableModel();
        model.addColumn("ID Broker");
        model.addColumn("ID Ticker");
        model.addColumn("Apertura");
        model.addColumn("Estado");
        model.addColumn("Cierre");
        model.addColumn("Dias");
        model.addColumn("Unidades");
        model.addColumn("Valor Compra");
        model.addColumn("Valor Actual");
        model.addColumn("Variacion");
        model.addColumn("Valor Venta");
        model.addColumn("Total Compra");
        model.addColumn("Total Venta");
        model.addColumn("Ganancia (%)");
        model.addColumn("Comision C");
        model.addColumn("Comision V");
        model.addColumn("Ganancia Neta");
        model.addColumn("vs Plazo Fijo");
        LoadTabla();

        agregarTradingButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrmAgregarTrading frame = new FrmAgregarTrading(self,"Alta Ticker");
                frame.setVisible(true);
            }
        });
    }

    private void LoadTabla() {
        tablaTrading.setModel(model);
    }
}
