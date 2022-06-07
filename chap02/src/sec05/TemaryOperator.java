package sec05;

public class TemaryOperator {
	public static void main(String[] args) {
		int x = 1; int y;
		y = ((x==1) ? 10:20);		// 10
		System.out.println(y);		// 10
		y = ((x>1) ? (x += 1) : (x += 20));	// 21
		System.out.println(y);
	}
}