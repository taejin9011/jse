package oop02.encapsule;

import java.util.Scanner;

public class KaupService {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		KaupVO k = new KaupVO();
		System.out.print("키를 입력 : ");
		double height=scanner.nextDouble();
		k.setHeight(height);
		System.out.print("몸무게를 입력 : ");
		double weight=scanner.nextDouble();
		k.setHeight(weight);
		k.setIdx(height, weight);
		k.setMsg("");
		System.out.println(k.toString());
		System.out.println("완료");
	}
}
