package chap02_prac;

import java.util.Scanner;

public class prac08 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("0~999 사이의 숫자를 입력하세요 : ");
		int num = in.nextInt();
		
		int tmp = 0; // 각 자릿수의 합을 저장할 변수
		
		tmp += num % 10; // 1의 자리 수
		num /= 10;
		
		tmp += num % 10; // 10의 자리수
		num /= 10;
		
		tmp += num % 10; // 100의 자리수
		
		
		System.out.print("각 자릿수의 합 : " + tmp);
		
	}
}