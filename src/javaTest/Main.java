package javaTest;

import java.util.Scanner;

import javaTest.Player;
import javaTest.PointOfInterest;

public class Main {

	public static void main(String[] args) {

		Player tony = new Player("tony");
		PointOfInterest a = new PointOfInterest("You find a Castle, however a near by peasant throws a rock at you for 3 damage. One of the guards heard the treasure is north east.", false, 1,1,3);
		PointOfInterest b = new PointOfInterest("You bump into a wild goblin, you defeat him but lose 7HP in battle. He left a note saying the treasure is east!", false, 4,7,7);
		PointOfInterest c = new PointOfInterest("You find a cave, a spider bites you for 4 damage. A sign says the treasure is north east.", false, 8,2,4);
		PointOfInterest d = new PointOfInterest("You wonder into a bandit camp and get ravaged by bandits, 5 HP lost.", false, 4,11,5);
		PointOfInterest e = new PointOfInterest("You find a priest, he heals you for 4HP. He says the treasure may be north east.", false, 3,1,-4);
		PointOfInterest f = new PointOfInterest("You found the treasure, you win! Feel free to keep exploring.", true, 10,7,0);
		PointOfInterest g = new PointOfInterest("A troll smacks you with his club for five damage!, ouch!", false, -3,4, 5);
		PointOfInterest h = new PointOfInterest("A wizard strikes you with a lightning bolt for 8 damage! He feels bad and directs you north east to the treasure.", false, -3,-2, 8);
		PointOfInterest j = new PointOfInterest("you found a healing potion, it heals 5 HP!", false, -3,0, -5); 
		PointOfInterest k = new PointOfInterest("A dragon crimates you for 15 damage, ouch! a nearby burnt warriors corpse suggests the treasure is very close.", false, 7,7, 15);
		PointOfInterest l = new PointOfInterest("You scare a warrior! he wacks you with his mace for 8 damage! He then apologises and mentions the treasure is near", false, 9 ,5, 8);
		PointOfInterest m = new PointOfInterest("you fall down a ditch and hurt your leg. 5 damage lost.", false, -3,-5, 15);

		//		If you are going to play the game, do not cheat and look at the above!

		Scanner direction = new Scanner(System.in);

		PointOfInterest[] points = {a, b, c, d, e, f, g, h, j, k, l, m};

		System.out.println("You find yourself in a barren swamp. To navigate, try north, east, south or west. "
				+ "\nAn old lady tells you that there is treasure around these parts, you should search for it.");
		
		int rnd1;
		double rnd; 
		boolean end = false;

		while (tony.getHealth() > 0) { 

			String dir = direction.nextLine();
			tony.move(dir);

            rnd = 10 * Math.random();
			rnd1 = (int) rnd;

			if (dir.equals("north") == false && dir.equals("east") == false
					&& dir.equals("south") == false && dir.equals("west") == false) {

				System.out.println("To navigate, try north, east, south or west.");
				end = true;
				
			}
			else {

				System.out.println("You move " + dir +".");
			}

			for (int i = 0; i < points.length; i++) {
				
				if      (tony.getxCoordPlayer() == points[i].getxCoordPoint() &&
						tony.getyCoordPlayer() == points[i].getyCoordPoint()) {

					System.out.println(points[i].getMessage());
					tony.setHealth(tony.getHealth()-points[i].getDamage());
					points[i].setxCoordPoint(500+i);
					points[i].setyCoordPoint(500-i);
					break;

				}


				else { 

					if (rnd1 == 6 && end != true) {

						System.out.println("An evil chicken randomly appears! It attacks you for 4 damage");
						tony.setHealth(tony.getHealth()-4);
						break;
					}

					else if (rnd1 == 3 && end != true) {

						System.out.println("Jesus falls out of the sky and heals you for 5 health! Praise the lord!");
						tony.setHealth(tony.getHealth()+5);
						break;
					}	
				}
			}
			
		System.out.println("your watch reads: " + tony.watch(points) + "m.");
		System.out.println("you have " + tony.getHealth() + " HP remaining.");

		}





		System.out.println("Oh dear, you are dead!");

	}

}












