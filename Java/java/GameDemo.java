import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class GameDemo {

    static int x = 250, y = 1;
    static Can c1 = null;

    public static void main(String[] args) {
        JFrame jf = new JFrame("Game");
        jf.setLayout(new BorderLayout());
        jf.setSize(500, 500);

        // Create and add the Canvas
        c1 = new Can();
        jf.add(c1, BorderLayout.CENTER);

        // Create buttons and add them to a panel
        Panel pn = new Panel();
        JButton jb = new JButton(" << ");
        JButton jb1 = new JButton(" >> ");
        pn.add(jb);
        pn.add(jb1);
        jf.add(pn, BorderLayout.SOUTH);

        // Add ActionListeners to buttons
        xyz actionHandler = new GameDemo().new xyz();
        jb.addActionListener(actionHandler);
        jb1.addActionListener(actionHandler);

        // Finalize and display the frame
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }

    class xyz implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            JButton bt = (JButton) ae.getSource();
            String s1 = bt.getText();
            if (s1.equals(" << ")) {
                x -= 5; // Move left
            } else {
                x += 5; // Move right
            }
            c1.repaint();
        }
    }

    static class Can extends Canvas implements Runnable {
        int r1 = 0, g1 = 0, b1 = 0;
        boolean isRunning = true; // Flag to control movement

        Can() {
            Thread t1 = new Thread(this);
            t1.start();
        }

        public void paint(Graphics g) {
            Color col = new Color(r1, g1, b1);
            g.setColor(col);
            g.fillRect(x, y, 20, 20);
        }

        public void run() {
            while (isRunning) { // Check the flag
                if (y < 400) {
                    y = y + 2;
                    try {
                        Thread.sleep(80);
                        repaint();
                    } catch (Exception tt) {
                        tt.printStackTrace();
                    }
                } else {
                    isRunning = false; // Stop movement when reaching the bottom
                }
            }
        }
    }
}