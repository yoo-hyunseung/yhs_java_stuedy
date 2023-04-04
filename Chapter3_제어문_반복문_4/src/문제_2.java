

public class 문제_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		int sum =0;
		for(int i = 100; i <=999; i++) {
			if(i%4 != 0) {
				sum +=i;
				count++;
			}
		}
		System.out.println("sum ="+sum+", count = "+count);
	}

}
