package oop05.polymorphism;

import java.util.Scanner;

public class KaupMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ű�� �Է� : ");
		double height=scanner.nextDouble();
		System.out.print("�����Ը� �Է� : ");
		double weight=scanner.nextDouble();
		
		//
		KaupInterface kif = new KaupServiceImpl();    // �������̽� �������� = new Ŭ����()
		kif.getKaupIndex(height, weight);
		System.out.println(kif.getResultMsg());
		
	}
}
