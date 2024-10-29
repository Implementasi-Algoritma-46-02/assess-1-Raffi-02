import java.util.Scanner;

public class Soal03 {

	public static void main(final String[] args) {
		Scanner input = new Scanner (System.in);
		int bilanganJam = input.nextInt();
		int bilanganMenit = input.nextInt();
		int bilanganMenitTambah = input.nextInt();

		int hasil1 = bilanganMenit + (bilanganMenitTambah + 15);
		System.out.println(bilanganJam + ";" + hasil1);

		int hasil2 = bilanganMenit + ( 30 - bilanganMenitTambah);
		System.out.println( 1 + bilanganJam + ";" + hasil2);
		}
		}


		
		
	

