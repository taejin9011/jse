package oop01.syntax;
/*
  Date : 2015-05-19
  Desc : static ����
 */
public class CardVO {
	private String kind;  // ī���� ����
	private int number;  // ī���� ����
	static int width = 100; //ī���� ��
	static int height = 250; //ī���� ����
	
	CardVO(String kind, int num){
		this.kind = kind;
		this.number = num;
	}

	@Override
	public String toString() {
		return " "+ kind + " " + number ;
	}
}
