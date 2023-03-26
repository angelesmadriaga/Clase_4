package traerclase3;

public class Clase3_anterior {
	String nom = ""; 
	int a = 0;
	int i = 0 ;
	int i2 = 0;
	public Clase3_anterior(String S1){
	
	this.nom = S1;
		i2 = nom.length();
	
	
	 for (i = 0 ; i < i2 ; i++) {
		 if(nom.charAt(i)=='a') {
			 
			 a = a + 1 ;
		 
		 }
	
		 
	 }
	System.out.println("  la cantidad de letras a es :   "  + a);
	
	
		
	
		
	}
}
