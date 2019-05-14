package Übung08;
import java.util.Scanner;
import java.util.Arrays;


public class Walze {
	Scanner meinScanner = new Scanner(System.in);
	
	String walze50 [] = {"A", "B", "C", "D", "E", "F", "G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	
	String walze51 [] = {"A", "D", "C", "B", "E", "H", "F", "G", "I", "L", "J", "K", "M","P","N","O","Q","T","R","S","U","X","V","W","Z","Y"};
	
	String walze60 [] = {"A","C","E","D","F","H","G","I","K","J","L","N","M","O","Q","P","R","T","S","U","W","V","X","Z","Y","B"};
	
	String walze61 [] = {"A","Z","X","V","T","R","P","N","D","J","H","F","L","B","Y","W","U","S","Q","O","M","K","I","G","E","C"};
	
	String walze70 [] = {"A","Z","Y","X","W","V","U","T","S","R","Q","P","O","N","M","L","K","J","I","H","G","F","E","D","C","B"};
	
	String walze71 [] = {"A","E","B","C","D","F","J","G","H","I","K","O","L","M","N","P","T","Q","R","S","U","Y","V", "W","X","Z"};
	
	
//	private int walzennummer;
//	public Walze (int x) {
//		this.walzennummer = x;
////	}

	public char countClockwiseRotations(String startzeichen, String zielzeichen) {
		
		System.out.print("Walzennummer eingeben: ");
		int y = meinScanner.nextInt();
		int i, k;
		String searched = "";
		String found = "";
		
		
		switch(y){
			case 50:
				System.out.println("Startzeichen eingeben: ");
				String searched50 = meinScanner.next();
				
				int i50 = Arrays.binarySearch(walze50, searched50);
				if (i50> -1) {
					System.out.println(searched50 + " an " + i50 + ". Stelle gefunden.");
				}
				
				
				System.out.println("Zielzeichen eingeben: ");
				String found50 = meinScanner.next();
				int k50 = Arrays.binarySearch(walze50, found50);
				if (k50> -1) {
					System.out.println(searched50 + " an " + k50 + ". Stelle gefunden.");
				}
		
				System.out.println("Das Zielzeichen ist " + (k50-i50) + " Stellen vom Startzeichen entfernt");
				break;
			
				
			case 51:
				System.out.println("Startzeichen eingeben: ");
				String searched51 = meinScanner.next();
				
				int i51 = Arrays.binarySearch(walze50, searched51);
				if (i51> -1) {
					System.out.println(searched51 + " an " + i51 + ". Stelle gefunden.");
				}
				
				
				System.out.println("Zielzeichen eingeben: ");
				String found51 = meinScanner.next();
				int k51 = Arrays.binarySearch(walze51, found51);
				if (k51> -1) {
					System.out.println(searched51 + " an " + k51 + ". Stelle gefunden.");
				}
		
				System.out.println("Das Zielzeichen ist " + (k51-i51) + " Stellen vom Startzeichen entfernt");
				break;
				
				
			case 60:
				System.out.println("Startzeichen eingeben: ");
				searched = meinScanner.next();
				
				i = Arrays.binarySearch(walze60, searched);
				if (i> -1) {
					System.out.println(searched + " an " + i + ". Stelle gefunden.");
				}
				
				
				System.out.println("Zielzeichen eingeben: ");
				found = meinScanner.next();
				k = Arrays.binarySearch(walze60, found);
				if (k> -1) {
					System.out.println(searched + " an " + k + ". Stelle gefunden.");
				}
		
				System.out.println("Das Zielzeichen ist " + (k-i) + " Stellen vom Startzeichen entfernt");
				break;
				
				
			case 61:
				System.out.println("Startzeichen eingeben: ");
				String searched61 = meinScanner.next();
				
				int i61 = Arrays.binarySearch(walze61, searched61);
				if (i61> -1) {
					System.out.println(searched + " an " + i61 + ". Stelle gefunden.");
				}
				
				
				System.out.println("Zielzeichen eingeben: ");
				String found61 = meinScanner.next();
				int k61 = Arrays.binarySearch(walze61, found61);
				if (k61> -1) {
					System.out.println(searched + " an " + k61 + ". Stelle gefunden.");
				}
		
				System.out.println("Das Zielzeichen ist " + (k61-i61) + " Stellen vom Startzeichen entfernt");
				break;
				
				
			case 70:
				System.out.println("Startzeichen eingeben: ");
				String searched70 = meinScanner.next();
				
				int i70 = Arrays.binarySearch(walze70, searched70);
				if (i70> -1) {
					System.out.println(searched70 + " an " + i70 + ". Stelle gefunden.");
				}
				
				
				System.out.println("Zielzeichen eingeben: ");
				String found70 = meinScanner.next();
				int k70 = Arrays.binarySearch(walze70, found70);
				if (k70> -1) {
					System.out.println(searched70 + " an " + k70 + ". Stelle gefunden.");
				}
		
				System.out.println("Das Zielzeichen ist " + (k70-i70) + " Stellen vom Startzeichen entfernt");
				break;
				
				
			case 71:
				System.out.println("Startzeichen eingeben: ");
				searched = meinScanner.next();
				
				i = Arrays.binarySearch(walze71, searched);
				if (i> -1) {
					System.out.println(searched + " an " + i + ". Stelle gefunden.");
				}
				
				
				System.out.println("Zielzeichen eingeben: ");
				found = meinScanner.next();
				k = Arrays.binarySearch(walze71, found);
				if (k> -1) {
					System.out.println(searched + " an " + k + ". Stelle gefunden.");
				}
		
				System.out.println("Das Zielzeichen ist " + (k-i) + " Stellen vom Startzeichen entfernt");
				break;
				
		}
		
		
		
		
		
		
		return 2;
	}
}
