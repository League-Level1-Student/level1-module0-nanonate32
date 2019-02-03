package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
public static void main(String[] args) {
	FortuneCookie fc = new FortuneCookie();
	fc.showButton();
}
public void showButton() {
JFrame frame = new JFrame();
frame.setVisible(true);
JButton button = new JButton();
frame.add(button);
button.addActionListener(this);    
System.out.println("Button clicked");

	}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JOptionPane.showMessageDialog(null, "Boohoo");
	int randy = new Random().nextInt(5);
	if(randy == 0) {
		JOptionPane.showMessageDialog(null, "You will die 1 hour from now in a terrible fire.");
	}
} 	
}