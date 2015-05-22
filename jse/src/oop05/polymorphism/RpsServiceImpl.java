package oop05.polymorphism;

public class RpsServiceImpl implements RpsService{
	//
	int comVal;
	
	@Override
	public int displayComVal() {
		comVal =(int)((Math.random()*3)+1);
		return comVal;
	}

	@Override
	public String showWinner(int play, int com) {
		String msg=""; 
	       switch (play-com) {
	       case 0: msg="비겼습니다."; break;
	       case 1:case-2: msg="이겼습니다."; break;
	       default: msg="졌습니다."; break;
			}
		return msg;
	}

	@Override
	public String showRpsVal(int Value) {
		String msg = "";
		switch (Value) {
		case 1: msg = "가위"; break;
		case 2: msg = "바위"; break;
		case 3: msg = "보자기"; break;
		default: break;
		}
		return msg;
	}

}
