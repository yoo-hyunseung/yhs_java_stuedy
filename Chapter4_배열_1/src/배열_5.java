import java.util.Arrays;
public class 배열_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [] arr = new char[20];
		int countA=0;
		int counta=0;
		for(int i = 0 ; i <arr.length;i++) {
			int n =(int)(Math.random()*2);
			if(n == 0) {
				arr[i] = (char)((Math.random()*26)+65);
				countA++;
			}
			else {
				arr[i] = (char)((Math.random()*26)+97);
				counta++;
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.print("대문자 갯수 : "+countA + " 소문자 갯수 : "+counta);
	}

}
