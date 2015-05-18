package oop01.syntax;

public class AverageA {
	String name;
	int kor;
	int eng;

	public static void main(String[] args) {
		// tot, avg 지역변수를 선언 하고 
		// 아래와 같이 출력되도록 하시오.
		//하드코딩으로
		AverageA hulk = new AverageA();
		hulk.name = "헐크";
		hulk.kor = 100;
		hulk.eng = 75;
		
		AverageA iron = new AverageA();
		iron.name = "아이언";
		iron.kor = 90;
		iron.eng = 50;
		
		AverageA thor = new AverageA();
		thor.name = "토르";
		thor.kor = 50;
		thor.eng = 95;
		
		int hulkSum = hulk.kor + hulk.eng ;
		double hulkAvg = (double)hulkSum / 2;
		
		System.out.println("==="+hulk.name+"의 성적표===");
		System.out.println("국어 : "+hulk.kor);
		System.out.println("영어 : "+hulk.eng);
		System.out.println("총점 : "+hulkSum);
		System.out.println("평균 : "+hulkAvg);
		System.out.println();
		
		int ironSum = iron.kor + iron.eng ;
		double ironAvg = ironSum / 2d;
		
		System.out.println("==="+iron.name+"아이언의 성적표===");
		System.out.println("국어 : "+iron.kor);
		System.out.println("영어 : "+iron.eng);
		System.out.println("총점 : "+ironSum);
		System.out.println("평균 : "+ironAvg);
		System.out.println();
		
		int thorSum = thor.kor + thor.eng ;
		double thorAvg = thorSum / 2.0;
		
		System.out.println("==="+thor.name+"의 성적표===");
		System.out.println("국어 : "+thor.kor);
		System.out.println("영어 : "+thor.eng);
		System.out.println("총점 : "+thorSum);
		System.out.println("평균 : "+thorAvg);
		
	}
}
