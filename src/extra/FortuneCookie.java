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
button.setText("Click for your fortune");
button.addActionListener(this);    
System.out.println("Button clicked");

	}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JOptionPane.showMessageDialog(null, "Boohoo");
	int randy = new Random().nextInt(6);
	if(randy == 0) {
		JOptionPane.showMessageDialog(null, "You will die when you are 36 years old.");
		
	}
	if(randy == 1) {
		JOptionPane.showMessageDialog(null, "You will eat poop every day and enjoy it.");
		
	}
	if(randy == 2) {
		JOptionPane.showMessageDialog(null, "A crocodile will eat you piece by piece.");
		
	}
	if(randy == 3) {
		JOptionPane.showMessageDialog(null, "You will get dyssentary in 5 days.");
		
	}
	if(randy == 4) {
		JOptionPane.showMessageDialog(null, "You will die from hunger in 10 minutes");
		
	}
	if(randy == 5) {
		JOptionPane.showMessageDialog(null, "You will die from Jeff the Killer in 5 minutes. ");
	}
} 	
}