package oop05.polymorphism;


public class KaupServiceImpl implements KaupInterface{
	
	//
	int idx;  // <- 이게 핵심

	@Override
	public int getKaupIndex(double height, double weight) {
		idx = (int)((weight / (height * height)) * 10000);
		return idx;
	}

	@Override
	public String getResultMsg() {
		String msg = "";
		if (idx > 30) {
			msg = "비만";
		} else if (idx > 24) {
			msg = "과체중";
		} else if (idx > 20) {
			msg = "정상";
		} else if (idx > 15) {
			msg = "저체중";
		} else if (idx > 13) {
			msg = "마름";
		} else if (idx > 10) {
			msg = "영양실조";
		} else {
			msg = "소모증";
		}		
		return "카우프지수: "+this.idx+"/"+msg;
	}

}
