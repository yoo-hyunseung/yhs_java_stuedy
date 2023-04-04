// while ==> 반복 횟수가 없는 경우에 주로 사용(무한 루)
public class 반복문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1~100 합, 짝수합, 홀수합
		int sum = 0, even = 0, odd=0;
		
		//1 ~ 100까지 증가하는 변수 -> 루프변수
//		int i =1;
//		while( i <=100) {
//			sum+=i;
//			if(i%2 == 0) {
//				even+=i;
//			}
//			else odd+=i;
//			i++;
//		}
		for(int i =1 ; i <=100 ; i ++) {
			sum+=i;
			if(i%2 == 0) {
				even+=i;
			}
			else odd+=i;
		}
		System.out.println("1~100 sum : "+sum);
		System.out.println("1~100 짝수 : "+even);
		System.out.println("1~100 홀수 : "+odd);
	}

}
