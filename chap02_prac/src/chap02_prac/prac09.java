package chap02_prac;

import java.util.Scanner;

public class prac09 {
	public static void main(String[] args) {

		int total, major, kyo, nomal; // 총학점, 전공, 교양, 일반
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("전공 이수 학점 : ");
		major = in.nextInt();
		
		System.out.print("교양 이수 학점 : "); 
		kyo = in.nextInt();
		
		System.out.print("일반 이수 학점 : ");
		nomal = in.nextInt();
		
		total = major + kyo + nomal;
		
		System.out.print(
				(total >= 140 && (kyo >= 30 || nomal >= 30) || ((kyo + nomal) >= 80)) ? "졸업 가능" : "졸업 불가");
		
		
	}
}