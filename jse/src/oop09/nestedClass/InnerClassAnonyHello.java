package oop09.nestedClass;

public class InnerClassAnonyHello {
	interface GreetingService{
		public void greet(String name);
	}
	public void sayHello(){
		/*
		 * ����Ŭ���� �������̽� �������1
		 */
		class EnglishGreetingServiceImpl implements GreetingService{  //eclipse�� ���� ����

			@Override
			public void greet(String name) {
				System.out.println("Hello " + name);
			}
		}
		GreetingService eng = new EnglishGreetingServiceImpl();
		
		
		/*
		 * ����Ŭ���� �������̽� ����2   (�̰� ���� �����)
		 */
		GreetingService kor = new GreetingService() {
			
			@Override
			public void greet(String name) {
				System.out.println("�ȳ��ϼ���. "+name);
			}
		};
		eng.greet("Tom");
		kor.greet("��");
	}
	public static void main(String[] args) {  // ���θ޼ҵ忡 ���� �ۼ����� �ʾƵ� InnerŬ������ ���ؼ� ���
		InnerClassAnonyHello greet = new InnerClassAnonyHello();
		greet.sayHello();
	}
}
