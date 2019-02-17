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
		JButton LeftButton = new JButton();
		JButton MiddleButton = new JButton();
		JButton RightButton = new JButton();
		frame.add(RightButton);
		frame.add(MiddleButton);
		frame.add(LeftButton);
		JPanel panel = new JPanel();
		panel.add(frame);
		frame.pack();
		LeftButton.setText("Click for your fortune");
		MiddleButton.setText("");
		RightButton.setText("");
		LeftButton.addActionListener(this); 
		MiddleButton.addActionListener(this); 
		RightButton.addActionListener(this);
		
		

			}
		@Override
		public void actionPerformed(ActionEvent e) {
}
}