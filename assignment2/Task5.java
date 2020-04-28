package assignment2;

public class Task5 {
	public static void main(String[] args) {
		for(int i=0;i<=9;i+=2) {
			for(int j=i;j>=0;j--) {
				System.out.print(" ");
			}
			for(int k=9;k>=i+1;k--) {
				System.out.print("* ");
			}
			
			System.out.println("\n");
		}
	}
}
