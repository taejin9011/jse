package oop01.syntax;



public class AverageEVO {
	private String name;
	private int kor;
	private int eng;
	//getter setter를 사용하지 말고 
	//생성자로 처리
	//단, avg()와 tot()은 작성하기
	
	public  AverageEVO(){} // 디폴트 생성자 직접 작성
	
	public AverageEVO(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}
	public int tot() {
		int tot = kor + eng;
		return tot;
	}
	public double avg(){
		double avg = tot() / 2d;
		return avg;
	}
	
}
