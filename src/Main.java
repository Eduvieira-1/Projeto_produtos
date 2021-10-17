import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		

		int cod_peca1, num_peca1, cod_peca2, num_peca2;
		double vl_unitario1, vl_unitario2, vl_pago;
		
		
		System.out.println("Informe o codigo da peça 1: ");
		cod_peca1 = sc.nextInt();
		
		System.out.println("Informe o numero da peça 1: ");
		num_peca1 = sc.nextInt();
		
		System.out.println("Informe o valor unitario da peça 1: ");
		vl_unitario1 = sc.nextDouble();
		
		
		System.out.println("Informe o codigo da peça 2: ");
		cod_peca2 = sc.nextInt();
		
		System.out.println("Informe o numero da peça 2: ");
		num_peca2 = sc.nextInt();
		
		System.out.println("Informe o valor unitario da peça 2: ");
		vl_unitario2 = sc.nextDouble();
		
		
		vl_pago = (vl_unitario1 * num_peca1) + ( vl_unitario2 * num_peca2);
		
		System.out.printf("O valor a pagar é: %.2f%n", vl_pago);
		
		
		sc.close();
		
	}

}
