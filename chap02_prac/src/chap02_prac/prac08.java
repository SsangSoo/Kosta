package chap02_prac;

import java.util.Scanner;

public class prac08 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("0~999 ������ ���ڸ� �Է��ϼ��� : ");
		int num = in.nextInt();
		
		int tmp = 0; // �� �ڸ����� ���� ������ ����
		
		tmp += num % 10; // 1�� �ڸ� ��
		num /= 10;
		
		tmp += num % 10; // 10�� �ڸ���
		num /= 10;
		
		tmp += num % 10; // 100�� �ڸ���
		
		
		System.out.print("�� �ڸ����� �� : " + tmp);
		
	}
}