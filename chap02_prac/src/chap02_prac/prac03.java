package chap02_prac;

import java.util.Scanner;

public class prac03 {
	public static void main(String[] args) {
		
		int r, h; // 반지름, 높이
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("원기둥의 밑면 반지름은 ? ");
		r = in.nextInt();
		
		System.out.print("원기둥의 높이는 ? ");
		h = in.nextInt();
		
		System.out.println("원기둥의 부피는 " + r*r*h*3.14);
		
	}
}