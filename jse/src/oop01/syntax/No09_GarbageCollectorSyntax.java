package oop01.syntax;
/*
 Garbage Collecting ������ �ݷ���
 - �ڹ� ������ �ڵ����� ������
 - ����޼ҵ� �ȿ��� ������ ��ü�� �޼ҵ� ����� ���� �޸𸮰� ȸ����
 - �⺯�� �޸� ȸ�� ������ ���� ��ġ�� ��
 - ������ ���� �ʴ� �޸� ����, System.gc()
 - �켱 ������ ���� ������� ����.
   �Ϲ����� ��� ��� �����尡 ����� �� ����
 - gc()�� �����ϸ� ������ �޸� ȸ�� �۾��� �ϰ� �Ǿ�
   finalize()�� ȣ��ȴ�. �׷��� gc() ��ü��
   ���� ���ϸ� �����ϹǷ� JVM�� �����ϵ��� ��
 */
public class No09_GarbageCollectorSyntax {
	public static void main(String[] args) {
		Garbage[] ga = new Garbage[10];
		// ��ü ����
		for(int i=0; i<ga.length; i++){
			ga[i] = new Garbage(10);
		}
		// ��ü �޸� ����
		for(int i=0; i<ga.length; i++){
			ga[i] = null; // �޸� ȸ�� ����� ��
		}
		// ������ �޸� ����
		System.gc();
	}
}
class Garbage{
	int objNo;
	public Garbage(int n){
		objNo = n;
		System.out.println("Gabage Class"+objNo+"�� �������..");
	}
	//��ü�� �޸� ȸ���� �� �ڵ����� ȣ���
	protected void finalize() throws Throwable{
		System.out.println("Gabage Class"+objNo+"���� ���̴� �޸𸮰� ȸ����..");
		super.finalize();
	}
}
