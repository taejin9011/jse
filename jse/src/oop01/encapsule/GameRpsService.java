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
 ���ڰ��� ���� ���������� ���� ����
  */
	GameRpsVO controller = new GameRpsVO();
	
	public String showComValue() {
		int comValue = (int)((Math.random() * 3) + 1);
		
		return "";
	}

	public String playerValue(int playerValue) {   // �÷��̾� ����������
		String msg = "";  //���������� ������ �ʱ�ȭ �ؾߵ�
		switch (playerValue) {
		case 1: msg="����";  break;
		case 2: msg="����"; break;
		case 3: msg="��"; break; 
		default : msg="�ٽ��Է��ϼ���"; break;
		}
		return msg;
	}
	
	
	/*
	 ��ǻ�Ͱ� �������� �߻���Ų �� 1���� 3����
	  */
	public int displayComValue() {   // ��ǻ�� ����������
		int comValue = (int) ((Math.random()*3) +1);
		return comValue;
	}

	
	public int showRpsValue(int value) {
		if(Math.abs(3-1)==2){
			System.out.println("������ �̰���ϴ�.");
		}else if((2-1)==1){}
		return 0;
	}

	/*
	 ���ڸ� �����ִ� ����
	 */
	public String showWinner() {
		String winner = "";
		
		return winner;
	}


}
