package oop01.syntax;

public class AverageD {
	public static void main(String[] args) {
	
	AverageService hulk = new AverageService();

	String name = "ÇæÅ©";
	int kor = 100;
	int eng = 55;
//	int tot = hulk.getKor() + hulk.getEng();
//	double avg = tot / 2d;
	
	hulk.User(name, kor, eng);
	
	System.out.println("==="+name+"ÀÇ ¼ºÀûÇ¥===");
	System.out.println("±¹¾î : "+kor);
	System.out.println("¿µ¾î : "+eng);
	System.out.println("ÃÑÁ¡ : "+hulk.tot());
	System.out.println("Æò±Õ : "+hulk.avg());
	System.out.println();
	}
}
