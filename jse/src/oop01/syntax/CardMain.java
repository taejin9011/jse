package oop01.syntax;

public class CardMain {
	public static void main(String[] args) {
		
		System.out.println("ī�� ���� : " + CardVO.height);
		System.out.println("ī�� �ʺ� : " + CardVO.width);
		
		// �ν��Ͻ� �����ؼ� �Ʒ� ��� ó��
		// ����Ͻÿ�.
		CardVO vo1 = new CardVO("��Ʈ",3);
		CardVO vo2 = new CardVO("�����̽�",5);  //�̰�쿡 setter�� �ȸ��� �� 
		
		
		System.out.println("�÷��̾��"+ vo1.toString()+" �̰� ");
		System.out.println("��ǻ�Ͱ�"+ vo2.toString() +" ��"
		+ " ��ǻ�� �̰���ϴ�.");
	}
}
