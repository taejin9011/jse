package cmm02.op;

public class No04_ConditionDemo {
	public static void main(String[] args) {
		int val01 = 1;
		int val02 = 2;

		if((val01 == 1) && (val02 == 2)){  // ()를 Condition이라고 함
			System.out.println("val01은 1, var02는 2 입니다.");
		}  
		if((val01 != 1) || (val02 != 2)){
			System.out.println("1번값과 2번값은 다릅니다.");
		}		
	}
}
