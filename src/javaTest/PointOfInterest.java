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
	
	public String treasureDirection(int x, int y) {
		
		String dirx = "";
		String diry = "";
		
		if (xCoordPoint - x > 0) {
			
			dirx = "west";
		}
		
		else if (xCoordPoint - x < 0) {
			
			dirx = "east";
		}
		
		if (yCoordPoint - y > 0) {
			
			diry = "south";
		}
		
		else if (yCoordPoint - y < 0) {
			
			diry = "north";
		}
		
		if (dirx.equals("")) {
			
			return diry;
		}
		
		if (diry.equals("")) {
			
			return dirx;
		}
		
		return diry + " "+ dirx;
		
	}
	


}
