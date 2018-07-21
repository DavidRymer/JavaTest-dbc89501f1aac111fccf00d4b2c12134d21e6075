//package javaTest;
//
//public class Character {
//
//
//	public int xCoordPlayer;
//	public int yCoordPlayer;
//	public String playerName;
//
//	public Character(String playerName) {
//		
//		this.playerName = playerName;
//		this.xCoordPlayer = 0;
//		this.yCoordPlayer = 0;
//
//	}
//
//	public int getxCoordPlayer() {
//		return xCoordPlayer;
//	}
//
//
//	public void setxCoordPlayer(int xCoordPlayer) {
//		this.xCoordPlayer = xCoordPlayer;
//	}
//
//
//	public int getyCoordPlayer() {
//		return yCoordPlayer;
//	}
//
//
//
//	public void setyCoordPlayer(int yCoordPlayer) {
//		this.yCoordPlayer = yCoordPlayer;
//	}
//
//
//	public void move(String direction) {
//
//		if (direction.equals("north")) {
//
//			setyCoordPlayer(getyCoordPlayer() + 1);
//		}
//
//		else if (direction.equals("east")) {
//
//			setxCoordPlayer(getxCoordPlayer() + 1);
//		}
//		else if (direction.equals("south")) {
//
//			setyCoordPlayer(getyCoordPlayer() - 1);
//		} 
//
//		else if (direction.equals("west")) {
//
//			setxCoordPlayer(getxCoordPlayer() - 1);
//		}
//
//
//	}
////
//
//}
