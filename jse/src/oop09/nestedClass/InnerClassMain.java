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
		InnerClassStatic.Inner inn = new InnerClassStatic.Inner();   // Ŭ���� �����ڷ� �ٷ� ���� 
		inn.prinData();
	}

	public void getInnerClassLocal() {  // Local
		InnerClassLocal outer = new InnerClassLocal();
		outer.innerTest(1000);
	}

	// Ctrl + Shift + m : �޼ҵ� ���� ����Ű
	// �����丵
	public void getInnerClassInstance() {  // Instance
		InnerClassInstance.Inner inn = new InnerClassInstance().new Inner();    //�ܺ� �����ڰ� ���� �����ڿ� ���� 
		inn.printData();
	}
}
