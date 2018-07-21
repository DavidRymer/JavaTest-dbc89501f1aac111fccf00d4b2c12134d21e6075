package javaTest;

public class Player {



	public int xCoordPlayer;
	public int yCoordPlayer;
	public String playerName;
	public int health;

	public Player(String playerName) {

		this.playerName = playerName;
		this.xCoordPlayer = 0;
		this.yCoordPlayer = 0;
		this.health = 10;

	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getxCoordPlayer() {
		return xCoordPlayer;
	}


	public void setxCoordPlayer(int xCoordPlayer) {
		this.xCoordPlayer = xCoordPlayer;
	}


	public int getyCoordPlayer() {
		return yCoordPlayer;
	}



	public void setyCoordPlayer(int yCoordPlayer) {
		this.yCoordPlayer = yCoordPlayer;
	}


	public void move(String direction) {

		if (direction.equals("north")) {

			setyCoordPlayer(getyCoordPlayer() + 1);
		}

		else if (direction.equals("east")) {

			setxCoordPlayer(getxCoordPlayer() + 1);
		}
		else if (direction.equals("south")) {

			setyCoordPlayer(getyCoordPlayer() - 1);
		} 

		else if (direction.equals("west")) {

			setxCoordPlayer(getxCoordPlayer() - 1);
		}


	}

	public double watch(PointOfInterest[] points) {


		double[] distance = new double[points.length];

		for (int i = 0; i < points.length; i++) {

			distance[i] = Math.sqrt(  (Math.pow(points[i].getxCoordPoint()- getxCoordPlayer(),2)) +
					(Math.pow(points[i].getyCoordPoint() - getyCoordPlayer(),2)) );
		}

		double shortest = distance[0];

		for (int i = 0; i < distance.length; i++) {

			if (distance[i] <= shortest) {

				shortest = distance[i];
			}
		}

		return shortest;


	}


}