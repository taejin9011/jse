package oop01.syntax;

import java.util.Scanner;

public class Pay {
	String name;
	int salary;
	static final double TAX = 0.1;
	
	public static void main(String[] args) {
		
		Pay pay = new Pay();
		double tax = 1-TAX;
		
		pay.name = "헐크"; 	pay.salary = 300;
		System.out.println("==="+pay.name+"의 5월달 실급여는"+(int)(pay.salary*tax)+"만원 입니다.");
		
		pay.name = "아이언";  pay.salary = 500;
		System.out.println("==="+pay.name+"의 5월달 실급여는 "+(int)(pay.salary*tax)+"만원 입니다.");
		
		pay.name = "토르";  pay.salary = 100;
		System.out.println("==="+pay.name+"의 5월달 실급여는 "+(int)(pay.salary*tax)+"만원 입니다.");
	}
}