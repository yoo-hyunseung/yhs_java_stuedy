import java.util.Arrays;

/*
 *    버블정렬 : 인접한 데이터끼리 비교
 *    => 선택정렬 : 앞에서부터 정렬
 *    => 버블정렬 : 뒤에서 부터 정렬
 *    
 *    40 30 10 50 20 ==>ASC
 *    -- --
 *    30 40
 *       -- --
 *       10 40
 *          -- --
 *          40 50
 *             -- --
 *             20 50 (fix) 0 - 4
 *    --------------------
 *    30 10 40 20 50
 *    -- --
 *    10 30 
 *       -- --
 *       30 40 
 *          -- --
 *          20 40 (fix)    1 -3
 *          --------------
 *    10 30 20 40 50
 *    -- --
 *    10 30
 *       -- --
 *       20 30 (fix)
 *       ------------------ 2 - 2
 *    10 20
 *    -- --  
 *    10 20 (fix)           3 - 1
 *    ---------------------length - 1 (loot)
 *       
 *     i = 0 , j = 4
 *     i = 1 , j = 3
 *     i = 2 , j = 2
 *     i = 3 , j = 1
 *     
 *     i + j = 4 ==> j = length-1 - i
 *         
 *             
 */
public class 배열응용_알고리즘_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = new int[5];
		for(int i =0 ; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*100)+1;
		}
		System.out.println("=====before sort======");
		System.out.println(Arrays.toString(arr));
		for(int i =0 ; i < arr.length-1; i++) {
			for(int j = 0 ; j < arr.length-1-i;j++) {
				// i=0 j=4
				// i=1 j=3
				// i=2 j=2
				// i=3 j=1   
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("=====after sort(ASC)======");
		System.out.println(Arrays.toString(arr));
		
		for(int i =0 ; i < arr.length-1; i++) {
			for(int j = 0 ; j < arr.length-1-i;j++) {
				// i=0 j=4
				// i=1 j=3
				// i=2 j=2
				// i=3 j=1   
				if(arr[j]<arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("=====after sort(DESC)======");
		System.out.println(Arrays.toString(arr));
		
	}

}
