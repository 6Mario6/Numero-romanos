package main;

public class Romano {
	String one[]    ={ "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"}; 
	String basicSymbolRoman[] = {"M","CM","D","CD","C","XC", "L","XL","X","IX","V","IV","I"};
	 int basicSymbolInteger[] = {1000, 900, 500, 400, 100, 90,50, 40, 10, 9, 5, 4, 1};

	public  String convertIntegerToRoman(int value){
		
		//Solo numeros del 1 al 1000
		if(value <1 || value >1000){
			return "Ingrese un numero enter 1 y 1000";
		}
		//Si el valor es menor que 10, se retorna directamente los valores del vector one
		if(value<10){
			return one[value-1];
		}
		String result = "";
		//Recorre todo el arreglo de simbolos basicos
	      for (int i = 0; i < basicSymbolInteger.length; i++)
	    	 //Mientras el valor ingresado sea mayor o igual que los valores del vector 
	    	  //de enteros de simbolos basicos.
	         while (value >= basicSymbolInteger[i]) {
	        	 
	        	result= result + basicSymbolRoman[i];//Se concatena el simbolo en result
	            value = value - basicSymbolInteger[i];//Se resta los valores menores que value
	         }
	      	return result;
     	
	}
	public static void main(String[] args) {
		Romano r= new Romano();
		for(int i=1;i<=1000;i++){
			String ans =r.convertIntegerToRoman(i);
			System.out.println(ans);
		}
		
	}
}
