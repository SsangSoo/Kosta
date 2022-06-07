package chap02_prac;

import java.util.Scanner;

public class prac04 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("초 단위 정수를 입력하세요 : ");
		int num = input.nextInt();
		
		int hour, min, sec; // 시간, 분, 초
		
		hour = num / 3600;	// 시간 단위
		num -= (hour*3600);
		
		min = num / 60; 	// 분 단위
		num -= (min*60);
		
		sec = num;			// 초단위
		
		System.out.print(hour + "시간 "+ min + "분 " + sec + "초"); 		
		
		
	}
}