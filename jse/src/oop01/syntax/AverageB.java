package oop01.syntax;

public class AverageB {
	String name;
	int kor;
	int eng;
	/*메소드를 여기에 정의해서 메소드의 객체화를 해주세요.*/
	
	int sum(){
		int sum = kor+eng;
		return sum;
	}
	
	double avg(){
		double avg = sum()/2d;
		return avg;
	}
	
	public static void main(String[] args) {
		AverageB hulk = new AverageB();
		
		
		hulk.name = "헐크";
		hulk.kor = 65;
		hulk.eng = 50;
				
		System.out.println("==="+hulk.name+"의 성적표===");
		System.out.println("국어 : "+hulk.kor);
		System.out.println("영어 : "+hulk.eng);
		System.out.println("총점 : "+hulk.sum());
		System.out.println("평균 : "+hulk.avg());
		System.out.println();
		
		

	}
}
