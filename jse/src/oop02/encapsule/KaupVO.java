package oop02.encapsule;


public class KaupVO {

	private double height;
	private double weight;
	private int idx;
	private String msg;

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
public int getIdx() {
		return idx;
	}
	public void setIdx(double height, double weight) {
		this.idx =(int)((weight / (height * height)) * 10000);
	}

	public void setMsg(String msg1) {
		
		if (idx > 30) {
			msg = "비만";
		} else if (idx > 24) {
			msg = "과체중";
		} else if (idx > 20) {
			msg = "정상";
		} else if (idx > 15) {
			msg = "저체중";
		} else if (idx > 13) {
			msg = "마름";
		} else if (idx > 10) {
			msg = "영양실조";
		} else {
			msg = "소모증";
		}
	}
	public String getMsg() {
		return msg;
	}

	public String toString() {
		return "카우프지수 [키=" + this.height + " cm" + ", 몸무게=" + this.weight + " kg"
				+ ", 카우프지수=" + this.idx+"("+getMsg()+")"+ "]";
	}
}
