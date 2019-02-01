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
    JPanel FeldAJPanel              = new JPanel();
    JPanel FeldBJPanel              = new JPanel();
    JPanel FeldCJPanel              = new JPanel();
    JPanel FeldDJPanel              = new JPanel();
    
    
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
        SController PentagoController= new SController(this);

        getContentPane().setLayout(myBorderLayout);
        myJPanel.setLayout(null);
        SpielfeldJPanel.setBounds(new Rectangle(150, 150, 700, 700));
        SpielfeldJPanel.setBackground(Color.black);
        FeldAJPanel.setBounds(new Rectangle(180, 180, 295, 295));
        FeldAJPanel.setBackground(Color.red);
        FeldBJPanel.setBounds(new Rectangle(505, 180, 295, 295));
        FeldBJPanel.setBackground(Color.blue);
        FeldCJPanel.setBounds(new Rectangle(180, 505, 295, 295));
        FeldCJPanel.setBackground(Color.green);
        FeldDJPanel.setBounds(new Rectangle(505, 505, 295, 295));
        FeldDJPanel.setBackground(Color.orange);
        
        spieler1TextField.setBounds(new Rectangle(400, 70, 75, 40));//(x,y,länge,breite)
        spieler2TextField.setBounds(new Rectangle(525, 70, 75, 40));
        
        jLabel1.setText("Spieler 1");
        jLabel1.setBounds(new Rectangle(400, 30, 75, 30));
        jLabel2.setText("Spieler 2");
        jLabel2.setBounds(new Rectangle(525, 30, 75, 30));
        
        DrehenARechtsButton.setText("Drehen");
        DrehenARechtsButton.setBounds(new Rectangle(150, 30, 100, 100));
        DrehenARechtsButton.setActionCommand("DrehenARechts");
        DrehenARechtsButton.addActionListener(PentagoController);

        
        DrehenALinksButton.setText("Drehen");
        DrehenALinksButton.setBounds(new Rectangle(30, 150, 100, 100));
        DrehenALinksButton.setActionCommand("DrehenALinks");
        DrehenALinksButton.addActionListener(PentagoController);

        
        DrehenBRechtsButton.setText("Drehen");
        DrehenBRechtsButton.setBounds(new Rectangle(870, 150, 100, 100));
        DrehenBRechtsButton.setActionCommand("DrehenBRechts");
        DrehenBRechtsButton.addActionListener(PentagoController);
        
        
        DrehenBLinksButton.setText("Drehen");
        DrehenBLinksButton.setBounds(new Rectangle(750, 30, 100, 100));
        DrehenBLinksButton.setActionCommand("DrehenBLinks");
        DrehenBLinksButton.addActionListener(PentagoController);

        
        DrehenCRechtsButton.setText("Drehen");
        DrehenCRechtsButton.setBounds(new Rectangle(30, 750, 100, 100));
        DrehenCRechtsButton.setActionCommand("DrehenCRechts");
        DrehenCRechtsButton.addActionListener(PentagoController);

        
        DrehenCLinksButton.setText("Drehen");
        DrehenCLinksButton.setBounds(new Rectangle(150, 870, 100, 100));
        DrehenCLinksButton.setActionCommand("DrehenCLinks");
        DrehenCLinksButton.addActionListener(PentagoController);

       
        DrehenDRechtsButton.setText("Drehen");
        DrehenDRechtsButton.setBounds(new Rectangle(750, 870, 100, 100));
        DrehenDRechtsButton.setActionCommand("DrehenDRechts");
        DrehenDRechtsButton.addActionListener(PentagoController);

        
        DrehenDLinksButton.setText("Drehen");
        DrehenDLinksButton.setBounds(new Rectangle(870, 750, 100, 100));
        DrehenDLinksButton.setActionCommand("DrehenDLinks");
        DrehenDLinksButton.addActionListener(PentagoController);
        
        
        stopButton.setText("Stop");
        stopButton.setBounds(new Rectangle(450, 920, 100, 50));
        stopButton.addActionListener(PentagoController);
        
        myJPanel.add(FeldAJPanel, null);
        myJPanel.add(FeldBJPanel, null);
        myJPanel.add(FeldCJPanel, null);
        myJPanel.add(FeldDJPanel, null);
        
        myJPanel.add(SpielfeldJPanel, null);
        
        
        myJPanel.add(spieler1TextField, null);
        myJPanel.add(spieler2TextField, null);
        
        myJPanel.add(jLabel1, null);
        myJPanel.add(jLabel2, null);
        
        myJPanel.setBackground(Color.blue);
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
