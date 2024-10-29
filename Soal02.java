import java.util.Scanner;
public class Soal02 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		Scanner input = new Scanner (System.in);

		double ipk  = 3.5;
		double masaStudi = 3.0;
		int eprt  = 450;
		String hki = input.nextLine();
		String lomba = input.nextLine();

		if (masaStudi > 2.9 && ipk > 3.0){
			if (eprt > 399) {
				System.out.println("cumlaude");
			}else{
				System.out.println("tidak cumlaude");
			}
			}

		}

	}

