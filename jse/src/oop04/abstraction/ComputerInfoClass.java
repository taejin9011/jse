package oop04.abstraction;

public class ComputerInfoClass extends ProducInfoClass{
	private String cpu;
	private String ram;
	private String hdd;
	
	public void displayInfo(){
		/*
		 * ProductInfoClass �� �ִ� 
		 * �⺯�� private �̹Ƿ� ������ �Ұ����մϴ�.
		 * ���� �߻�Ŭ������ protected ����
		 * ���� �����ߴµ� ������ private���� ��������.
		 * �׷��� �⺯�� ���� ������ü�� �θ� �ִ�
		 * displayInfo() �� ȣ���ؼ� ó���մϴ�.
		 */
		
		super.displayInfo();
		System.out.println("cpu : "+this.cpu);
		System.out.println("ram : "+this.ram);
		System.out.println("hdd : "+this.hdd);
	}
	public void setInfo(String company, String name, 
			String sid, String cpu, String ram, String hdd){
		/*
		 * �Ķ���ͷ� �Ѿ�� ���鵵 �ٷ� super��
		 * ���� �θ� �޼ҵ��� �Ķ���ͷ� ������
		 * �ٷ� set�մϴ�.
		 * ��.. �⺯�� ������ �θ��ڽ� ���迡��
		 * �����ϹǷ�, �θ��� �⺯�� ���� ����
		 * ���� ������ �����ϴ�.
		 */
		super.setInfo(company, name, sid);
		this.cpu = cpu;
		this.ram = ram;
		this.hdd = hdd;
	}
}
