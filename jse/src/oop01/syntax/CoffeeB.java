package oop01.syntax;
/*
  생성자는 인스턴스가 생성될 때 
  호출 되는 '인스턴스 초기화 메서드' 이다.
 */
class MilkCoffee{
	
	
	public MilkCoffee(){
		this(500);
		System.out.println("돈을 넣다.");
	}
	public MilkCoffee(int money){
//		this();
		this(money, true);
		System.out.println(money+"원");
	}
	public MilkCoffee(int money, boolean exist){
//		this(money);
		System.out.println("구매가능여부 : "+(exist== true ? "커피종류선택" : "커피없음"));
	}
}

public class CoffeeB {
	public static void main(String[] args) {
		
	/* 
 돈을 넣다.
 500원
 구매가능여부 : 커피종류선택
 ...나오는데 생성자를 한번만 쓰세요.
 */
//	MilkCoffee a = new MilkCoffee(500, true);   순서대로 출력
	MilkCoffee mc = new MilkCoffee();   // 역순으로 출력

	
	// 인스턴스는 변하지 않는 주소값을 가진 참조(래퍼런스) 변수이다.
	// Type을 가지고 있는 클래스를 인스턴스라 한다.
	}
}