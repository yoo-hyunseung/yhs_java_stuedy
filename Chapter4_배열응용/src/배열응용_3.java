import java.util.Arrays;

// 6개 난수를 발생 -> 1 ~ 45
//  중복된 수가 없다.

public class 배열응용_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lotto = new int[6];
//		for(int i =0 ; i < lotto.length;i++) {
//			lotto[i] = (int)(Math.random()*45)+1;
//			for(int j = 0 ; i <i;i++) {
//				if(lotto[i] == lotto[j]) {
//					i--;					
//					break;
//				}
//			}
//		}
		int su = 0;
		boolean bCheck = false;
		for(int i =0 ; i< lotto.length;i++) {
			bCheck= true;
			while(bCheck) {
				su = (int)(Math.random()*45)+1;
				bCheck = false;
				for(int j = 0 ; j < i ; j++) {
					if(lotto[j] == su) {
						bCheck = true;
						break;
					}
				}
				
			}
			lotto[i] =su;
		}
		
		System.out.println(Arrays.toString(lotto));
		
	}

}
