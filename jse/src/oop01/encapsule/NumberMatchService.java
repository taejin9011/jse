package oop01.encapsule;

public class NumberMatchService {
     public int game(int com, int player) {
         
          int result;
          if (player == com) {
                   
               System.out.println(player + " ����!!");
               result = 1;
          } else {
               System.out.println("Ʋ�Ƚ��ϴ�.");
               System.out.println("��ǻ�Ͱ� ������ ���� " + com + " �Դϴ�.");
               result = 0;
          }  
          return result;
     }
}