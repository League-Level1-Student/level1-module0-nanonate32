/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */


import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
                quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // This will make sure the program exits when you close the window

		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image Address”)
              String image = "https://ivleader.com/wp-content/uploads/2018/05/fortnite-for-web-900x506.jpg";
		// 2. create a variable of type "Component" that will hold your image
               Component hold;
		// 3. use the "createImage()" method below to initialize your Component
            hold =    createImage(image);         
		// 4. add the image to the quiz window
             quizWindow.add(hold);
		// 5. call the pack() method on the quiz window
                quizWindow.pack();
		// 6. ask a question that relates to the image
        String awesome =  JOptionPane.showInputDialog("What is in the third inventory slot?");
		// 7. print "CORRECT" if the user gave the right answer
                if(awesome.equals( "heavy shotgun")) {
                System.out.println("CORRECT");
                }
                else {
                	System.out.println("INCORRECT");
                }
		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
               quizWindow.remove(hold);
		// 10. find another image and create it (might take more than one line of code)
                    String image2 = "https://is5-ssl.mzstatic.com/image/thumb/Purple118/v4/59/fd/d0/59fdd0a8-9fba-8c94-e403-887a36ae5e11/mzl.bkjzkqwu.png/643x0w.jpg";
                 Component hold2;
                 hold2 = createImage(image2);
                 quizWindow.add(hold2);
                 quizWindow.pack();
                 String cool = JOptionPane.showInputDialog("What weapon is in the second inventory slot?");
                 if(cool.equals("minigun")) {
                	 System.out.println("CORRECT");
                 }
                 else {
                	 System.out.println("INCORRECT");
                 }
		// 11. add the second image to the quiz window

		// 12. pack the quiz window

		// 13. ask another question

		// 14+ check answer, say if correct or incorrect, etc.

	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}





