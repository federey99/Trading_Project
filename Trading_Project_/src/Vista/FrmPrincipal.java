package Vista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrmPrincipal extends JFrame {
    private JPanel pnlPrincipal;
    private JButton TRADINGButton;
    private JButton BROKERSButton;
    private JButton TICKERButton;
    private JButton DIVISAButton;
    private FrmPrincipal self;

    public FrmPrincipal(String titulo) {
        super(titulo);

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        this.setContentPane(pnlPrincipal);
        this.setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //Que la pantalla inicie CENTRADA
        this.setLocationRelativeTo(null);
        this.asociarEventos();
        this.self = this;

    }

    private void asociarEventos(){
        TICKERButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrmTicker frame = new FrmTicker(self,"Ticker");
                frame.setVisible(true);
            }
        });
        BROKERSButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrmBrokers frame = new FrmBrokers(self,"Broker");
                frame.setVisible(true);
            }
        });
        DIVISAButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrmDivisa frame = new FrmDivisa(self,"Divisa");
                frame.setVisible(true);
            }
        });
        TRADINGButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrmTrading frame = new FrmTrading(self,"Trading");
                frame.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        FrmPrincipal frame = new FrmPrincipal("TRADING");
        frame.setVisible(true);
    }
}
