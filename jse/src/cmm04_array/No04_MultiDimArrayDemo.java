package cmm04_array;

public class No04_MultiDimArrayDemo {
	public static void main(String[] args) {
		String[][] names = {
			{"Mr.","Mrs.","Ms."},
		 	{"Smith","John"}
		};
		/*
		 *  Mr.Smith
		 *  Ms.John ���� ��� ��Ű����.
		 * 
		 * */
		System.out.println(names[0][0]+names[1][0]);  //Mr.Smith
		System.out.println(names[0][2]+names[1][1]); //Ms.John
	}
}
