
public class 문제_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum7=0;
		int sum9 = 0;
		
		for(int i =0 ;i <= 1000;i++) {
			if(i%7== 0)sum7+=i;
			if(i%9==0)sum9+=i;
		}
		System.out.println("7의 배수의 합 : "+sum7);
		System.out.println("9의 배수의 합 : "+sum9);
		System.out.println("7의배수 + 9의 배수 : "+(sum7+sum9));
	}

}
