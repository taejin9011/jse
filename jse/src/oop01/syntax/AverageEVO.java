package oop01.syntax;



public class AverageEVO {
	private String name;
	private int kor;
	private int eng;
	//getter setter�� ������� ���� 
	//�����ڷ� ó��
	//��, avg()�� tot()�� �ۼ��ϱ�
	
	public  AverageEVO(){} // ����Ʈ ������ ���� �ۼ�
	
	public AverageEVO(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}
	public int tot() {
		int tot = kor + eng;
		return tot;
	}
	public double avg(){
		double avg = tot() / 2d;
		return avg;
	}
	
}
