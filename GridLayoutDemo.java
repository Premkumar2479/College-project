import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutDemo extends JFrame {

    JButton red, blue, green, black, white, cyan;

    public GridLayoutDemo() {
        red = new JButton("Red");
        blue = new JButton("Blue");
        green = new JButton("Green");
        black = new JButton("Black");
        white = new JButton("White");
        cyan = new JButton("Cyan");

        setTitle("GridLayout Demo");
        setSize(130, 130);
        setLayout(new GridLayout(2, 3));

        add(red);
        add(blue);
        add(green);
        add(black);
        add(white);
        add(cyan);

        setVisible(true);
    }

    public static void main(String[] args) {
        new GridLayoutDemo();
    }
}