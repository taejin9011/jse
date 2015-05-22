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
		
		System.out.print("ÇÃ·¹ÀÌ¾î: ");
		System.out.println(playVal%2==0?"Â¦":"È¦");
		System.out.print("ÄÄ Ç» ÅÍ: ");
		System.out.println(comVal==0?"Â¦":"È¦");
		match = playVal%2==comVal ? true : false;
		return match;
	}
	
	@Override
	public String display() {
		String msg=""; 
		
		if(match){
			 msg="ÇÃ·¹ÀÌ¾î ½Â¸®";
		 }else{
			 msg="ÇÃ·¹ÀÌ¾î ÆÐ¹è";
		 }
		 return msg;
	}
}
