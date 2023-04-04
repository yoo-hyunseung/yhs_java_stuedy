
public class 문제_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count =0;
		int sum =0;
		for(int i = 100 ; i <=999;i++) {
			if(i % 7 == 0) {
				sum+=i;
				count++;
			}
		}
		System.out.println("7의 배수의 합 : "+ sum+" 갯수 : "+count);
	}

}
