package oop05.polymorphism;

import java.util.Scanner;

public class NumberMatchMain {
	public static void main(String[] args) {
		
		NumberMachService service = new NumberMatchServiceImpl();

		//
		System.out.println("Ȧ¦ ���߱� ������ �����մϴ�.");
		System.out.print("���ڸ� �Է��ϼ���: ");
        Scanner scanner = new Scanner(System.in);
        int playVal = scanner.nextInt();
        int comVal = service.makeComVal();
        service.Match(playVal, comVal);
        System.out.println(service.display());
	}
}

