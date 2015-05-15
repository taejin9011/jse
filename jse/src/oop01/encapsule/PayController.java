package oop01.encapsule;

import java.util.Scanner;

public class PayController {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
				
		String name; // 입력
		int salary;  // 입력
		double income = 0;
		
		/*
		   공식..
		 	income = salary - tax;
		 	
		 	PayVO : getter, setter
		 	PayService : 계산로직
		 	PayController : 입출력만 존재
		 	이름과 급여는 입력 받아서
			세율 뺸 실 소득을 구하는 로직
		 */

		
		PayService service = new PayService();
		
		System.out.println("이름을 입력 하세요.");
		name = scanner.next();
		System.out.println("본봉을 입력 하세요.");
		salary = scanner.nextInt();
		
		
		
		
		System.out.println("===== 급여내역 ====");
		System.out.println("성명 : " + name);
		System.out.println("본봉 : " + salary);
		System.out.println("세율 : " + service.showTax());		
		System.out.println("실수령액 : "+service.inputSalary(name, salary) );
	}
}
