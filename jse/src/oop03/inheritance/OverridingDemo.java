package oop03.inheritance;
/*
 Method Overriding 
 - ��Ӱ��迡�� Parent�� ����� �޼ҵ带 Child���� �ٽ� ������ ���
 - �̷� ��� Parent�� �޼ҵ�� ���õ�
 - ���� �޼ҵ尡 Parent�� Child���� ��� ���� �Ǿ����� ������ �ٸ�
 - Ŭ������ �������� ������ �� ����
 - Parent�� Child ���� �޼ҵ��� ����(�޼ҵ��, �Ķ���� ����, �Ķ���� ������ Ÿ��)��
   ���ƾ� ��
 - Parent�� �޼ҵ带 ������ֳ� Child�� �ڽ��� ������ �޼ҵ带 �켱 ���.
 - Parent�� �޼ҵ带 ����� �����ϸ鼭 ��Ȳ�� ���� Child�� ������
 - ����� ����ϰ� ���� ��쿡 ����ϸ� ������ ������ �ٽɿ���.
 - Parent�� �޼ҵ带 ĸ��ȭ�Ѵٰ� �� �� �ִ�.
 - Parent�� ������� ���ִ� ���� �ƴ϶�, 
 - �����ϸ鼭 ���ο� ������� ��ü�Ϸ��� �������� ���
 */
public class OverridingDemo {
	/*
	 Parent�� show()�� Child�� 
	 show() ������ �����Ƿ� �������̵��̴�.
	 */
	public static void main(String[] args) {
		
		ChildB c = new ChildB();
		c.show();
	}
}
class ParentB{
	void show(){
		System.out.println("Parent show() ����");
	}
}
class ChildB extends ParentB{  //ChildB�� ParentB�� ����� �����

	@Override
	void show() {
		super.show();
		System.out.println("Child show() ����");
	}

}