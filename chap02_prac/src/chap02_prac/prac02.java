package chap02_prac;

import java.util.Scanner;

public class prac02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int y = in.nextInt();
		
		System.out.print(y+"의 제곱은 " + y*y);
		
	}
}
