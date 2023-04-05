import java.util.Scanner;

public class 문제_8_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int [] arr = new int[10];
		int max = 0;
		for(int i =0 ; i<arr.length;i++) {
			arr[i] = scan.nextInt();
			if(arr[i]>max)max=arr[i];
		}
		System.out.println(max);		
	}

}
