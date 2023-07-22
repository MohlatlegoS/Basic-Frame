
package za.ac.tut;

import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.JFrame;

public class frame extends JFrame
{

    public frame() throws HeadlessException 
    {
        setTitle("My GUI");
        setSize(200,250);
        setDefaultLookAndFeelDecorated(true);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setForeground(Color.BLUE);
        setVisible(true);
    }
    
}
