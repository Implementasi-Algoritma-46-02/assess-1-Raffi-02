import java.util.Scanner;

public class Soal03 {

	public static void main(final String[] args) {
		Scanner input = new Scanner (System.in);
		int bilanganJam = input.nextInt();
		int bilanganMenit = input.nextInt();
		int bilanganMenitTambah = input.nextInt();

		int hasil1 = bilanganMenit + (bilanganMenitTambah + 15);
		int hasil2 = bilanganMenit + ( 30 - bilanganMenitTambah);
		if (bilanganMenitTambah > 60) {
			System.out.println(+ 1 + bilanganJam + ";" + hasil1);
		}else{
			System.out.println(+ 1 + bilanganJam + ";" + hasil2);
		}
		}


		}
		
	

