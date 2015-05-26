package oop09.nestedClass;

public class InnerClassAnonyHello {
	interface GreetingService{
		public void greet(String name);
	}
	public void sayHello(){
		/*
		 * 내부클래스 인터페이스 구현방법1
		 */
		class EnglishGreetingServiceImpl implements GreetingService{  //eclipse에 없는 문법

			@Override
			public void greet(String name) {
				System.out.println("Hello " + name);
			}
		}
		GreetingService eng = new EnglishGreetingServiceImpl();
		
		
		/*
		 * 내부클래스 인터페이스 구현2   (이걸 많이 사용함)
		 */
		GreetingService kor = new GreetingService() {
			
			@Override
			public void greet(String name) {
				System.out.println("안녕하세요. "+name);
			}
		};
		eng.greet("Tom");
		kor.greet("톰");
	}
	public static void main(String[] args) {  // 메인메소드에 따로 작성하지 않아도 Inner클래스로 인해서 출력
		InnerClassAnonyHello greet = new InnerClassAnonyHello();
		greet.sayHello();
	}
}
