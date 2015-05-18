package oop01.encapsule;

/*
Date: 2015.05.15
Description: 가위 바위 보 게임 놀이
1= 가위
2= 바위
3= 보
*/

public class GameRpsService {

     /*
     * 숫자값에 따른 가위바위보 결정 로직
     */
     GameRpsVO controller = new GameRpsVO();

     public String playerValue(int playerValue) { // 플레이어 가위바위보
          String msg = ""; // 지역변수는 무조건 초기화 해야됨
          switch (playerValue) {
          case 1:
               msg = "가위";
               break;
          case 2:
               msg = "바위";
               break;
          case 3:
               msg = "보";
               break;
          default:
               msg = "?";
               break;
          }
          return msg;
     }

     /*
     * 컴퓨터가 랜덤으로 발생시킨 수 1부터 3까지
     */
     public int displayComValue() { // 컴퓨터 가위바위보
          int comValue = (int) ((Math.random() * 3) + 1);
          showComValue(comValue);
          return comValue;
     }

     public String showComValue(int comValue) {
          String msg = "";
          switch (comValue) {
          case 1:
               msg = "가위";
               break;
          case 2:
               msg = "바위";
               break;
          case 3:
               msg = "보";
               break;
          }
          return msg;
     }

 /*    
      public void showRpsValue() {
      GameRpsVO vo = new GameRpsVO();
      vo.setPaper(3);
      vo.setRock(2);
      vo.setScissors(1);
      }
 */
     
     /*
      * 승자를 보여주는 로직
      */
     public int showWinner(int playerValue, int comValue) {
          int winner = 3;
          // 0은 비김, 1은 플레이어 이김, 2는 컴퓨터 이김
          if (playerValue == 1 || playerValue == 2 || playerValue == 3) {
               if (playerValue == comValue) {
                    winner = 0;
               } else if (playerValue == (comValue + 1) % 3) {
                    winner = 1;
               } else {
                    winner = 2;
               }
          }
          return winner;
     }
}