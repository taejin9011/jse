package oop01.encapsule;


import java.util.Scanner;

public class NumberMatchController {
     public static void main(String[] args) {
          NumberMatchVO vo = new NumberMatchVO();
          NumberMatchService vo1 = new NumberMatchService();
         
          System.out.println("�� 3ȸ�� �Է� �����մϴ�.");
          Scanner scanner = new Scanner(System.in);
         
          for(int i = 0; i < 3; i++){
               System.out.println("1���� 5���� ������ �Է��ϼ���.");
               int result = 0;
              
               try{
                    int input = scanner.nextInt();
                    vo.setPlayer(input);
               }catch(Exception e){
                    System.out.println("���ڴ� �ȵ˴ϴ�.");
               }
              
               if(vo.getPlayer()==0){
                    System.out.println("�ٽ� �Է��� �ֽʽÿ�.");
               } else {
                    vo.setCom();
                    result = vo1.game(vo.getCom(), vo.getPlayer());
                   
               }     if(result == 1){
                    System.out.println("������ϴ�.");
                    break;
               }
               if(i==2){
                    System.out.println("3ȸ ��� �����߽��ϴ�."+
                                        "\n���ӿ��� �й��߽��ϴ�."+"\n������ �����մϴ�.");
               }
          }
     }
}