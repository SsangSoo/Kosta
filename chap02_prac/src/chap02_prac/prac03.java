package chap02_prac;

import java.util.Scanner;

public class prac03 {
	public static void main(String[] args) {
		
		int r, h; // ������, ����
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("������� �ظ� �������� ? ");
		r = in.nextInt();
		
		System.out.print("������� ���̴� ? ");
		h = in.nextInt();
		
		System.out.println("������� ���Ǵ� " + r*r*h*3.14);
		
	}
}