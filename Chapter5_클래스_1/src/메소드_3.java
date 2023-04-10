import java.util.Arrays;

/*
 *      리턴형    매개변수
 *   1.  O       O
 *   2.  O       X
 *   3.  X       O
 *   4.  X       X
 *       
 *     1) 2 ~9 단 까지 구구단을 출력 (4)
 *         static void gugudan(){
 *             print~~
 *         }
 *     2) id, pwd 로그인 true / false (1)
 *         static boolean isLogin(String id, String pwd){
 *             return true / false;
 *         }
 *     3) 검색어를 입력 받아서 검색된 노래명을 출력(3)
 *         static void find(String fd){
 *         	  print~~~;
 *         }\
 *         검색어를 입력 받아서 검색된 노래명들을 받아서 출력(1)
 *         static String[] find(String fd){
 *         }
 *     4) 5 정수를 넘겨주고 정렬된 정수를 받는다.
 *         static int[] sort(int a, int b, int c, int d, int e){
 *         
 *         }
 *         static int[] sort(int []arr)
 *         결과 값이 여러개인 경우에는 배열을 이용한다.
 *         
 */
// 6개의 난수를 발생해서 => 전송을 받은 다음 => 총합, 평균
public class 메소드_3 {
	// 6개 난수를 발생
	static int[] rand() {
		int [] arr = new int[6];
		for(int i =0 ; i < arr.length;i++) {
			arr[i] = (int)(Math.random()*100)+1;
		}
		return arr;
	}
	// 최대값, 최소값
	static int max(int []a) {
		int []arr = rand();
		System.out.println("max  = "+Arrays.toString(arr));
		int m = arr[0];
		for(int i =1 ; i< arr.length;i++) {
			if(m < arr[i]) {
				m = arr[i];
			}
		}
		return m;
	}
	static int min(int []a) {
		int []arr = rand();
		System.out.println("min  = "+Arrays.toString(arr));
		int m = arr[0];
		for(int i : arr) {
			if(i<m)m=i;
		}
		return m;
	}
	static void process() {
		int [] arr = rand(); // 얕은 복사
		System.out.println(Arrays.toString(arr));
		int total = 0;
		for(int i =0 ; i < arr.length;i++) {
			total += arr[i];
		}
		System.out.println("총합 : "+total);
		System.out.printf("평균 : %.2f\n", total/(double)arr.length);
		System.out.println("최대값 : "+max(arr));
		System.out.println("최소값 : "+min(arr));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
