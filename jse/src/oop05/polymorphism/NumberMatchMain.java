package oop05.polymorphism;

import java.util.Scanner;

public class NumberMatchMain {
	public static void main(String[] args) {
		
		NumberMachService service = new NumberMatchServiceImpl();

		//
		System.out.println("홀짝 맞추기 게임을 시작합니다.");
		System.out.print("숫자를 입력하세요: ");
        Scanner scanner = new Scanner(System.in);
        int playVal = scanner.nextInt();
        int comVal = service.makeComVal();
        service.Match(playVal, comVal);
        System.out.println(service.display());
	}
}

