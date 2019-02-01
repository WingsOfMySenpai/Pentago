



import java.awt.event.*;
import java.awt. * ;
import javax.swing.*;


/**
 * Title:           Controller
 * Description:     Dies ist der Controller dieses Spiels.
 *                  Der Controller hat das Spiel und kennt die View.
 * Author: Marius M
 */


public class SController implements ActionListener
{
    private View myView;
    //Spiel game = new Spiel();

    public SController(View pView)
    {
        myView = pView;
    }

    public void actionPerformed (ActionEvent e)
    {
        String cmd = e.getActionCommand();
        
        if (cmd.equals("DrehenARechts")) 
        {
            myView.FeldAJPanel.setBackground(Color.red);
        }
        else if (cmd.equals("DrehenALinks"))
        {
            myView.FeldAJPanel.setBackground(Color.blue);
        }
        else if (cmd.equals("DrehenBRechts"))
        {
            myView.FeldBJPanel.setBackground(Color.red);
        }
        else if (cmd.equals("DrehenBLinks"))
        {
            myView.FeldBJPanel.setBackground(Color.blue);
        }
        else if (cmd.equals("DrehenCRechts"))
        {
            myView.FeldCJPanel.setBackground(Color.red);
        }
        else if (cmd.equals("DrehenCLinks"))
        {
            myView.FeldCJPanel.setBackground(Color.blue);
        }
        else if (cmd.equals("DrehenDRechts"))
        {
            myView.FeldDJPanel.setBackground(Color.red);
        }
        else if (cmd.equals("DrehenDLinks"))
        {
            myView.FeldDJPanel.setBackground(Color.blue);
        }
        else if (cmd.equals("Stop")) 
        {
            System.exit(0);
        }
  }
}