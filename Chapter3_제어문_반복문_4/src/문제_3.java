
public class 문제_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int even =0;
		int odd=0;
		for(int i = 1; i <=30 ; i++) {
			if(i%2==0)even+=i;
			else odd+=i;
		}
		System.out.println("even = "+even+", odd = "+odd);
	}

}
