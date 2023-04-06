import java.util.Arrays;

// 10개 정수배열에 1~100 랜덤함수로 초기화 
// 최대값 / 최소값 위치 인덱스

public class 배열응용_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= new int[10];
		for(int i=0 ; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*100)+1;
		}
		System.out.print(Arrays.toString(arr));
		//max
		int max = arr[0];
		//min
		int min = arr[0];
		for(int i : arr) {
			if(i>max)max=i;
			if(i<min)min=i;
		}
		System.out.println();
		System.out.println("max" +max + ", min : "+min);
		
		int index1=0,index2=0;
		for(int i =0 ; i < arr.length;i++) {
			if(arr[i] == max)index1 = i;
			else if(arr[i] == min) index2=i;
		}
		System.out.println("max index : "+index1+ ", min index : "+index2);
	}

}
