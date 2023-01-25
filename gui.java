import javax.swing.*;
import java.awt.*;
class gui{
    public static void main(String args[])
    {
       JFrame frame = new JFrame("My First GUI");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(400,400);
       JPanel panel = new JPanel(); // the panel is not visible in output



       JButton button1 = new JButton("Button 1");
       JButton button2 = new JButton("Button 2");
       frame.getContentPane().add(button1);
       frame.getContentPane().add(button2); // Adds Button to content pane of frame
    
       JButton send = new JButton("Send");
       JButton reset = new JButton("Reset");
       frame.getContentPane().add(send);
       frame.getContentPane().add(reset);

       panel.add(send);
       panel.add(reset);

       frame.getContentPane().add(BorderLayout.NORTH, panel);
       frame.setVisible(true);

    }
}