//Connor Toale
//Assignment 5
import javax.swing.JFrame;
public class MailViewer
{ 
 public static void main(String[] args)
  {
   JFrame frame = new JFrame();
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   frame.setTitle("Send Email");
   frame.add(new MailFrame());
   frame.pack();
   frame.setVisible(true);
 }
}