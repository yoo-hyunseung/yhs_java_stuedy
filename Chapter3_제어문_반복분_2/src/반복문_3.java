// 3의 배수 , 5의 배수, 7의 배수의 합 => 갯수확인
public class 반복문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a3=0,a5=0,a7=0;//sum
		int c3=0,c5=0,c7=0;//count
		int i = 1;
		while(i<=100) {
			// 중복적으로 수행 => 단일 조건 , 중복이 없는 경우 => 다중 조건
			if(i%3 == 0) {
				c3++;
				a3+=i;
			}
			if(i%5 == 0) {
				c5++;
				a5+=i;
			}
			if(i%7 == 0) {
				c7++;
				a7+=i;
			}
			i++;
		}
		System.out.println("=========result==========");
		System.out.println("3의 배수의 합 :"+a3+" 갯수 : "+c3);
		System.out.println("5의 배수의 합 :"+a5+" 갯수 : "+c5);
		System.out.println("10의 배수의 합 :"+a7+" 갯수 : "+c7);
		int max = c3;
		if(max < c5)
			max= c5;
		if(max < c7)
			max = c7;
		int min = c3;
		if(min >c5)
			min =c5;
		if(min > c7)
			min = c7;
		System.out.println("max = "+max);
		System.out.println("min = "+min);
	}

}
