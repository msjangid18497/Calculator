import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ms extends JFrame {
    JLabel l1, l2, l3, l4;
    JButton b;
    JTextField t1, t2;
    JPanel j;

    public ms(String s) {
        super(s);
    }

    public void setData() {
        l1 = new JLabel("First Number");
        l2 = new JLabel("Second Number");
        l3 = new JLabel();
        b = new JButton("ADD");
        t1 = new JTextField();
        t2 = new JTextField();
        setLayout(null);
        l1.setBounds(50, 100, 100, 20);
        add(l1);
        l2.setBounds(50, 150, 100, 20);
        add(l2);
        l3.setBounds(80, 250, 100, 20);
        add(l3);
        t1.setBounds(150, 100, 100, 20);
        add(t1);
        t2.setBounds(150, 150, 100, 20);
        add(t2);
        b.setBounds(120, 200, 100, 20);
        add(b);
        b.addActionListener(new O());

    }

    public static void main(String[] args)  
    {
	 ms se = new ms("RoyalsMs Calculator");
        try
        {
        
        se.setData();
        se.setVisible(true);

        }
        catch (Exception a)
        {
            System.out.println(a);
        }
se.setSize(400, 400);
        se.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public class O implements ActionListener {
        public void actionPerformed(ActionEvent e) 
        {
            int a, b;
            a = Integer.parseInt(t1.getText());
            b = Integer.parseInt(t2.getText());
            int c;
            c = a + b;
            l3.setText("Sum Is " + c);
        }
    }
}