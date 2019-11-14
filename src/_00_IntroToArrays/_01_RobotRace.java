package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
		static int s;
		static int n;
		static int r;
		static int t;
		static int h;
	public static void main(String[] args) {
		
		//2. create an array of 5 robots.
		Robot[] bots = new Robot[5];

		_01_RobotRace rr = new _01_RobotRace();
		//3. use a for loop to initialize the robots.
		for(int i = 0;i<bots.length;i++) {
			bots[i] = new Robot();
			bots[i].hide();
			bots[i].setSpeed(10);

			//4. make each robot start at the bottom of the screen, side by side, facing up
			bots[i].moveTo(100*i+100, 500);
			bots[i].penDown();
		}
		//5. use another for loop to iterate through the array and make each robot move 
	    //   a random amount less than 50.
		for (int y=500; y>0; y--) {
			for (int x=0; x<5; x++) {
				Random gen = new Random();
				int er = gen.nextInt(50)+1;
				bots[x].move(er);
				s = bots[0].getY();
				n = bots[1].getY();
				r = bots[2].getY();
				t = bots[3].getY();
				h = bots[4].getY();
				
				rr.condi();
			}
		}
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

		//7. declare that robot the winner and throw it a party!
    	
		//8. try different races with different amounts of robots.
    	
	    //9. make the robots race around a circular track.
    	
	}
	public void condi() {
		if (s<=50) {
			JOptionPane.showMessageDialog(null, "S has won!");
			System.exit(0);
		}
		else if (n<=50) {
			JOptionPane.showMessageDialog(null, "N has won!");
			System.exit(0);
		}
		else if (r<=50) {
			JOptionPane.showMessageDialog(null, "R has won!");
			System.exit(0);
		}
		else if (t<=50) {
			JOptionPane.showMessageDialog(null, "T has won!");
			System.exit(0);
		}
		else if (h<=50) {
			JOptionPane.showMessageDialog(null, "H has won!");
			System.exit(0);
		}
	}
}
