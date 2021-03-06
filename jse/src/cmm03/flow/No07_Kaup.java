package cmm03.flow;

import java.util.Scanner;

public class No07_Kaup {

	double height;
	double weight;
	int idx;
	Scanner scanner = new Scanner(System.in);

	No07_Kaup() {
		this(0, 0); // 매개 변수가 없으면 사용하기 위해서 작성함
	}

	No07_Kaup(double i, double j) {
//		this.height = i;
//		this.weight = j;
		setHeight(i);
		setWeight(j);
		this.idx = (int) ((weight / (height * height)) * 10000);
	} // 제약을 둠

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		System.out.print("키를 입력 : ");
		this.height = scanner.nextDouble();
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		System.out.print("몸무게를 입력 : ");
		this.weight = scanner.nextDouble();
	}

	String getMsg() {
		String msg = "";
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
		return msg;
	}

	@Override
	public String toString() {
		return "카우프지수 [키=" + height + " cm" + ", 몸무게=" + weight + " kg"
				+ ", 카우프지수=" + getMsg() + "]";
	}

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("키를 입력 : ");
//		double height = scanner.nextDouble();
//		System.out.print("몸무게를 입력  ..: ");
//		double weight = scanner.nextDouble();

		No07_Kaup k = new No07_Kaup();
		System.out.println(k.toString());
		System.out.println("완료");
	}
}
