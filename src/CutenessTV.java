import javax.swing.JFrame;
import javax.swing.JPanel;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {
	JButton LeftButton = new JButton();
	JButton MiddleButton = new JButton();
	JButton RightButton = new JButton();
	public static void main(String[] args) {
		CutenessTV ctv = new CutenessTV();
		ctv.showButton();

	}

	public void showButton() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		
		frame.add(RightButton);
		frame.add(MiddleButton);
		frame.add(LeftButton);
		JPanel panel = new JPanel();
		frame.add(panel);
		panel.add(LeftButton);
		panel.add(RightButton);
		panel.add(MiddleButton);
		LeftButton.setText("ungrateful duck");
		MiddleButton.setText(" unicorns of cringe");
		RightButton.setText("demonic frog");
		LeftButton.addActionListener(this);
		MiddleButton.addActionListener(this);
		RightButton.addActionListener(this);
		frame.pack();
		{

		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();

		if(buttonPressed == LeftButton) {
	      showDucks();
		}
		if(buttonPressed == RightButton) {
		  showFrog();
		}
		if(buttonPressed == MiddleButton) {
		showFluffyUnicorns();
		}
	}
		void showDucks() {
		     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
		}

		void showFrog() {
		     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
		}

		void showFluffyUnicorns() {
		     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
		}

		void playVideo(String videoID) {
		     try {
		          URI uri = new URI(videoID);
		          java.awt.Desktop.getDesktop().browse(uri);
		     } catch (Exception e) {
		          e.printStackTrace();
		     }
		;
	}
}

	

