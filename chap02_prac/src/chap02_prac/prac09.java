package chap02_prac;

import java.util.Scanner;

public class prac09 {
	public static void main(String[] args) {

		int total, major, kyo, nomal; // ������, ����, ����, �Ϲ�
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("���� �̼� ���� : ");
		major = in.nextInt();
		
		System.out.print("���� �̼� ���� : "); 
		kyo = in.nextInt();
		
		System.out.print("�Ϲ� �̼� ���� : ");
		nomal = in.nextInt();
		
		total = major + kyo + nomal;
		
		System.out.print(
				(total >= 140 && (kyo >= 30 || nomal >= 30) || ((kyo + nomal) >= 80)) ? "���� ����" : "���� �Ұ�");
		
		
	}
}