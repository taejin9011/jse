package oop01.syntax;

public class AverageD {
	public static void main(String[] args) {
	
	AverageService hulk = new AverageService();

	String name = "��ũ";
	int kor = 100;
	int eng = 55;
//	int tot = hulk.getKor() + hulk.getEng();
//	double avg = tot / 2d;
	
	hulk.User(name, kor, eng);
	
	System.out.println("==="+name+"�� ����ǥ===");
	System.out.println("���� : "+kor);
	System.out.println("���� : "+eng);
	System.out.println("���� : "+hulk.tot());
	System.out.println("��� : "+hulk.avg());
	System.out.println();
	}
}
