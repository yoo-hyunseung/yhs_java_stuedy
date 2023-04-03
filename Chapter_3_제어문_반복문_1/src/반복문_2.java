// 1~100까지 총합
public class 반복문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum =0;
		for(int i =1 ; i <=100 ;i++) {
			sum+=i;
			System.out.println("sum = "+sum+", i ="+i);
		}
		System.out.println("=======result=======");
		System.out.println("1~100 sum is "+sum);
		sum = 0;
		for(int i = 1 ; i<=100;i++) {
			if(i%2 ==0) {
				sum+=i;
			}
		}
		System.out.println("=======result=======");
		System.out.println("1~100 짝수의 합 : "+sum);
		
		sum =0;
		for(int i =1 ; i <=100; i+=2) {
			sum+=i;
		}
		System.out.println("=======result=======");
		System.out.println("1~100 홀수의 합 : "+sum);
	}
	

}
