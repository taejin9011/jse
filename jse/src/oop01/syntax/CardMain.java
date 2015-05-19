package oop01.syntax;

public class CardMain {
	public static void main(String[] args) {
		
		System.out.println("카드 높이 : " + CardVO.height);
		System.out.println("카드 너비 : " + CardVO.width);
		
		// 인스턴스 생성해서 아래 결과 처럼
		// 출력하시오.
		CardVO vo1 = new CardVO("하트",3);
		CardVO vo2 = new CardVO("스페이스",5);  //이경우에 setter는 안만들어도 됨 
		
		
		System.out.println("플레이어는"+ vo1.toString()+" 이고 ");
		System.out.println("컴퓨터가"+ vo2.toString() +" 라서"
		+ " 컴퓨터 이겼습니다.");
	}
}
