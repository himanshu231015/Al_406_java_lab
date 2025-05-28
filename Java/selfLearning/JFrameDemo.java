import javax.swing.JFrame;
import javax.swing.JLabel;

public class JFrameDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My First JFrame");

        JLabel label = new JLabel("IPL");

        frame.add(label);
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
