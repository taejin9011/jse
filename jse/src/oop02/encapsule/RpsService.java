package oop02.encapsule;

public class RpsService {
	
	/*
	 컴퓨터가 랜덤으로 발생시킨 수 1 ~ 3까지 
	 */
	public int displayComVal() {
		return (int)((Math.random()*3)+1);
	}
	/*
	  승자를 보여주는 로직
	 */
	public String showWinner(int play, int com) {
		String msg=""; 
       switch (play-com) {
       case 0: msg="비겼습니다."; break;
       case 1:case-2: msg="이겼습니다."; break;
       default: msg="졌습니다."; break;
		}
	return msg;
	}
	
	// 숫자에 할당된 가위바위보를 문자로 전환해서 보여주는 역할
	public String showRpsVal(int playerVal){
		RpsUtil util = new RpsUtil();
		String msg = "";
		switch (playerVal) {
		case 1:
			msg = "가위";
			break;
		case 2:
			msg = "바위";
			break;
		case 3:
			msg = "보자기";
			break;
		default:
			util.showRange(1, 3);
			break;
		}
		return msg;
	}

}
