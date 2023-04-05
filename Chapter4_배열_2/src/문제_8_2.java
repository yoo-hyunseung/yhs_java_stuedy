import java.util.Scanner;

public class 문제_8_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		char [] c= new char[10];
		for(int i =0 ; i< c.length;i++) {
			c[i] = scan.next().charAt(0);
			
		}
		for(char ch : c) {
			System.out.print(ch);
		}
	}

}
