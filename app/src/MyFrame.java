import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JTextField textField;    
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        button = new JButton("Click Me");
        button.addActionListener(this);
        textField = new JTextField();
        textField.setPreferredSize(new Dimension(250, 50));
        textField.setFont(new Font("Consolas", Font.PLAIN, 35));
        textField.setForeground(new Color(0x00FF00));
        textField.setBackground(Color.black);

        this.add(button);
        this.add(textField);
        this.pack();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){            
            System.out.println("Bienvenido " + textField.getText());
        }
    }       

}
