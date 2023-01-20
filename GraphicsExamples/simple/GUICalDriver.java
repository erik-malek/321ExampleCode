import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GUICalDriver extends JFrame{
    ComputeEngine cpu;
    /* buttons */
    private JButton oneBut;
    private JLabel titleLabel;    
    private ComputeListener myListener;    
    
    public class ComputeListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            String command;
            
            command = event.getActionCommand();
            titleLabel.setText(command);
        }
    }
    
    public GUICalDriver(ComputeEngine cpu) {
        this.cpu = cpu;
        setGraphics();
    }

    public void setGraphics() {
        JPanel numbersPanel, operationsPanel;
        Container myPane;
        
        myPane = getContentPane();
        myPane.setLayout(new GridLayout(1,2));
        numbersPanel = new JPanel();
        operationsPanel = new JPanel();
        myPane.add(numbersPanel);
        myPane.add(operationsPanel);
        oneBut = new JButton("1");
        titleLabel = new JLabel("what?");
        myListener = new ComputeListener();
        oneBut.addActionListener(myListener);
        oneBut.setEnabled(true);
        numbersPanel.add(oneBut);
        operationsPanel.add(titleLabel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1000,1000);
        setVisible(true);
    }
}