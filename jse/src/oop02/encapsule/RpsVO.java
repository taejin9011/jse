package oop02.encapsule;

public class RpsVO {
int rock, paper, scissors;
	public RpsVO(int rock, int paper, int scissors) {
		this.rock = rock;
		this.paper = paper;
		this.scissors = scissors;
	}
	
	
	String Rps(){
		int rock = 2;
		int paper = 3;
		int scissors = 1;
		String msg = "";
		if(rock == this.rock){
			msg ="�ָ�";
		}else if(paper == this.paper){
			msg = "���ڱ�";
		}else if(scissors == this.scissors){
			msg = "����";
		}
		return msg;
	}
}
