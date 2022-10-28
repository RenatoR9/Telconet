package algoritmos;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		//creamos la primera entrada que es el numero que se va a comparar
		Scanner lectura = new Scanner (System.in);		
		System.out.println("Ingrese un numero entero: ");
		int numero = lectura.nextInt();
		
		// la segunda entrada que es el limite para que se genere el fibonacci		
		System.out.println("Ingrese limite: ");
		int limite = lectura.nextInt();
		
		//declaramos 2 numeros que van a se tomados como valores iniciales
		int num1 = 0;
        int num2 = 1;
        int numfibo = 0;  // este es el numero que se va a comparar con el de la entrada numero     
        boolean isFibonacci=false;
        
         //hacemos el primer calculo
        numfibo=num1+num2;
        while ( numfibo <= limite) {    //mientras el numero no llegue al limite seguimos calculando    	
        	numfibo=num1+num2;// hacemos la operacion interna
        	System.out.println("numfibo es "+numfibo);
            if(numfibo==numero) {// si el numero fibo de la operacon coincide con el de la entrada entonces si es fibo
            	isFibonacci=true; 
            	System.out.println("EL NUMERO ES FIBONACCI");
            	return;
            }else {// caso contrario no es y le damos falso a la variable
            	isFibonacci=false;  
            }
            
            num1=num2;// el segundo numero pasa a ser el primero
            num2=numfibo;// el resultado del fibo pasa al numero 2 
            //asi es como se calcula la serie del fibonacci
        }
        
        if(isFibonacci==false) {
       System.out.println("NO ES FIBONACCI");

	}
}
}
