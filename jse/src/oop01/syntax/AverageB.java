package oop01.syntax;

public class AverageB {
	String name;
	int kor;
	int eng;
	/*�޼ҵ带 ���⿡ �����ؼ� �޼ҵ��� ��üȭ�� ���ּ���.*/
	
	int sum(){
		int sum = kor+eng;
		return sum;
	}
	
	double avg(){
		double avg = sum()/2d;
		return avg;
	}
	
	public static void main(String[] args) {
		AverageB hulk = new AverageB();
		
		
		hulk.name = "��ũ";
		hulk.kor = 65;
		hulk.eng = 50;
				
		System.out.println("==="+hulk.name+"�� ����ǥ===");
		System.out.println("���� : "+hulk.kor);
		System.out.println("���� : "+hulk.eng);
		System.out.println("���� : "+hulk.sum());
		System.out.println("��� : "+hulk.avg());
		System.out.println();
		
		

	}
}
