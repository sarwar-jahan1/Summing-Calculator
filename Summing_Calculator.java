import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.*;

public class Summing_Calculator extends Frame implements ActionListener {
    TextField tf,tf1,tf2;
    Label l,l1,l2;
    Button b;
    public Summing_Calculator() {
        setLayout(null);
        tf = new TextField();
        tf.setBounds(140, 50, 100, 20);
        tf1 = new TextField();
        tf1.setBounds(140, 90, 100, 20);
        tf2 = new TextField();
        tf2.setBounds(140, 130, 100, 20);

        l = new Label("Num1");
        l.setBounds(50, 50, 80, 20);
        l1 = new Label("Num2");
        l1.setBounds(50, 90, 80, 20);
        l2 = new Label("Result");
        l2.setBounds(50, 130, 80, 20);

        b = new Button("Sum");
        b.setBounds(90, 180, 100, 30);

        add(tf);
        add(tf1);
        add(tf2);
        add(l);
        add(l1);
        add(l2);
        add(b);

        b.addActionListener(this);

        setTitle("Summing Calculator");
        setSize(300, 250);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double num1 = Double.parseDouble(tf.getText());
            double num2 = Double.parseDouble(tf1.getText());

            double sum = num1 + num2;

            tf2.setText(String.valueOf(sum));
        } catch (NumberFormatException ex) {
            // Handle invalid input
            tf2.setText("Invalid input");
        }
    }

    public static void main(String[] args) {
        new Summing_Calculator();
    }
}

