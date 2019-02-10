package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JackInTheBox implements ActionListener {
int counter = 1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JackInTheBox jitb = new JackInTheBox();
		jitb.showButton();
	}
	public void showButton() {
	JFrame frame = new JFrame();
	frame.setVisible(true);
	JButton button = new JButton();
	frame.add(button);
	frame.pack();
	button.setText("Suprise!");
	button.addActionListener(this);    
	System.out.println("Button clicked");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		;System.out.println(counter);
		if(++counter==5 ) {
			
		}
		
	}

}
