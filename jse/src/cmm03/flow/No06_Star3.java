package cmm03.flow;
/*
¡Ú¡Ú¡Ú¡Ú¡Ú
   ¡Ú¡Ú¡Ú¡Ú
      ¡Ú¡Ú¡Ú
         ¡Ú¡Ú
            ¡Ú
*/
public class No06_Star3 {
	public static void main(String[] args) {
		int a = 0, b = 0;
		//	¡Ú
			for(a=0;a<5;a++){
				for(b=0;b<5;b++){
					if(a>b){
					System.out.print("   ");		
				}else{
					System.out.print("¡Ú");
				}
			}
				System.out.println("");
		}
	}
}
