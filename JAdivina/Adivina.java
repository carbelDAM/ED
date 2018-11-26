import java.util.Random;
import java.util.Scanner;

public class Adivina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tcl=new Scanner(System.in);
		Random random = new Random();
		int numeroAleatorio=random.nextInt(1000)+1;
		int max=1000;
		int min=1;
		int cont=1;
		System.out.println("Adivina un número (entre "+min+" y "+max +")[intento: "+cont+"]:");
		int numeroIntroducido=Integer.parseInt(tcl.nextLine());
		while(numeroIntroducido != numeroAleatorio) {
			if(numeroIntroducido < numeroAleatorio) {
				System.out.println("Es mayor que ese.");
				min=numeroIntroducido+1;
				}
			else {
				System.out.println("Es menor que ese.");
				max=numeroIntroducido-1;
				}
			cont++;
			System.out.println("Adivina un número (entre "+min+" y "+max +")[intento: "+cont+"]:");
			numeroIntroducido = Integer.parseInt(tcl.nextLine());
			
		}
		System.out.println("Has ganado!!!");
	}

}
