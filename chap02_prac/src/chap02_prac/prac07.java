package chap02_prac;

import java.util.Scanner;

public class prac07 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("������ �Է��Ͻÿ� : ");
		int num = in.nextInt();
		
		boolean and = (num%4==0 && num%5==0);
		boolean or =  (num%4==0 || num%5==0);
		boolean nor = (num%4==0 || num%5==0) && !(num%4==0 && num%5==0);
		
		System.out.println("4�� 5�� ������������ " + and);
		System.out.println("4 �Ǵ� 5�� ������������" + or);
		System.out.println("4�� 5 �� �ϳ��� ������������ �� �� ��ηδ� ���������� �ʴ��� " + nor);
		
		
		
	}
}