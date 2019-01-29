
import java.awt.event.*;
import java.awt. * ;
import javax.swing.*;

/**
 * Title:        View
 * Description:  Ein GUI fuer Pentago
 * Author:       Marius, Jonathan
 */


public class View  extends JFrame 
{
    JPanel myJPanel                 = new JPanel();
    JPanel SpielfeldJPanel          = new JPanel();
    BorderLayout myBorderLayout     = new BorderLayout();
    
    JTextField spieler1TextField    = new JTextField();
    JTextField spieler2TextField    = new JTextField();
    
    JLabel jLabel1                  = new JLabel();
    JLabel jLabel2                  = new JLabel();
  
    JButton DrehenARechtsButton     = new JButton();
    JButton DrehenALinksButton      = new JButton();
    JButton DrehenBRechtsButton     = new JButton();
    JButton DrehenBLinksButton      = new JButton();
    JButton DrehenCRechtsButton     = new JButton();
    JButton DrehenCLinksButton      = new JButton();
    JButton DrehenDRechtsButton     = new JButton();
    JButton DrehenDLinksButton      = new JButton();
    
    JButton stopButton              = new JButton();


    public View() {
        //Controller myController= new Controller(this);

        getContentPane().setLayout(myBorderLayout);
        myJPanel.setLayout(null);
        SpielfeldJPanel.setBounds(new Rectangle(150, 150, 700, 700));
        SpielfeldJPanel.setBackground(Color.black);
        
        
        spieler1TextField.setBounds(new Rectangle(400, 70, 75, 40));//(x,y,länge,breite)
        spieler2TextField.setBounds(new Rectangle(525, 70, 75, 40));
        
        jLabel1.setText("Spieler 1");
        jLabel1.setBounds(new Rectangle(400, 30, 75, 30));
        jLabel2.setText("Spieler 2");
        jLabel2.setBounds(new Rectangle(525, 30, 75, 30));
        
        DrehenARechtsButton.setText("Drehen");
        DrehenARechtsButton.setBounds(new Rectangle(150, 30, 100, 100));
        DrehenARechtsButton.setActionCommand("DrehenARechts");
        //DrehenARechtsButton.addActionListener(myController);

        
        DrehenALinksButton.setText("Drehen");
        DrehenALinksButton.setBounds(new Rectangle(30, 150, 100, 100));
        DrehenALinksButton.setActionCommand("DrehenALinks");
        //DrehenALinksButton.addActionListener(myController);

        
        DrehenBRechtsButton.setText("Drehen");
        DrehenBRechtsButton.setBounds(new Rectangle(870, 150, 100, 100));
        DrehenBRechtsButton.setActionCommand("DrehenBRechts");
        //DrehenBRechtsButton.addActionListener(myController);
        
        
        DrehenBLinksButton.setText("Drehen");
        DrehenBLinksButton.setBounds(new Rectangle(750, 30, 100, 100));
        DrehenBLinksButton.setActionCommand("DrehenBLinks");
        //DrehenBLinksButton.addActionListener(myController);

        
        DrehenCRechtsButton.setText("Drehen");
        DrehenCRechtsButton.setBounds(new Rectangle(30, 750, 100, 100));
        DrehenCRechtsButton.setActionCommand("DrehenCRechts");
        //DrehenCRechtsButton.addActionListener(myController);

        
        DrehenCLinksButton.setText("Drehen");
        DrehenCLinksButton.setBounds(new Rectangle(150, 870, 100, 100));
        DrehenCLinksButton.setActionCommand("DrehenCLinks");
        //DrehenCLinksButton.addActionListener(myController);

       
        DrehenDRechtsButton.setText("Drehen");
        DrehenDRechtsButton.setBounds(new Rectangle(750, 870, 100, 100));
        DrehenDRechtsButton.setActionCommand("DrehenDRechts");
        //DrehenDRechtsButton.addActionListener(myController);

        
        DrehenDLinksButton.setText("Drehen");
        DrehenDLinksButton.setBounds(new Rectangle(870, 750, 100, 100));
        DrehenDLinksButton.setActionCommand("DrehenDLinks");
        //DrehenDLinksButton.addActionListener(myController);
        
        
        stopButton.setText("Stop");
        stopButton.setBounds(new Rectangle(450, 920, 100, 50));
        //stopButton.addActionListener(myController);
        
        myJPanel.add(SpielfeldJPanel, null);
        
        myJPanel.add(spieler1TextField, null);
        myJPanel.add(spieler2TextField, null);
        
        myJPanel.add(jLabel1, null);
        myJPanel.add(jLabel2, null);
        
        myJPanel.setBackground(Color.green);
        myJPanel.add(DrehenARechtsButton, null);
        myJPanel.add(DrehenALinksButton, null);
        myJPanel.add(DrehenBRechtsButton, null);
        myJPanel.add(DrehenBLinksButton, null);
        myJPanel.add(DrehenCRechtsButton, null);
        myJPanel.add(DrehenCLinksButton, null);
        myJPanel.add(DrehenDRechtsButton, null);
        myJPanel.add(DrehenDLinksButton, null);
        
        myJPanel.add(stopButton, null);
        

        
        this.getContentPane().add(myJPanel, BorderLayout.CENTER);
    }

}
