package sec05;

public class ComLogicDemo {

	public static void main(String[] args) {
		
		int x = 0, y = 1;
		
		System.out.println((x < 1) && (y-- < 1));
//		y-- > �� �Ŀ��� y = 1, �׸��� ���� �Ŀ� -- �� ����Ǽ� 
//		10�� ���� ���ķ� 0�� �ȴ�.
		
		
/*
 * ���� ������(= ���� �����ڰ� �տ� ���� ��)
 * ex) ++y;
 * int i = ++y;
 * �� �������� �ΰ��� ������ �и��ϸ�
 * y = y + 1;
 * int i = y;	
 *
 * ���� ������(= ���� �����ڰ� �ڿ� ���� ��)
 * ex) y++;
 * int i = y++;
 * �� �������� �ΰ��� ������ �и��ϸ�
 * int i = y;
 * y = y + 1;
 *		
 */
	
	}
}