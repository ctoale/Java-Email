//Connor Toale
//Assignment 5
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MailFrame extends JPanel
{  
  //L=label,B=button,F=field

  private JTextField fromF,toF,subjectF;
  private JLabel fromL,toL,subjectL,emailL;
  private JButton sendB,cancelB;
  private JPanel panel1,panel2,panel3,panel4,panel5;
  private JTextArea emailMsg;
   public MailFrame()
   {
    panel1 = new JPanel();
    panel2 = new JPanel();
    panel1.setPreferredSize(new Dimension(300,200));
    panel2.setPreferredSize(new Dimension(400,250));
    panel1.setLayout(new GridLayout(5,2,0,4));
    sendB = new JButton("Send");
    cancelB = new JButton("Cancel");
    fromL=new JLabel("From");
    toL=new JLabel("To");
    subjectL=new JLabel("Subject");
    emailL=new JLabel("Email Message");
    fromF=new JTextField("",15);
    toF=new JTextField("",15);
    subjectF=new JTextField("",15);
    emailMsg=new JTextArea("",8,20);
    JScrollPane scroll = new JScrollPane (emailMsg, 
   JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
    ButtonListener listen = new ButtonListener();
   sendB.addActionListener(listen);
   cancelB.addActionListener(listen);
     panel1.add(fromL);
     panel1.add(fromF);
     panel1.add(toL);
     panel1.add(toF);
     panel1.add(subjectL);
     panel1.add(subjectF);
     panel2.add(emailL);
     panel2.add(scroll);
     add(panel1);
     add(panel2);
     add(sendB);
     add(cancelB);
     setPreferredSize(new Dimension(720,300));
     
   }
   
  class ButtonListener implements ActionListener
   {   
      public void actionPerformed(ActionEvent event)
      {  
        
     if(event.getSource()==sendB){
       String from=fromF.getText();
       String to=toF.getText();
       String subject=subjectF.getText();
       String email=emailMsg.getText();
       System.out.print(email);
       if (!from.contains("@") || !from.contains("."))
       {
   JOptionPane.showMessageDialog(null, "Please check your From Address");
       }else if (!to.contains("@") || !to.contains("."))
       {
  JOptionPane.showMessageDialog(null, "Please check your To Address");
       }else if(subject.equals("")){
  JOptionPane.showMessageDialog(null, "Please enter Subject");       
       }else if(email.equals("")){
   JOptionPane.showMessageDialog(null, "Please enter Email message");              
       }else{
   JOptionPane.showMessageDialog(null, "Message Sent");       
       }
     
   }
   if(event.getSource()==cancelB){
     System.exit(0);
     
     
   }
  }
}
 }