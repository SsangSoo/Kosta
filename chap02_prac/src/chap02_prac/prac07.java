package chap02_prac;

import java.util.Scanner;

public class prac07 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오 : ");
		int num = in.nextInt();
		
		boolean and = (num%4==0 && num%5==0);
		boolean or =  (num%4==0 || num%5==0);
		boolean nor = (num%4==0 || num%5==0) && !(num%4==0 && num%5==0);
		
		System.out.println("4와 5로 나누어지는지 " + and);
		System.out.println("4 또는 5로 나누어지는지" + or);
		System.out.println("4나 5 중 하나로 나누어지지만 두 수 모두로는 나누어지지 않는지 " + nor);
		
		
		
	}
}