
public class 문제_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = new int[10];
		int sum =0;
		for(int i =0 ; i <arr.length;i++) {
			arr[i] = (int)(Math.random()*10)+1;
			sum +=arr[i];
		}
		double avg = (double)sum/arr.length;
		for(int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println(avg);
	}

}
