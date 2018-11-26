package org.institutoserpis.es;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] unorderedArray=new int [] {10,9,35,69,45,17};
		sortID(unorderedArray);
		for(int i=0; i < unorderedArray.length; i++) {
			System.out.println(unorderedArray[i]);
		}

	}
	static void sortID(int [] unorderedArray) {
		for(int indexSelected=0; indexSelected<unorderedArray.length; indexSelected++) {
			for(int indexAtras=indexSelected;indexAtras>-1;indexAtras--) {
				System.out.println("Indice Actual: "+indexSelected+" Indice Atras: "+indexAtras);
				System.out.println("-----------------------------------------------------------");
				if(unorderedArray[indexSelected]<unorderedArray[indexAtras]) {
					int aux = unorderedArray[indexAtras];
					int aux2=unorderedArray[indexSelected];
					unorderedArray[indexAtras]=aux2;
					unorderedArray[indexSelected]=aux;

					for(int indexAtras2=indexAtras;indexAtras2 > -1;indexAtras2--) {
						System.out.println("--[+]---"+indexAtras2);
						if(unorderedArray[indexAtras2]>unorderedArray[indexSelected]) {
							aux = unorderedArray[indexAtras2];
							aux2=unorderedArray[indexSelected];
							System.out.println("---------Aux if: "+aux);
							System.out.println("---------Aux2 if: "+unorderedArray[indexAtras]);
							unorderedArray[indexAtras2]=aux2;
							unorderedArray[indexSelected]=aux;
							System.out.println("--[+]---"+indexAtras2);
						}

						
					}
				}

			}

		}
		
	}
}