package oop01.encapsule;

import java.util.Scanner;

public class PayController {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
				
		String name; // �Է�
		int salary;  // �Է�
		double income = 0;
		
		/*
		   ����..
		 	income = salary - tax;
		 	
		 	PayVO : getter, setter
		 	PayService : ������
		 	PayController : ����¸� ����
		 	�̸��� �޿��� �Է� �޾Ƽ�
			���� �A �� �ҵ��� ���ϴ� ����
		 */

		
		PayService service = new PayService();
		
		System.out.println("�̸��� �Է� �ϼ���.");
		name = scanner.next();
		System.out.println("������ �Է� �ϼ���.");
		salary = scanner.nextInt();
		
		
		
		
		System.out.println("===== �޿����� ====");
		System.out.println("���� : " + name);
		System.out.println("���� : " + salary);
		System.out.println("���� : " + service.showTax());		
		System.out.println("�Ǽ��ɾ� : "+service.inputSalary(name, salary) );
	}
}
