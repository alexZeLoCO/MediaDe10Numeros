import java.util.Scanner;		//IMPORTAR SCANNER
public class Media10Nums {

	public static void main(String[] args) {
		double suma = 0;		//CREAR VARIABLE SUMA
		Scanner teclado = new Scanner (System.in);		//CREA TECLADO
		for (int i=0; i<10;i++) {		//PARA 10 VECES
			System.out.print("Introduzca número: ");		//SOLICITA NÚMERO
			suma = suma + teclado.nextDouble();		//SUMA AL TOTAL
		}
		System.out.printf("La media de los números es igual a: %f",suma/10);		//OUTPUT
	}

}
