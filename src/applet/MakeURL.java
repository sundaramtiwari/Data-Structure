package applet;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

class UrlFrame extends JFrame
{
  JButton makeUrl;
  JTextField url;
 
  UrlFrame()
  {
         setTitle("Make Url");
         url = new JTextField(20);
         makeUrl = new JButton("Make Url");
         JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
         panel.add(url);
         panel.add(makeUrl);
      
         makeUrl.addActionListener(new ActionListener() {
               
          public void actionPerformed(ActionEvent e)
          {
            
                openURL(url.getText());
          }
      });     
         add(panel);
         setVisible(true);
         setSize(400,300);
        
  }
 
  private void  openURL(String url)
  {      // Configure the URL according to your requirement
    
         String prodUrl="http://" + url.trim() +
                       "anything you want to append";
         try
              {
              Process p=Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler \"" + prodUrl + "\"");
              }
              catch(IOException e1) {System.out.println(e1);}
             
      
  }
}


public class MakeURL {

       /**
       * @param args
       * @throws IOException
        */
       public static void main(String[] args) throws IOException {
             
              new UrlFrame();
             
       }
}