import java.awt.*;
import java.awt.event.*;
class Event extends Frame implements ActionListener{
Button b;
TextField tf;
 Event()
{
       b=new Button("click me");
   tf=new TextField();
tf.setBounds(50,80,150,30);
add(tf);
b.setBounds(50,120,50,40);
b.addActionListener(this);
add(b);
setSize(400,300);
setLayout(null);
setVisible(true);

}
public  void actionPerformed(ActionEvent e)
{
  tf.setText("welcome to my program");
}
public static void main (String arg[])
{
new Event();
}
}

