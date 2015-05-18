package oop01.encapsule;

/*
Date: 2015.05.15
Description: ���� ���� �� ���� ����
1= ����
2= ����
3= ��
*/

public class GameRpsService {

     /*
     * ���ڰ��� ���� ���������� ���� ����
     */
     GameRpsVO controller = new GameRpsVO();

     public String playerValue(int playerValue) { // �÷��̾� ����������
          String msg = ""; // ���������� ������ �ʱ�ȭ �ؾߵ�
          switch (playerValue) {
          case 1:
               msg = "����";
               break;
          case 2:
               msg = "����";
               break;
          case 3:
               msg = "��";
               break;
          default:
               msg = "?";
               break;
          }
          return msg;
     }

     /*
     * ��ǻ�Ͱ� �������� �߻���Ų �� 1���� 3����
     */
     public int displayComValue() { // ��ǻ�� ����������
          int comValue = (int) ((Math.random() * 3) + 1);
          showComValue(comValue);
          return comValue;
     }

     public String showComValue(int comValue) {
          String msg = "";
          switch (comValue) {
          case 1:
               msg = "����";
               break;
          case 2:
               msg = "����";
               break;
          case 3:
               msg = "��";
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
      * ���ڸ� �����ִ� ����
      */
     public int showWinner(int playerValue, int comValue) {
          int winner = 3;
          // 0�� ���, 1�� �÷��̾� �̱�, 2�� ��ǻ�� �̱�
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