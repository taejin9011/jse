package oop05.polymorphism;

public interface NumberMachService {
	/*
	 * 컴퓨터가 랜덤으로 생성하는 숫자
	 * 0과 1만 발생시킴
	 */
	 public int makeComVal();
	 
	 /*
	  * 2개의 파라미터를 비교해서 일치하면 true, 
	  * 다르면 false를 리턴 
	  */
	 public boolean Match(int playVal, int comVal);
	 
	 /*
	  * Match()의 리턴값이 true면 플레이어 승리
	  * 다르면 컴퓨터 승리 라고 메시지를 출력
	  */
	 public String display();
}
