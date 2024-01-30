import java.awt.*; 
import java.applet.Applet; 
 
public class TextFieldDemo extends Applet
{ 
  Label L1,L2,L3;
  TextField txtName, txtClass, txtAddress;
  public void init()
{ 
 L1=new Label("Student Name ");
 add(L1);
 txtName=new TextField(20);
 add(txtName);
 
L2=new Label("Student Class ");
add(L2);
txtClass=new TextField(20);
add(txtClass);
 
 L3=new Label("Student Address ");
 add(L3);
 txtAddress=new TextField(20);
 add(txtAddress);
  } 
}  
