package oop02.encapsule;

public class GameRpsVO {
	int rock, paper, scissors;
	
	public int getRock() {
		return rock;
	}
	public void setRock(int rock) {
		this.rock = rock;			//������ 2
	}
	public int getPaper() {
		return paper;
	}
	public void setPaper(int paper) {
		this.paper = paper; 		//���� 3
	}
	public int getScissors() {
		return scissors;
	}
	public void setScissors(int scissors) {
		this.scissors = scissors;		//������ 1
	}
}
