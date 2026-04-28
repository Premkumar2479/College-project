import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Layout extends JFrame {
    JButton add, update, delete;

    public Layout() {
        add = new JButton("Add");
        update = new JButton("Update");
        delete = new JButton("Delete");
        setVisible(true);
        setSize(300, 300);
        setTitle("FlowLayout Demo");
        setLayout(new FlowLayout(FlowLayout.RIGHT, 40,40));
        add(add);
        add(update);
        add(delete);
    }

    public static void main(String[] args) {
        Layout obj = new Layout();
    }
}


