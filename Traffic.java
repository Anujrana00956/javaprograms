import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.applet.Applet;

public class Traffic extends Applet
    implements ActionListener
{

    int colourNum; //global variable which is responible for changing the light

    Button bttn1 = new Button ("Stop Traffic");
    Button bttn2 = new Button ("Caution");
    Button bttn3 = new Button ("Proceed");

    public void init ()
    {
        setBackground (Color.lightGray);

        bttn1.addActionListener (this); // stop light
        bttn2.addActionListener (this); // yellow light
        bttn3.addActionListener (this); // green light

        add (bttn1);
        add (bttn2);
        add (bttn3);
    }

    public void paint (Graphics g)  // responsible for graphics "within" the window
    {
        g.setColor (Color.black);

        switch (colourNum)
        {
            case 1:
                g.setColor (Color.red);
                break;
case 2:
                g.setColor (Color.yellow);
                break;
case 3:
                g.setColor (Color.green);
                break;
        }
        g.fillOval (30, 40, 20, 20); // red light
        g.fillOval (30, 70, 20, 20); // yello light
        g.fillOval (30, 100, 20, 20); // green light
    }


    public void actionPerformed (ActionEvent evt)
    {
        if (evt.getSource () == bttn1)
            colourNum = 1;
        else if (evt.getSource () == bttn2)
            colourNum = 2;
        else
            colourNum = 3;

        repaint ();
    }
}