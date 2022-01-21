package Multi;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;


public class MultiPanel extends JPanel implements ActionListener {

    private int WIDTH = 500;
    private int HEIGHT = 500;
    private Dimension SIZE = new Dimension(WIDTH, HEIGHT);
    private int reqSize;
    private JTextField textField;
    private JPanel multi;
    private JPanel top = new JPanel();
    public JLabel change; 

    public MultiPanel() {

        setPreferredSize(SIZE);
        setLayout(new BorderLayout(0, 0));
       
        textField = new JTextField();
        textField.setBounds(207, 5, 283, 20);
        textField.addActionListener(this);
        textField.setColumns(10);
        
        add(top, BorderLayout.NORTH);
        
         
        JLabel questionLBL = new JLabel("Enter the number of the multiplication table you want (1-20):");
        questionLBL.setFont(new Font("Century", Font.PLAIN, 13));
        top.add(questionLBL);
        top.add(textField);
        top.setBackground(new Color(0, 153, 153));
     
    }

    public void actionPerformed(ActionEvent e) {
        
        multi = new JPanel();
        add(multi, BorderLayout.CENTER);
        multi.setBackground(Color.CYAN);

        String num = textField.getText();

        reqSize = Integer.parseInt(num)+1;
        
        if (reqSize-1 > 20) {
            JOptionPane.showConfirmDialog(null, "Too large of a number, enter a smaller one", "Number out of bounds (1-20)", 
              JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        System.out.println(reqSize-1);
        multi.setLayout(new GridLayout(reqSize, reqSize, 0, 0));
       
        
        for (int x = 0; x < reqSize; x++) {
            for (int y = 0; y < reqSize; y++) {
                if (x == 0 && y == 0) {
                	change = new JLabel("0");
                	setJLabelProperties(change);
                    multi.add(change);
                } else if (x == 0) {
                    change = new JLabel("" + (y) + "");
                    setJLabelProperties(change);
                    multi.add(change);
                } else if (y == 0) {
                    change = new JLabel("" + (x) + "");
                    setJLabelProperties(change);
                    multi.add(change);
                } else {
                    change = new JLabel("" + (x*y) + "");
                    setJLabelProperties(change);
                    multi.add(change);
                }
              multi.revalidate();
              multi.repaint();
            }

        }

    }
    
    private void setJLabelProperties (JLabel lbl) {
        change.setBorder(BorderFactory.createLineBorder(Color.BLACK, 7));
        change.setHorizontalAlignment(JLabel.CENTER);
    }
    
}