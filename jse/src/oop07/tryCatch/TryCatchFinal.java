package oop07.tryCatch;
/*
 ...finally..
 ���� �߻� ���ο� �������
 �ݵ�� ����Ǵ� ����
 */
public class TryCatchFinal {
	public static void main(String[] args) {
		/* try{}catch(){}finally */
		try{
			System.out.println("�޼ҵ� ���� ��..");
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			System.out.println("finally ���� ��..");
		}
	}
}
