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
			msg = "��";
		} else if (idx > 24) {
			msg = "��ü��";
		} else if (idx > 20) {
			msg = "����";
		} else if (idx > 15) {
			msg = "��ü��";
		} else if (idx > 13) {
			msg = "����";
		} else if (idx > 10) {
			msg = "�������";
		} else {
			msg = "�Ҹ���";
		}
	}
	public String getMsg() {
		return msg;
	}

	public String toString() {
		return "ī�������� [Ű=" + this.height + " cm" + ", ������=" + this.weight + " kg"
				+ ", ī��������=" + this.idx+"("+getMsg()+")"+ "]";
	}
}
