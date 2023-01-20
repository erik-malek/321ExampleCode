import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GUICalDriver extends JFrame{
    ComputeEngine cpu;
    /* buttons */
    private JButton oneBut;
    private JButton twoBut;
    private JButton thrBut;
    private JButton fouBut;
    private JButton fivBut;
    private JButton sixBut;
    private JButton sevBut;
    private JButton eigBut;
    private JButton ninBut;
    private JButton zerBut;
    private JButton pntBut;
    private JButton addBut;
    private JButton mulBut;
    private JButton divBut;
    private JButton subBut;
    private JButton eqlBut;
    
    private JLabel resultLabel;    
    private ComputeListener myListener;    
    private double[] operands;
    private int current;
    private char operator;
        
    public class ComputeListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            String command;
            char chr;
            
            command = event.getActionCommand();
            chr = command.charAt(0);
            if (chr >= '0' && chr <= '9') {
                operands[current] = operands[current]*10 + Integer.parseInt(chr+"");
                resultLabel.setText(operands[current]+"");
            }
        }
    }
    
    public GUICalDriver(ComputeEngine cpu) {
        this.cpu = cpu;
        operands = new double[2];
        operands[0]=0;
        operands[1]=1;
        current = 0;
        operator=' ';
        setGraphics();
    }

    public void setGraphics() {
        JPanel numbersPanel, operationsPanel;
        Container myPane;
        
        myPane = getContentPane();
        myPane.setLayout(new GridLayout(1,2));
        numbersPanel = new JPanel();
        numbersPanel.setLayout(new GridLayout(4,3));
        operationsPanel = new JPanel();
        operationsPanel.setLayout(new GridLayout(6,1));
        myPane.add(numbersPanel);
        myPane.add(operationsPanel);
        oneBut = new JButton("1");
        twoBut = new JButton("2");
        thrBut = new JButton("3");
        fouBut = new JButton("4");
        fivBut = new JButton("5");
        sixBut = new JButton("6");
        sevBut = new JButton("7");
        eigBut = new JButton("8");
        ninBut = new JButton("9");
        pntBut = new JButton(".");
        zerBut = new JButton("0");
        subBut = new JButton("+");
        addBut = new JButton("-");
        mulBut = new JButton("*");
        divBut = new JButton("/");
        eqlBut = new JButton("=");
        resultLabel = new JLabel("what?");
        myListener = new ComputeListener();
        oneBut.addActionListener(myListener);
        twoBut.addActionListener(myListener);
        thrBut.addActionListener(myListener);
        fouBut.addActionListener(myListener);
        fivBut.addActionListener(myListener);
        sixBut.addActionListener(myListener);
        sevBut.addActionListener(myListener);
        eigBut.addActionListener(myListener);
        ninBut.addActionListener(myListener);
        pntBut.addActionListener(myListener);
        zerBut.addActionListener(myListener);
        addBut.addActionListener(myListener);
        subBut.addActionListener(myListener);
        mulBut.addActionListener(myListener);
        divBut.addActionListener(myListener);
        eqlBut.addActionListener(myListener);
        oneBut.setEnabled(true);
        twoBut.setEnabled(true);
        thrBut.setEnabled(true);
        fouBut.setEnabled(true);
        fivBut.setEnabled(true);
        sixBut.setEnabled(true);
        sevBut.setEnabled(true);
        eigBut.setEnabled(true);
        ninBut.setEnabled(true);
        zerBut.setEnabled(true);
        pntBut.setEnabled(true);
        addBut.setEnabled(true);
        subBut.setEnabled(true);
        mulBut.setEnabled(true);
        divBut.setEnabled(true);
        eqlBut.setEnabled(true);
        numbersPanel.add(oneBut);
        numbersPanel.add(twoBut);
        numbersPanel.add(thrBut);
        numbersPanel.add(fouBut);
        numbersPanel.add(fivBut);
        numbersPanel.add(sixBut);
        numbersPanel.add(sevBut);
        numbersPanel.add(eigBut);
        numbersPanel.add(ninBut);
        numbersPanel.add(pntBut);
        numbersPanel.add(zerBut);
        operationsPanel.add(addBut);
        operationsPanel.add(subBut);
        operationsPanel.add(mulBut);
        operationsPanel.add(divBut);
        operationsPanel.add(eqlBut);
        operationsPanel.add(resultLabel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300,300);
        setVisible(true);
    }
}