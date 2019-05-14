package Übung08;
import java.util.Scanner;
import java.util.Arrays;


public class Walze {
	Scanner meinScanner = new Scanner(System.in);
	
	
//	private String walze50 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String walze50 [] = {"A", "B", "C", "D", "E", "F", "G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	String walze51 [] = {"A", "D", "C", "B", "E", "H", "F", "G", "I", "L", "J", "K", "M","P","N","O","Q","T","R","S","U","X","V","W","Z","Y"};
	String walze60 [] = {"A","C","E","D","F","H","G","I","K","J","L","N","M","O","Q","P","R","T","S","U","W","V","X","Z","Y","B"};
	String walze61 [] = {"A","Z","X","V","T","R","P","N","D","J","H","F","L","B","Y","W","U","S","Q","O","M","K","I","G","E","C"};
	String walze70 [] = {"A","Z","Y","X","W","V","U","T","S","R","Q","P","O","N","M","L","K","J","I","H","G","F","E","D","C","B"};
	String walze71 [] = {"A","E","B","C","D","F","J","G","H","I","K","O","L","M","N","P","T","Q","R","S","U","Y","V", "W","X","Z"};
	
//	private String walze51 = "ADCBEHFGILJKMPNOQTRSUXVWZY";
//	private String walze60 = "ACEDFHGIKJLNMOQPRTSUWVXZYB";
//	private String walze61 = "AZXVTRPNDJHFLBYWUSQOMKIGEC";
//	private String walze70 = "AZYXWVUTSRQPONMLKJIHGFEDCB";
//	private String walze71 = "AEBCDFJGHIKOLMNPTQRSUYVWXZ";
	
	private int walzennummer;
	
//	public Walze (int x) {
//		this.walzennummer = x;
////	}

	public char countClockwiseRotations(String startzeichen, String zielzeichen) {
		
		System.out.println("Walzennummer eingeben: ");
		int y = meinScanner.nextInt();
		
		System.out.println("Startzeichen eingeben: ");
		String searched = meinScanner.next();
		
		int i = Arrays.binarySearch(walze50, searched);
		if (i> -1) {
			System.out.println(searched + " an " + i + ". Stelle gefunden.");
		}
		
		
		System.out.println("Zielzeichen eingeben: ");
		String found = meinScanner.next();
		int k = Arrays.binarySearch(walze50, found);
		if (k> -1) {
			System.out.println(searched + " an " + k + ". Stelle gefunden.");
		}

		System.out.println("Das Zielzeichen ist " + (k-i) + " Stellen vom Startzeichen entfernt");
		
		
		
		
		
		
		return 1;
	}
}
