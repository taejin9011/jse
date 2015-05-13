package cmm04_array;

//전체적으로 공유할 때에는 클래스 변수
public class No03_ForLoopArrayVO {

	private int a,b,c,d,e;  // 멤버변수
 	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}

	public int getD() {
		return d;
	}
	public void setD(int d) {
		this.d = d;
	}

	public int getE() {
		return e;
	}
	public void setE(int e) {
		this.e = e;
	}
	
	void vo(int a, int b, int c, int d, int e){
	
	setA(a);
	setB(b);
	setC(c);
	setD(d);
	setE(e);
	
	int[] arr = {getA(), getB(), getC(), getD(), getE()};
	int sum = 0;
	
	// 입력 받은 5개의 숫자의 합을 구하시오.
	
	System.out.println("1부터 5까지의 요소를 출력하고..");
	for(int i  : arr){  
		System.out.println("\t" +i);
	}
	
	
	for(int i=0; i<arr.length; i++){
		sum += arr[i];
	}				
	System.out.println("1부터 5까지의 합 : " + sum);  
	}

}

