
public class 문제_9_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = new int[10];
		int sum =0;
		for(int i =0 ; i<arr.length;i++) {
			arr[i] = (int)(Math.random()*100)+1;
			sum +=arr[i];
		}
		System.out.println("총점 : "+sum+" 평균 : "+(double)sum/arr.length);
		
	}

}
