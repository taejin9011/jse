package oop05.polymorphism;

public class NumberMatchServiceImpl implements NumberMachService {

	//
	boolean match;
	@Override
	public int makeComVal() {
		return (int)(Math.random() * 2);
	}
	
	@Override
	public boolean Match(int playVal, int comVal) {
		
		System.out.print("�÷��̾�: ");
		System.out.println(playVal%2==0?"¦":"Ȧ");
		System.out.print("�� ǻ ��: ");
		System.out.println(comVal==0?"¦":"Ȧ");
		match = playVal%2==comVal ? true : false;
		return match;
	}
	
	@Override
	public String display() {
		String msg=""; 
		
		if(match){
			 msg="�÷��̾� �¸�";
		 }else{
			 msg="�÷��̾� �й�";
		 }
		 return msg;
	}
}
