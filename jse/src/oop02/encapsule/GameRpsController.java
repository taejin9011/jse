package oop02.encapsule;

import java.util.Scanner;

public class GameRpsController {
     public static void main(String[] args) {

          GameRpsService service = new GameRpsService();

         
          System.out.println("가위바위보 게임을 시작합니다.");
          System.out.println("가위:1, 바위:2, 보:3 을 입력해보세요.");
          Scanner scanner = new Scanner(System.in);
         
          int playerValue = scanner.nextInt();
         
          System.out.println("당신은 " + service.playerValue(playerValue)+ "를 냈습니다.");
          int comValue = service.displayComValue();
         
          System.out.println("컴퓨터는 " + service.showComValue(comValue) + "를 냈습니다.");
          int winner = service.showWinner(playerValue, comValue);
         
//          service.showRpsValue();
         
          if (winner == 0 ) {
               System.out.println("비겼습니다.");
          }else if(winner == 1){
               System.out.println("컴퓨터가 이겼습니다.");
          }else if(winner == 2){
               System.out.println("플레이어가 이겼습니다.");
          }else{
               System.out.println("잘못입력 되었습니다.");
         
          }
     }
}