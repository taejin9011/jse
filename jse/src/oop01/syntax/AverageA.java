package oop01.syntax;

public class AverageA {
	String name;
	int kor;
	int eng;

	public static void main(String[] args) {
		// tot, avg ���������� ���� �ϰ� 
		// �Ʒ��� ���� ��µǵ��� �Ͻÿ�.
		//�ϵ��ڵ�����
		AverageA hulk = new AverageA();
		hulk.name = "��ũ";
		hulk.kor = 100;
		hulk.eng = 75;
		
		AverageA iron = new AverageA();
		iron.name = "���̾�";
		iron.kor = 90;
		iron.eng = 50;
		
		AverageA thor = new AverageA();
		thor.name = "�丣";
		thor.kor = 50;
		thor.eng = 95;
		
		int hulkSum = hulk.kor + hulk.eng ;
		double hulkAvg = (double)hulkSum / 2;
		
		System.out.println("==="+hulk.name+"�� ����ǥ===");
		System.out.println("���� : "+hulk.kor);
		System.out.println("���� : "+hulk.eng);
		System.out.println("���� : "+hulkSum);
		System.out.println("��� : "+hulkAvg);
		System.out.println();
		
		int ironSum = iron.kor + iron.eng ;
		double ironAvg = ironSum / 2d;
		
		System.out.println("==="+iron.name+"���̾��� ����ǥ===");
		System.out.println("���� : "+iron.kor);
		System.out.println("���� : "+iron.eng);
		System.out.println("���� : "+ironSum);
		System.out.println("��� : "+ironAvg);
		System.out.println();
		
		int thorSum = thor.kor + thor.eng ;
		double thorAvg = thorSum / 2.0;
		
		System.out.println("==="+thor.name+"�� ����ǥ===");
		System.out.println("���� : "+thor.kor);
		System.out.println("���� : "+thor.eng);
		System.out.println("���� : "+thorSum);
		System.out.println("��� : "+thorAvg);
		
	}
}
