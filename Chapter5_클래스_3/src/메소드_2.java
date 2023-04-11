// 매개변수 전송법
/*
 *    = Call by Value : 일반 기본형 데이터 전송(String 포함)
 *    = Call by Reference : 주소 값을 넘겨주는 방식(배열, 클래스)
 */
public class 메소드_2 {
	static void swap3(String id, String pwd) {
		System.out.println("교환전 : id "+id + ", 교환전 pwd "+pwd);
		String temp = id;
		id = pwd;
		pwd = temp;
		System.out.println("교환후 : id "+id + ", 교환후 pwd "+pwd);
	}
	static void swap2(int [] arr2) {
		System.out.println("arr2 = "+arr2);
		System.out.println("before swap arr2[0] = "+arr2[0]+" arr2[1] = "+ arr2[1]);
		int temp = arr2[0];
		arr2[0] = arr2[1];
		arr2[1] = temp;
		System.out.println("after swap arr2[0] = "+arr2[0]+" arr2[1] = "+ arr2[1]);
	}
	static void swap(int x ,int y) {
		System.out.println("before swap x = "+x+" y = "+y);
		int temp = x;
		x = y;
		y = temp;
		System.out.println("after swap x = "+x+" y = "+y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		swap(a, b);
		System.out.println("after method swap a = "+a+" b = "+b);
		// 값만 전송 Call By Value;
		
		int []arr = {10,20};
		System.out.println("arr = "+arr);
		swap2(arr); //int [] arr2 = arr;
		System.out.println("after swap2 method arr[0] = "+arr[0]+" arr[1] ="+ arr[1]);
		// 배열, 클래스 => 메소드 자체에서 변경이 가능
		// Call By Reference
		
		String id = "admin";
		String pwd = "1234";
		swap3(id, pwd);
		System.out.println("종료후 : id "+id + ", 종료후 pwd "+pwd);
	}

}
