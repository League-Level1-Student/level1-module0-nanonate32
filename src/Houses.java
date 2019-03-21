import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
static Robot Nathaniel = new Robot();
	public static void main(String[] args) {
		
       
        Nathaniel.miniaturize();
        Nathaniel.setSpeed(25);
        Nathaniel.setX(50);
        Nathaniel.setY(500);
        Nathaniel.penDown();
        Nathaniel.turn(90);
        
        for (int i = 0; i < 10; i++) {
			flathouse("small", Color.BLUE);
		}
        Nathaniel.move(100);
        Nathaniel.turn(-90);
        Nathaniel.move
	}
	
	static void flathouse(String size, Color color) {
		int height = 60;
		if(size.equals("small")) {
			height = 60;
		}
		 if(size.equals("medium")) {
			  height = 120;

		 }
			if(size.equals("large")) {
				 height = 250;
			}
			
		 
		   Nathaniel.penDown();
		   Nathaniel.setPenColor(Color.BLUE);
	        //Nathaniel.turn(90);
	        Nathaniel.move(20);
	        Nathaniel.turn(-90);
	        Nathaniel.move(height);
	        Nathaniel.turn(90);
	        Nathaniel.move(50);
	        Nathaniel.turn(90);
	        Nathaniel.move(height);
	        Nathaniel.turn(-90);
	        Nathaniel.move(20);
}
}