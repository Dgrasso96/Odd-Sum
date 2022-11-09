import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner inScanner = new Scanner(System.in);

		System.out.println("*** CALCLOLO NUMERI DISPARI ***\n");

		System.out.println("Inserisci numero di partenza e numero di arrivo:");

		System.out.println(SommaDispari.sumOdd(inScanner.nextInt(), inScanner.nextInt()));
	}
}
