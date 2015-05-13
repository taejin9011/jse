package cmm04_array;

import java.util.Scanner;

public class No03_ForLoopArrayDemo {
	public static void main(String[] args) {
		No03_ForLoopArrayVO flav = new No03_ForLoopArrayVO();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("5개 숫자를 입력 하세요 ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int d = scanner.nextInt();
		int e = scanner.nextInt();
		
		flav.vo(a, b, c, d, e);
	}
}