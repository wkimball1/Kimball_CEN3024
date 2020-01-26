package Kimball_Drone;
import java.util.Scanner;


//Author Name: William Kimball
//Date: 1/18/20
//Program Name: Kimball_Drone
//Purpose: Simulation using button, drone movement in x,y,z location

public class Kimball_Drone {
	

	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			int selection = 0;
			
			Kimball_Drone myDrone = new Kimball_Drone();
			while (selection != 8) {
				
				System.out.println("Which direction would you like to move the drone?");
				System.out.println("1 - Move Up");
				System.out.println("2 - Move Down");
				System.out.println("3 - Move Forward");
				System.out.println("4 - Move Backward");
				System.out.println("5 - Turn Left");
				System.out.println("6 - Turn Right");
				System.out.println("7 - Display Position");
				System.out.println("8 - Exit Navigation");
	
				selection = input.nextInt();
				
				switch(selection) {
					case 1: 
						myDrone.moveUpDown(1);
						System.out.println("You have moved up");
						break;
					case 2:
						myDrone.moveUpDown(-1);
						System.out.println("You have moved down");
						break;
					case 3:
						if (myDrone.getOrientation() == "North") {
							myDrone.moveForwardBackward(1);
						}
						else if (myDrone.getOrientation() == "East") {
							myDrone.moveLeftRight(1);
						}
						else if (myDrone.getOrientation() == "South") {
							myDrone.moveForwardBackward(-1);
						}
						else if (myDrone.getOrientation() == "West") {
							myDrone.moveLeftRight(-1);
						}
						else {
							System.out.println("Error case 3!");
						}
						System.out.println("You have moved forward");
						break;
					case 4:
						if (myDrone.getOrientation() == "North") {
							myDrone.moveForwardBackward(-1);
						}
						else if (myDrone.getOrientation() == "East") {
							myDrone.moveLeftRight(-1);
						}
						else if (myDrone.getOrientation() == "South") {
							myDrone.moveForwardBackward(1);
						}
						else if (myDrone.getOrientation() == "West") {
							myDrone.moveLeftRight(1);
						}
						else {
							System.out.println("Error case 4!");
						}
						System.out.println("You have moved backward");
						break;
					case 5:
						myDrone.changeOrientation("Left");
						System.out.println("You have turned left");
						break;
					case 6:
						myDrone.changeOrientation("Right");
						System.out.println("You have turned right");
						break;
					case 7:
						System.out.println("Kimball_Drone [x_pos=" + myDrone.getX_pos() + 
								           ", y_pos=" + myDrone.getY_pos() + ", z_pos=" + myDrone.getZ_pos() +
								           ", orientation=" + myDrone.getOrientation());
						break;
					case 8:
						break;
				}
				
			
			}

		}
	
	public Kimball_Drone() {
		x_pos = 0;
		y_pos = 0;
		z_pos = 0;
		orientation = "North";
		
	}
	public void moveUpDown(int moveAmount) {
		z_pos += moveAmount;
		
	}
	
	public void moveLeftRight(int moveAmount) {
		x_pos += moveAmount;
		
	}
	
	public void moveForwardBackward (int moveAmount) {
		y_pos += moveAmount;
	}
	
	public void changeOrientation(String direction) {
		if (orientation == "North") {
			if (direction == "Right") {
				orientation = "East";
			}
			else {
				if (direction == "Left") {
					orientation = "West";
				}
			}
		}
		else if (orientation == "East") {
			if (direction == "Right") {
				orientation = "South";
			}
			else {
				if (direction == "Left") {
					orientation = "North";
				}
			}
		}
		else if (orientation == "South") {
			if (direction == "Right") {
				orientation = "West";
			}
			else {
				if (direction == "Left") {
					orientation = "East";
				}
			}
		}
		else if (orientation == "West") {
			if (direction == "Right") {
				orientation = "North";
			}
			else {
				if (direction == "Left") {
					orientation = "South";
				}
			}
		}
		
	}
	
	public int getX_pos() {
		return x_pos;
	}
	public int getY_pos() {
		return y_pos;
	}
	public int getZ_pos() {
		return z_pos;
	}
	
	public String getOrientation() {
		return orientation;
	}
	
	private int x_pos;
	private int y_pos;
	private int z_pos;
	private String orientation;


}
