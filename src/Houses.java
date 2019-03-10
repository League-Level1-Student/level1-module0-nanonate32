import org.jointheleague.graphical.robot.Robot;

public class Houses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Robot Nathaniel = new Robot();
        Nathaniel.miniaturize();
        Nathaniel.setX(50);
        Nathaniel.setY(500);
        Nathaniel.penDown();
        Nathaniel.turn(90);
        Nathaniel.move(100);
        Nathaniel.turn(-90);
        Nathaniel.move(100);
	}

}
