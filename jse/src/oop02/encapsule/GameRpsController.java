package oop02.encapsule;

import java.util.Scanner;

public class GameRpsController {
     public static void main(String[] args) {

          GameRpsService service = new GameRpsService();

         
          System.out.println("���������� ������ �����մϴ�.");
          System.out.println("����:1, ����:2, ��:3 �� �Է��غ�����.");
          Scanner scanner = new Scanner(System.in);
         
          int playerValue = scanner.nextInt();
         
          System.out.println("����� " + service.playerValue(playerValue)+ "�� �½��ϴ�.");
          int comValue = service.displayComValue();
         
          System.out.println("��ǻ�ʹ� " + service.showComValue(comValue) + "�� �½��ϴ�.");
          int winner = service.showWinner(playerValue, comValue);
         
//          service.showRpsValue();
         
          if (winner == 0 ) {
               System.out.println("�����ϴ�.");
          }else if(winner == 1){
               System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
          }else if(winner == 2){
               System.out.println("�÷��̾ �̰���ϴ�.");
          }else{
               System.out.println("�߸��Է� �Ǿ����ϴ�.");
         
          }
     }
}