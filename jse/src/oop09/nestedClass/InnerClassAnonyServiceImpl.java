package oop09.nestedClass;

public class InnerClassAnonyServiceImpl{

	String data = "Hello Anonymous !!";
	public void print(){
		
		//�̸��� ���� ������..     
		new InnerClassAnonyService() {   // �ѹ�����ϱ� ���ؼ� ���
			
			@Override
			public void printData() {
				System.out.println("�͸� ����Ŭ���� ���: " + data);
			}
		}.printData();  // �����ڸ� �ٷ� �����϶�..
		
	}
}
