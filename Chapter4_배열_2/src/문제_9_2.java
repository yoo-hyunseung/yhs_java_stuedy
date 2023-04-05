import java.util.Arrays;

public class 문제_9_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {95, 75, 85, 100, 50, 1, 2,3,4,5,2,124,52,123,112,3};
		for(int i =0 ; i <arr.length;i++) {
			for(int j = 1 ; j < arr.length-i;j++) {
				if(arr[j-1]> arr[j]) {
					int tmp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
