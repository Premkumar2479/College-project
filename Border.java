import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Border extends JFrame {

    JButton east, west, north, south, center;

    public Border() {
        east = new JButton("East");
        west = new JButton("West");
        north = new JButton("North");
        south = new JButton("South");
        center = new JButton("Center");

        setTitle("Border Layout Demo");
        setSize(300, 300);
        setLayout(new BorderLayout());

        add(east, BorderLayout.EAST);
        add(west, BorderLayout.WEST);
        add(north, BorderLayout.NORTH);
        add(south, BorderLayout.SOUTH);
        add(center, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Border();
    }
}