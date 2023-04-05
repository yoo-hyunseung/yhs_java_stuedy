import java.util.Scanner;

public class 문제_8_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int [] arr = new int[10];
		for(int i =0  ;i<arr.length;i++) {
			arr[i] = scan.nextInt();
			if(i == 2 || i ==4 || i == arr.length-1) {
				System.out.print(arr[i]+" ");
			}
		}
	}

}
