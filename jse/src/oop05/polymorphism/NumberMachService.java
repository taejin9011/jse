package oop05.polymorphism;

public interface NumberMachService {
	/*
	 * ��ǻ�Ͱ� �������� �����ϴ� ����
	 * 0�� 1�� �߻���Ŵ
	 */
	 public int makeComVal();
	 
	 /*
	  * 2���� �Ķ���͸� ���ؼ� ��ġ�ϸ� true, 
	  * �ٸ��� false�� ���� 
	  */
	 public boolean Match(int playVal, int comVal);
	 
	 /*
	  * Match()�� ���ϰ��� true�� �÷��̾� �¸�
	  * �ٸ��� ��ǻ�� �¸� ��� �޽����� ���
	  */
	 public String display();
}
