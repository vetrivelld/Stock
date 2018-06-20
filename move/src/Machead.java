import javax.swing.JFrame;


public class Machead {
    public static void main(String args[]) {
        Second s = new Second();
        JFrame f = new JFrame();
        f.add(s);
        f.setVisible(true);
        f.setSize(700, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("Moving Ball");
    }
}
