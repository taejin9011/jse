package oop09.nestedClass;

public class InnerClassAnonyServiceImpl{

	String data = "Hello Anonymous !!";
	public void print(){
		
		//이름이 없는 생성자..     
		new InnerClassAnonyService() {   // 한번사용하기 위해서 사용
			
			@Override
			public void printData() {
				System.out.println("익명 내부클래스 출력: " + data);
			}
		}.printData();  // 생성자를 바로 실행하라..
		
	}
}
