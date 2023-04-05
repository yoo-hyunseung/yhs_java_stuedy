
public class 배열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = new int[10];
		int max = 0;
		for(int i =0  ; i < arr.length ; i++) {
			arr[i] = (int)(Math.random()*100)+1;
			System.out.println("arr["+i+"] = "+arr[i]);
			if(arr[i]>max)max = arr[i];
		}
		System.out.println("max = "+max);
		
	}

}
