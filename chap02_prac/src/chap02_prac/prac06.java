package chap02_prac;

import java.util.Scanner;

public class prac06 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double F;  	// È­¾¾ F
		double C;	// ¼·¾¾ C
		
		System.out.print("È­¾¾¸¦ ÀÔ·ÂÇÏ½Ã¿À : ");
		F = in.nextFloat();
		
		System.out.println(C = 5 / 9.0 * (F - 32.0));
	}
}