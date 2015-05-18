package oop01.syntax;

public class AverageC {
	public static void main(String[] args) {
		AverageVO hulk = new AverageVO();
		
		hulk.setName("ÇæÅ©");
		hulk.setKor(100);
		hulk.setEng(15);
		
//		int tot = hulk.getKor() + hulk.getEng();
//		double avg = tot / 2d;
		
		System.out.println("==="+hulk.getName()+"ÀÇ ¼ºÀûÇ¥===");
		System.out.println("±¹¾î : "+hulk.getKor());
		System.out.println("¿µ¾î : "+hulk.getEng());
		System.out.println("ÃÑÁ¡ : "+hulk.tot());
		System.out.println("Æò±Õ : "+hulk.avg());
		System.out.println();
	}
}
