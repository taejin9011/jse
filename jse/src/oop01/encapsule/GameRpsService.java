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
 숫자값에 따른 가위바위보 결정 로직
  */
	GameRpsVO controller = new GameRpsVO();
	
	public String showComValue() {
		int comValue = (int)((Math.random() * 3) + 1);
		
		return "";
	}

	public String playerValue(int playerValue) {   // 플레이어 가위바위보
		String msg = "";  //지역변수는 무조건 초기화 해야됨
		switch (playerValue) {
		case 1: msg="가위";  break;
		case 2: msg="바위"; break;
		case 3: msg="보"; break; 
		default : msg="다시입력하세요"; break;
		}
		return msg;
	}
	
	
	/*
	 컴퓨터가 랜덤으로 발생시킨 수 1부터 3까지
	  */
	public int displayComValue() {   // 컴퓨터 가위바위보
		int comValue = (int) ((Math.random()*3) +1);
		return comValue;
	}

	
	public int showRpsValue(int value) {
		if(Math.abs(3-1)==2){
			System.out.println("가위가 이겼습니다.");
		}else if((2-1)==1){}
		return 0;
	}

	/*
	 승자를 보여주는 로직
	 */
	public String showWinner() {
		String winner = "";
		
		return winner;
	}


}
