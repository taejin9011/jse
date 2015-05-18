package oop01.syntax;

public class AverageE {
	public static void main(String[] args) {
		
		String name = "ÇæÅ©";
		int kor = 100;
		int eng = 55;
		AverageEVO evo = new AverageEVO(name, kor, eng);
		
		System.out.println("==="+name+"ÀÇ ¼ºÀûÇ¥===");
		System.out.println("±¹¾î : "+kor);
		System.out.println("¿µ¾î : "+eng);
		System.out.println("ÃÑÁ¡ : "+evo.tot());
		System.out.println("Æò±Õ : "+evo.avg());
		System.out.println();
	}
}
