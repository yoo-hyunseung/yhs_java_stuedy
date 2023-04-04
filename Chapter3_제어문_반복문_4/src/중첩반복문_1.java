//2차 for문
/*
 * 		중첩
 *      조건문
 *        if(){
 *            if(){
 *            
 *            }
 *        }
 *        switch(){
 *            case :
 *                switch(){
 *                    case
 *                }
 *        }
 *        
 *        for(){ =======> 줄수
 *            for(){ ===> 출력 갯수
 *               
 *            }
 *        }
 *        1 2 3 4 5
 *        6 7 8 9 10
 *        11 12 13 14 15
 *        16 17 18 19 20
 *        
 *        A B C 
		  D E F 
          G H I 
          J K L 
          M N O 
          
          for(){         ======> 줄수
          
          ----------------------------------
              for(){      =======> 실제 출력들
                  반복수행문장
              }
          ----------------------------------
              다음줄로 내려온다.
          }
          2*1 = 2 ......9*1 = 9
          ...
          ...
          2*9=18 .......9*9 =81

 */
public class 중첩반복문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c = 'A';
		for(int i =1; i<=5;i++) {
			for(int j =1; j<=3;j++) {
				System.out.print(c++ +" ");
			}
			System.out.println();
		}
		int count=0;
		for(int i =1; i <=5 ; i++) {
			for(int j = 1; j <=5 ; j++) {
				System.out.println("i = "+i + ", j = "+j+" ");
				count++;
				System.out.println(count);
			}
		}
		
		System.out.println("========구구단=========");
		
		for(int i =1 ; i<=9 ; i++) {
			for(int j = 2; j <=9;j++ ) {
				System.out.printf("%2d * %2d = %2d\t",j,i,j*i);
			}
			System.out.println();
		}
	}

}
