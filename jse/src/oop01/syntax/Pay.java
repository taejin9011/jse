package oop01.syntax;

import java.util.Scanner;

public class Pay {
	String name;
	int salary;
	static final double TAX = 0.1;
	
	public static void main(String[] args) {
		
		Pay pay = new Pay();
		double tax = 1-TAX;
		
		pay.name = "��ũ"; 	pay.salary = 300;
		System.out.println("==="+pay.name+"�� 5���� �Ǳ޿���"+(int)(pay.salary*tax)+"���� �Դϴ�.");
		
		pay.name = "���̾�";  pay.salary = 500;
		System.out.println("==="+pay.name+"�� 5���� �Ǳ޿��� "+(int)(pay.salary*tax)+"���� �Դϴ�.");
		
		pay.name = "�丣";  pay.salary = 100;
		System.out.println("==="+pay.name+"�� 5���� �Ǳ޿��� "+(int)(pay.salary*tax)+"���� �Դϴ�.");
	}
}