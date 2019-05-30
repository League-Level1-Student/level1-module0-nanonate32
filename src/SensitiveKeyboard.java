import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class SensitiveKeyboard implements KeyListener{


	public static void main(String[] args) {
		// TODO Auto-generated method stub
      JFrame frame= new JFrame();
      frame.setVisible(true);
      
	SensitiveKeyboard bob = new SensitiveKeyboard();
      frame.addKeyListener(bob);
		
	}
      
	
	static void speak(String words) {
	     try {
	          Runtime.getRuntime().exec("say " + words).waitFor();
	     } catch (Exception e) {
	          e.printStackTrace();
	          }
	     }
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		
		// TODO Auto-generated method stub
	
			speak("somebody once told me the world was gonna roll me");
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	}



