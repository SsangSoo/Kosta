package sec04;


import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int x = in.nextInt(); 
		int y = in.nextInt(); 
		
		System.out.println("x="+x+", y="+y);
	}
}