package Vista;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrmTicker extends JDialog {
    private FrmTicker self;
    private JPanel pnlPrincipal;
    private JButton agregarTickerButton;
    private JTable tablaTicker;
    DefaultTableModel model;


    public FrmTicker(Window owner, String titulo) {
        super(owner, titulo);

        this.setContentPane(pnlPrincipal);
        this.setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setModal(true);
        this.self = this;


        model = new DefaultTableModel();
        model.addColumn("ID Ticker");
        model.addColumn("Descripcion");
        model.addColumn("Ratio");
        model.addColumn("Mercado");
        LoadTabla();


        agregarTickerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrmAgregarTicker frame = new FrmAgregarTicker(self,"Alta Ticker");
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

        tablaTicker.setModel(model);
    }
}
