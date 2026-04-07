import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
//1. import the class.

public class MyFrame2 {

	JFrame f;
	JPanel p;
	JLabel lblName, lblAddress, lblDesc;
	JTextField txtName, txtAddress;
	JTextArea jtaDesc;
	JRadioButton Male,Female;
	ButtonGroup bg;
	JList list;
	DefaultListModel dlim;
	JComboBox jcb;

	MyFrame2() {
		p = new JPanel();
		f = new JFrame();

		jcb=new JComboBox();
		jcb.addItem("C++");
		jcb.addItem("Java");
		jcb.addItem("Python");
		jcb.addItem("DSA");
		jcb.addItem("Mongodb");


		list = new JList();
		dlim =new DefaultListModel();
		dlim.addElement("Patna");
		dlim.addElement("Ranchi");
		dlim.addElement("Delhi");
		dlim.addElement("Dubai");
		dlim.addElement("Iran");
		list.setModel(dlim);

		lblName = new JLabel("Enter your name		");
		txtName = new JTextField(30);
		
		lblAddress = new JLabel("Enter Address	");
		txtAddress = new JTextField(80);
		
		lblDesc = new JLabel("Enter Description	");
		jtaDesc = new JTextArea(4,50);

		Male =new JRadioButton("male");
		Female =new JRadioButton("female");

		bg = new ButtonGroup();
		bg.add(Male);
		bg.add(Female);


		p.add(lblName);
		p.add(txtName);
		
		p.add(lblAddress);
		p.add(txtAddress);

		p.add(lblDesc);
		p.add(jtaDesc);

		p.add(Male);
		p.add(Female);

		p.add(list);

		p.add(jcb);

		f.add(p);
		f.setSize(400, 400); // 400px width and size //4.2 size
		f.setTitle("My Gaming Application..."); // 4.1 title
		f.setVisible(true); // 4.3 show on screen
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 4.4 to close
		// by close button
		f.setResizable(true); // 4.5 no strech or resize.
	}

	// 2. make the main method
	public static void main(String args[]) {

		// 3. make the object
		MyFrame2 obj = new MyFrame2();
		
	}
}