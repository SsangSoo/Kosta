package chap02_prac;

import java.util.Scanner;

public class prac04 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("�� ���� ������ �Է��ϼ��� : ");
		int num = input.nextInt();
		
		int hour, min, sec; // �ð�, ��, ��
		
		hour = num / 3600;	// �ð� ����
		num -= (hour*3600);
		
		min = num / 60; 	// �� ����
		num -= (min*60);
		
		sec = num;			// �ʴ���
		
		System.out.print(hour + "�ð� "+ min + "�� " + sec + "��"); 		
		
		
	}
}