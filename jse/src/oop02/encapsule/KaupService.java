package oop02.encapsule;

import java.util.Scanner;

public class KaupService {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		KaupVO k = new KaupVO();
		System.out.print("Ű�� �Է� : ");
		double height=scanner.nextDouble();
		k.setHeight(height);
		System.out.print("�����Ը� �Է� : ");
		double weight=scanner.nextDouble();
		k.setHeight(weight);
		k.setIdx(height, weight);
		k.setMsg("");
		System.out.println(k.toString());
		System.out.println("�Ϸ�");
	}
}
