package oop01.encapsule;

public class NumberMatchService {
     public int game(int com, int player) {
         
          int result;
          if (player == com) {
                   
               System.out.println(player + " 정답!!");
               result = 1;
          } else {
               System.out.println("틀렸습니다.");
               System.out.println("컴퓨터가 선택한 값은 " + com + " 입니다.");
               result = 0;
          }  
          return result;
     }
}