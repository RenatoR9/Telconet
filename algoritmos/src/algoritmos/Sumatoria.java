package algoritmos;

import java.util.ArrayList;
import java.util.Iterator;

public class Sumatoria {

	public static void main(String[] args) { 
		Integer resultadoSuma=0;// para el resultado final de la suma de todos los numeros anidados
		int[] numeros1 = {0, 1, 4, 10};
		int[] numeros2 = {2, 4, 3, 10};
		int[] numeros3 = {5, 7, 6, 10};// arreglos inicializados con valores enteros
		
		//array o nodo principal que va a contener numeros y arrays dentro del mismo para ello
		// se inicializa este array principal como objeto
		 ArrayList<Object> principal  =new ArrayList<>();
		 principal.add(1);
		 principal.add(2);//agregamos numeros 
		 principal.add(3);
		 principal.add(numeros1);
		 principal.add(numeros2);
		 principal.add(numeros3);// y agregamos arrays de numeros
		 
		 //usamos un iterator para acceder a los objetos
		 Iterator<Object> iterador = principal.iterator();
		 while(iterador.hasNext()){
		 	Object elemento = iterador.next();	// accedemos elemento por elemento		 	
		 	
		 	// preguntamos si el elemento es numerico pero para ello convertimos primero a string
		 	boolean isNumeric = (elemento.toString() != null && elemento.toString().matches("[0-9]+"));
		 	if(isNumeric) {
		 		//si es numerico sumamos
		 		resultadoSuma=resultadoSuma+Integer.parseInt(elemento.toString());
		 	}else {		 		
		 		//caso contrario pasamos el elemento a un array de enteros yhacemos la suma
		 		int numeros[] = (int[]) elemento;
		 		for(int i=0;i<numeros.length;i++) {
		 			resultadoSuma=resultadoSuma+numeros[i];		 			
		 		}
		 		
		 	}	 	
		 	
		 }
		 System.out.print("suma total es : "+resultadoSuma);

	}

}
