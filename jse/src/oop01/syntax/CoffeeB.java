package oop01.syntax;
/*
  �����ڴ� �ν��Ͻ��� ������ �� 
  ȣ�� �Ǵ� '�ν��Ͻ� �ʱ�ȭ �޼���' �̴�.
 */
class MilkCoffee{
	
	
	public MilkCoffee(){
		this(500);
		System.out.println("���� �ִ�.");
	}
	public MilkCoffee(int money){
//		this();
		this(money, true);
		System.out.println(money+"��");
	}
	public MilkCoffee(int money, boolean exist){
//		this(money);
		System.out.println("���Ű��ɿ��� : "+(exist== true ? "Ŀ����������" : "Ŀ�Ǿ���"));
	}
}

public class CoffeeB {
	public static void main(String[] args) {
		
	/* 
 ���� �ִ�.
 500��
 ���Ű��ɿ��� : Ŀ����������
 ...�����µ� �����ڸ� �ѹ��� ������.
 */
//	MilkCoffee a = new MilkCoffee(500, true);   ������� ���
	MilkCoffee mc = new MilkCoffee();   // �������� ���

	
	// �ν��Ͻ��� ������ �ʴ� �ּҰ��� ���� ����(���۷���) �����̴�.
	// Type�� ������ �ִ� Ŭ������ �ν��Ͻ��� �Ѵ�.
	}
}