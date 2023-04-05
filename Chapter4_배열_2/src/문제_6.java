import java.util.Scanner;

public class 문제_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] arr = new int [10];
		for(int i =0 ; i < arr.length ; i++) {
//			System.out.print("정수입력 : ");
//			arr[i] = scan.nextInt();
			arr[i] = (int)(Math.random()*100)+1;
			if(arr[i]%3 ==0) {
				System.out.print(arr[i]+ " ");
			}
					
		}
	}

}
