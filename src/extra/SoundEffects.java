package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffects implements ActionListener {

	public static void main(String[] args) {
		SoundEffects sf = new SoundEffects();
		sf.showButton();      
                     
	}
	public void showButton() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JButton button = new JButton();
		frame.add(button);
		JPanel panel = new JPanel();
		panel.add(frame);
		button.setText("Click for your fortune");
		button.addActionListener(this);    
		System.out.println("Button clicked");
		

			}
		@Override
		public void actionPerformed(ActionEvent e) {
}
}