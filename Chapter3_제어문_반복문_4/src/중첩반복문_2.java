/*
 * 
 * 		*
 *      * *
 *      * * *
 *      * * * *
 *        i 줄수 , j 별수
 *          1       1
 *          2       2
 *          3       3
 *          4       4  =>i == j
 *        
 *      * * * *
 *      * * *
 *      * * 
 *      *
 *      i 줄수 , j 별수  ===> i + j = 5 , j = 5-i;
 *          1       4
 *          2       3
 *          3       2
 *          4       1  => 역순이면 더한다.
 *          
 *          
 *          
 *      A
 *      BC
 *      DEF
 *      GHIJ;
 *      
 *      => 정렬
 *      => 빈도수 구하기
 *      => 등수 구하기
 *      => 마름모 출력하기, 나비출력하기
 *      
 *         *
 *        **
 *       ***
 *      ****
 *      -----------
 *        i    k    j      i/k                 i/j
 *        줄수  공백  별표    i+k = 4 ==> k=4-i   i = j
 *        1    3    1
 *        2    2    2
 *        3    1    3
 *        4    0    4
 *        
 *      ****
 *       ***
 *        **
 *         *
 *         
 *         *
 *        ***
 *       *****
 *      *******
 *      1 3
 *      2 2
 *      3 1
 *      4 0
 *      
 */
public class 중첩반복문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		char c ='A';
		for(int i = 1; i <=6 ; i++) {
//			for(int j = 1 ; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//			for(int j = 1; j<=5-i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//			for(int j= 1; j<=i; j++) {
//				System.out.print(c++);
//			}
//			System.out.println();c
//			char c = 'A';
//			for(int j= 1; j<=i; j++) {
//				System.out.print(c++);
//			}
//			System.out.println();
			for(int j = 1 ; j<=6-i; j++) {
				System.out.print(" ");
			}
			for(int k = 1 ; k<=i*2-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
