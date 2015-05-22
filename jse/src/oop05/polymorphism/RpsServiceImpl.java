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
	       case 0: msg="�����ϴ�."; break;
	       case 1:case-2: msg="�̰���ϴ�."; break;
	       default: msg="�����ϴ�."; break;
			}
		return msg;
	}

	@Override
	public String showRpsVal(int Value) {
		String msg = "";
		switch (Value) {
		case 1: msg = "����"; break;
		case 2: msg = "����"; break;
		case 3: msg = "���ڱ�"; break;
		default: break;
		}
		return msg;
	}

}
