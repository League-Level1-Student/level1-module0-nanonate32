package extra;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
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
		frame.add(panel);
		panel.add(LeftButton);
		panel.add(RightButton);
		panel.add(MiddleButton);
		LeftButton.setText("goat bells");
		MiddleButton.setText("man screaming");
		RightButton.setText("awesome electronic sound");
		LeftButton.addActionListener(this);
		MiddleButton.addActionListener(this);
		RightButton.addActionListener(this);
		frame.pack();
		{

		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource("460036")) {

		}
	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}
}
