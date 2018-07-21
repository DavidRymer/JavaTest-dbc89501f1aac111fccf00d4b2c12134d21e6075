package javaTest;

public class PointOfInterest {



	public void setEnd(boolean end) {
		this.end = end;
	}

	public void setxCoordPoint(int xCoordPoint) {
		this.xCoordPoint = xCoordPoint;
	}

	public void setyCoordPoint(int yCoordPoint) {
		this.yCoordPoint = yCoordPoint;
	}


	public String message;
	public boolean end;
	public int xCoordPoint;
	public int yCoordPoint;
	public int damage;

	public PointOfInterest(String message, boolean end, int xCoordPoint, int yCoordPoint, int damage) {

		this.message = message;
		this.end = end;
		this.xCoordPoint = xCoordPoint;
		this.yCoordPoint = yCoordPoint;
		this.damage = damage;

	}

	public int getxCoordPoint() {
		return xCoordPoint;
	}

	public int getyCoordPoint() {
		return yCoordPoint;
	}

	public String getMessage() {
		return message;
	}

	public boolean isEnd() {
		return end;
	}

	public int getDamage() {
		return damage;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}


	public void setDamage(int damage) {
		this.damage = damage;
	}
	


}
