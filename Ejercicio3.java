import java.util.Scanner;

public class Ejercicio3{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("\nIngresa un número entero");
		int num1 = scanner.nextInt();
		int fac = 1;
		for (int i = 0; i < (num1-1);i++){
			fac*=(num1-i);
		}
		System.out.println("\nEl factorial de " + num1 + " es igual a " + fac);
	}
}