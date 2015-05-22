package oop05.polymorphism;


public class KaupServiceImpl implements KaupInterface{
	
	//
	int idx;  // <- �̰� �ٽ�

	@Override
	public int getKaupIndex(double height, double weight) {
		idx = (int)((weight / (height * height)) * 10000);
		return idx;
	}

	@Override
	public String getResultMsg() {
		String msg = "";
		if (idx > 30) {
			msg = "��";
		} else if (idx > 24) {
			msg = "��ü��";
		} else if (idx > 20) {
			msg = "����";
		} else if (idx > 15) {
			msg = "��ü��";
		} else if (idx > 13) {
			msg = "����";
		} else if (idx > 10) {
			msg = "�������";
		} else {
			msg = "�Ҹ���";
		}		
		return "ī��������: "+this.idx+"/"+msg;
	}

}
