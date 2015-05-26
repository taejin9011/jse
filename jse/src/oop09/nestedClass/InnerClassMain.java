package oop09.nestedClass;

public class InnerClassMain {  
	public static void main(String[] args) {
		InnerClassMain m = new InnerClassMain();
//		m.getInnerClassInstance();
//		m.getInnerClassLocal();
		m.getInnerClassStatic();
		m.getInnerClassAnonyServiceImpl();
	}

	public void getInnerClassAnonyServiceImpl() {  // Anonymouse
		InnerClassAnonyServiceImpl inn = new InnerClassAnonyServiceImpl();
		inn.print();
	}

	public void getInnerClassStatic() {  // Static
		InnerClassStatic.Inner inn = new InnerClassStatic.Inner();   // 클래스 생성자로 바로 접근 
		inn.prinData();
	}

	public void getInnerClassLocal() {  // Local
		InnerClassLocal outer = new InnerClassLocal();
		outer.innerTest(1000);
	}

	// Ctrl + Shift + m : 메소드 독립 단축키
	// 리펙토링
	public void getInnerClassInstance() {  // Instance
		InnerClassInstance.Inner inn = new InnerClassInstance().new Inner();    //외부 생성자가 내부 생성자에 접근 
		inn.printData();
	}
}
