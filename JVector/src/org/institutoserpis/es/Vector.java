package org.institutoserpis.es;

import java.util.Scanner;

public class Vector {

	public static void main(String[] args) {

		Scanner tcl = new Scanner(System.in);
		System.out.println("Introduzca el valor a buscar:");
		int num1 = tcl.nextInt();
		tcl.close();
		int[] array1=new int [] {16,12,15,14,17,num1};
		int[] array1WithOutCentinel=new int [] {16,12,15,14,17};
		System.out.println("El indice del valor es: "+index_Of(array1,num1));
		System.out.println("El número más pequeño del array es: "+min(array1));
		System.out.println("La posición del número mas pequeño en el array es: "+minPosition(array1));
		ordenarArray(array1WithOutCentinel);
		sort(array1WithOutCentinel);
	}
	static int index_Of(int[] array, int num){
		int index=0;
		while(array[index]!=num) 
			index++;
		if (index == array.length-1) 
			return -1;
		return index;	
	}
	static void ordenarArray(int [] unorderedArray) {
//		//Quito el centinela
//		int [] unorderedArray2 = new int [unorderedArray.length-1];
//		for(int i = 0; i < unorderedArray.length-1;i++) {
//			unorderedArray2[i]=unorderedArray[i];
//		}
		//Ordeno el array en otro array
		int [] orderedArray= new int[unorderedArray.length];
		int menorNumero=0;
		if(unorderedArray.length > 0) 
			menorNumero=min(unorderedArray);
		//{12,27,26,27}
		for(int i = 1; i<=unorderedArray.length; i++) {
			int maxPosition = maxPosition(unorderedArray);
			orderedArray[unorderedArray.length-i]=unorderedArray[maxPosition];
			unorderedArray[maxPosition]=menorNumero;
			
		}
//		for(int i = 1; i<=unorderedArray.length; i++) {
//			orderedArray[unorderedArray.length-i]=mayor(unorderedArray);
//			unorderedArray[maxPosition(unorderedArray)]=menorNumero;
//			
//		}
		//Se ordena el array original
		for(int i= 0; i < unorderedArray.length;i++)
			unorderedArray[i]=orderedArray[i];
		
		//Imprimo el array
			for(int i = 0; i < unorderedArray.length; i++)
				System.out.println(orderedArray[i]);
			
			System.out.println("---Fin array---");
		}

	//Selección directa (Pendiente de Terminar)
	static void sort(int [] unorderedArray) {
		for(int indexSelected=0; indexSelected<unorderedArray.length; indexSelected++) {
//			for (int indexActualArray = indexSelected+1; indexActualArray < unorderedArray.length; indexActualArray++){
////				if(unorderedArray[indexActualArray]<unorderedArray[indexSelected]) {
////					int aux=unorderedArray[indexSelected];
////					unorderedArray[indexSelected]=unorderedArray[indexActualArray];
////					unorderedArray[indexActualArray]=aux;
////				}
				int aux = indexOfMin(unorderedArray,indexSelected);
				int aux2 = unorderedArray[indexSelected];
				unorderedArray[indexSelected] = unorderedArray[aux];
				unorderedArray[aux]=aux2;
				

			}
		}
	//Inserción Directa
	
	
	static void sortID(int [] unorderedArray) {
		for(int indexSelected=1; indexSelected<unorderedArray.length; indexSelected++) {
			for(int indexAtras=indexSelected;indexAtras>0;indexAtras--) {
				if(unorderedArray[indexSelected]<unorderedArray[indexAtras]) {
					int aux = unorderedArray[indexAtras];
					unorderedArray[indexAtras]=unorderedArray[indexSelected];
					for(int y = indexAtras+1;y<unorderedArray.length;y++) {
						aux = unorderedArray[y-1];
						unorderedArray[y]=unorderedArray[y];
					}
				}
			}

				

			}
		}
	private static int indexOfMin(int[] v,int initialIndex) {
		int indexOfmin=initialIndex;
		for(int x = initialIndex; x < v.length;x++) {
			if(v[x]<v[indexOfmin]) {
				indexOfmin=x;
			}
		}
		return indexOfmin;
	}
	public static int min (int[] v){
		int menor=v[0];
		for(int i=1; i<v.length;i++) {
			if(v[i]<menor)
				menor=v[i];
		}
		return menor;
	}
	public static int minPosition (int[] v){
		int menor=v[0];
		int position=0;
		for(int i=1; i<v.length;i++) {
			if(v[i]<menor) {
				menor=v[i];
				position=i;
			}
		}
		return position;
	}
	public static int mayor (int[] v){
		int mayor=v[0];
		for(int i=1; i<v.length;i++) {
			if(v[i]>mayor)
				mayor=v[i];
		}
		return mayor;
	}
	public static int maxPosition (int[] v){
		int max=v[0];
		int position=0;
		for(int i=1; i<v.length;i++) {
			if(v[i]>max) {
				max=v[i];
				position=i;
			}
		}
		return position;
	}
}



