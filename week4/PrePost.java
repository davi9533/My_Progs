package week4;

public class PrePost {

	public static void main(String[] args) {
		int i = 10;
		int num = 10 * i++;
		System.out.println("i: " + i);
		System.out.println("num " + num);

		i = 10;
		num = 10 * ++i;
		System.out.println("i: " + i);
		System.out.println("num " + num);
	}
}
