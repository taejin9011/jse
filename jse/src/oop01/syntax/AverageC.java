package oop01.syntax;

public class AverageC {
	public static void main(String[] args) {
		AverageVO hulk = new AverageVO();
		
		hulk.setName("��ũ");
		hulk.setKor(100);
		hulk.setEng(15);
		
//		int tot = hulk.getKor() + hulk.getEng();
//		double avg = tot / 2d;
		
		System.out.println("==="+hulk.getName()+"�� ����ǥ===");
		System.out.println("���� : "+hulk.getKor());
		System.out.println("���� : "+hulk.getEng());
		System.out.println("���� : "+hulk.tot());
		System.out.println("��� : "+hulk.avg());
		System.out.println();
	}
}
