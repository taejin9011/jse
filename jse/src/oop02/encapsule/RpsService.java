package oop02.encapsule;

public class RpsService {
	
	/*
	 ��ǻ�Ͱ� �������� �߻���Ų �� 1 ~ 3���� 
	 */
	public int displayComVal() {
		return (int)((Math.random()*3)+1);
	}
	/*
	  ���ڸ� �����ִ� ����
	 */
	public String showWinner(int play, int com) {
		String msg=""; 
       switch (play-com) {
       case 0: msg="�����ϴ�."; break;
       case 1:case-2: msg="�̰���ϴ�."; break;
       default: msg="�����ϴ�."; break;
		}
	return msg;
	}
	
	// ���ڿ� �Ҵ�� ������������ ���ڷ� ��ȯ�ؼ� �����ִ� ����
	public String showRpsVal(int playerVal){
		RpsUtil util = new RpsUtil();
		String msg = "";
		switch (playerVal) {
		case 1:
			msg = "����";
			break;
		case 2:
			msg = "����";
			break;
		case 3:
			msg = "���ڱ�";
			break;
		default:
			util.showRange(1, 3);
			break;
		}
		return msg;
	}

}
