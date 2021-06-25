import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class OnOffSwitch 
{
  
    //all of these fields must be declared here so that the inner class can "see" 
    //them
    private JFrame myFrame = new JFrame("On/Off Switch"); // frame title
    private JButton button = new JButton("Off");  
    private String onText = "On";
    private String offText = "Off";
    private boolean isOn = false;
 
    public OnOffSwitch () 
    {    
        //myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        myFrame.setLayout(new FlowLayout());
        
        button.setForeground(Color.black);
        button.setBackground(Color.white);
        
        Switcher xx = new Switcher();
        button.addActionListener(xx);//add the Switcher to the button

        myFrame.add(button);
        myFrame.setSize(400, 400);
        myFrame.setVisible(true);
    }
 
    //here is the inner class 
    class Switcher implements ActionListener 
    {
        //we must implement this method to use the interface ActionListener
        public void actionPerformed (ActionEvent e) 
        {
  
            Color oldForeground = button.getForeground();//we access the private fields in the enclosing class
            button.setForeground(button.getBackground());
            button.setBackground(oldForeground);
            if(isOn)
            {
                button.setText(offText);
                isOn = false;
            }
            else
            {
                button.setText(onText);
                isOn = true;
            }
        }
    }//end of Switcher (inner class)
}//end of OnOffSwitch


