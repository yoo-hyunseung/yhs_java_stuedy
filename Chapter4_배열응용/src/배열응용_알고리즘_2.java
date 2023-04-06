import java.util.Arrays;

// 선택 정렬 => 문자
/*
 *   B C A E D = ASC(ABCDE) / DESC(EDCBA)
 *   
 *   
 */
public class 배열응용_알고리즘_2 {
	public static void main(String[] args) {
		char [] arr = new char[100];
		for(int i =0 ; i< arr.length; i++) {
			arr[i] = (char)((Math.random()*26)+65);
		}
		System.out.println("===정렬전===");
		System.out.println(Arrays.toString(arr));
		System.out.println("===정렬후===");
		for(int i =0 ; i < arr.length-1;i++) {
			for(int j = i+1; j< arr.length;j++) {
				if(arr[i]>arr[j]) {
					char temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("===정렬후===");
		for(int i =0 ; i < arr.length-1;i++) {
			for(int j = i+1; j< arr.length;j++) {
				if(arr[i]<arr[j]) {
					char temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}
}
