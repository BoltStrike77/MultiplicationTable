package Multi;


import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;



@SuppressWarnings("serial")
public class MultiFrame extends JFrame {


    private MultiPanel contentPane;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MultiFrame frame = new MultiFrame();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public MultiFrame() {
        this.setTitle("Multiplication");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon icon = new ImageIcon("src/images/No Back.png");
        setIconImage(icon.getImage());
        setTitle("Multiplication");
        this.setResizable(true);
        this.setLayout(null);
        
        
        
        contentPane = new MultiPanel();
        setContentPane(contentPane);
        pack();
    }

}