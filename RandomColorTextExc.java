import java.applet.Applet;
import java.awt.*;

public class RandomColorTextExc  extends Applet implements Runnable {

 Thread t;
 Graphics g;
 public void init()
 {
  g = getGraphics();
  Font f = new Font("Cambria",Font.BOLD,16);
  g.setFont(f);
  t = new Thread(this);
  t.start();
 }
 public void run()
 {
  while(true)
  {
   int x = (int)(Math.random() * 34534 % 500);
   int y = (int)(Math.random() * 34534 % 500);
   int r1 = (int)(Math.random() * 34534 % 256);
   int r2 = (int)(Math.random() * 34534 % 256);
   int r3 = (int)(Math.random() * 34534 % 256);
   
   Color c = new Color(r1,r2,r3);
   g.setColor(c);
   g.drawString("Java",x,y);
   
   try
   {
    Thread.sleep(70);
   }catch(Exception ee){ }
  }
 }
}
/* <applet code="RandomColorTextExc.class" width="250" height="250">
   </applet>  */