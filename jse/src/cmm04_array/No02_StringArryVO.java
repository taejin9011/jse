package cmm04_array;

public class No02_StringArryVO {
	
	public void ju(){
		String[] juso = new String[3];
		juso[0] = "서울";
		juso[1] = "종로";
		juso[2] = "광화문";
		
		for(int i=0; i<juso.length; i++){
			System.out.print(juso[i]+" ");
		}
	}
}