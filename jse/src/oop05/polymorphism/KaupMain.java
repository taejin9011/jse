package oop05.polymorphism;

import java.util.Scanner;

public class KaupMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("키를 입력 : ");
		double height=scanner.nextDouble();
		System.out.print("몸무게를 입력 : ");
		double weight=scanner.nextDouble();
		
		//
		KaupInterface kif = new KaupServiceImpl();    // 인터페이스 참조변수 = new 클래스()
		kif.getKaupIndex(height, weight);
		System.out.println(kif.getResultMsg());
		
	}
}
