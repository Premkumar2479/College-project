import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BoxLayoutDemo extends JFrame
    {
    JButton red, blue, green, black, white, cyan;
    public BoxLayoutDemo ()
    {
        red = new JButton("Red");
        blue = new JButton("Blue");
        green = new JButton("Green");
        black = new JButton("Black");
        white = new JButton("White");
        cyan = new JButton("Cyan");
    setLayout(new BoxLayout(this.getContentPane(),
        BoxLayout.Y_AXIS));

        setVisible(true);
        setSize(300,300);
        setTitle("BoxLayout Demo");
        add(red);
        add(blue);
        add(green);
        add(black);
        add(white);
        add(cyan);
}

        public static void main(String[] args){
        BoxLayoutDemo obj = new BoxLayoutDemo();
}

}