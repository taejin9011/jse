package oop01.encapsule;

import java.util.Scanner;

public class GameRpsController {
	public static void main(String[] args) {

		GameRpsService service = new GameRpsService();

		System.out.println("���������� ������ �����մϴ�.");
		System.out.println("����:1, ����:2, ��:3 �� �Է��غ�����.");
		Scanner scanner = new Scanner(System.in);
		int playerValue = scanner.nextInt();
		System.out.println("����� " + service.showRpsValue(playerValue)
				+ "�� �½��ϴ�.");
		int comValue = service.displayComValue();
		service.showRpsValue(comValue);
		System.out
				.println("��ǻ�ʹ� " + service.showRpsValue(comValue) + "�� �½��ϴ�.");
		String winner = service.showWinner();

		if (playerValue == comValue) {
			System.out.println("�����ϴ�.");
		}else if(playerValue > comValue){
			System.out.println("�÷��̾ �̰���ϴ�.");
		}else{
			System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
		}

	}
}
