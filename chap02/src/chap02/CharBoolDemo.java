package chap02;

public class CharBoolDemo {
	public static void main(String[] args) {
		System.out.println("Hello");	// 
		System.out.println((int)'H');	// H �ƽ�Ű�ڵ� 72
		System.out.println((char)72);	// 72�� ���������� ����ȯ
		System.out.println((int)'��');	// '��' �ƽ�Ű�ڵ� 44032
		System.out.println((char)44032);
		
		boolean cham = true; 
		boolean geogit = false;
		System.out.println(cham + ", " +  geogit); // ", "�� ���ؼ� String���� ����ȯ.
		
		System.out.println((int)'��'+2);		// 44034
		System.out.println((char)44034);	// '�A'
		System.out.println((int)'��');		// 45796
		System.out.println((char)45796);	// '��'
	}
}
