import java.util.Scanner;

public class SumaNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int CantidadNumeros=0;
		float menor=0;
		float mayor=0;
		float NumeroPedido=0;
		float Suma=0;
		
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("----INICIO DEL PROGRAMA----\n");
		System.out.print("Introduzca la cantidad de n�meros:");
		CantidadNumeros=teclado.nextInt();
		teclado.nextLine();
		
		for(int NumeroActual=1; NumeroActual<=CantidadNumeros; NumeroActual++)
		{
			System.out.print("Introduzca el n�mero "+NumeroActual+": ");		
			NumeroPedido=teclado.nextFloat();
			teclado.nextLine();
			Suma=Suma+NumeroPedido;
			if(NumeroActual==1)
			{
				menor=NumeroPedido;
				mayor=NumeroPedido;
			}
			else{
				if(NumeroPedido < menor)
					menor=NumeroPedido;
				if(NumeroPedido > mayor)
					mayor=NumeroPedido;
			}
		}	
		
		System.out.println();
		System.out.println("La suma de los "+CantidadNumeros+" n�meros es: "+Suma);
		System.out.println("El n�mero menor es: " + menor);
		System.out.println("El n�mero mayor es: " + mayor);

		System.out.println("\n----FIN DEL PROGRAMA----");
	}

}
