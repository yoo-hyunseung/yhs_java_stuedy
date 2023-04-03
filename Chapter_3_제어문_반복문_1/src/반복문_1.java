/*
 * 		자바에서 지원하는 반복문
 * 		------------------
 *		for : 반복 횟수가 지정된 경우에 주로 사용 => 2차(중첩) =>코딩테스트
 *		 = 일반 for
 *		 = for-each : 출력용(웹에서 가장 많이 등장 : 향상된 for)
 *		while : 반복 횟수를 모르는 경우(선 조건)
 *		do-while : 반복횟수를 모르는 경우 (후 조건) => 무조건 1번 이상은 수행이 가능하다.
 *
 *		=> 유사한 내용을 여러번 출력을 위해 주로 사용
 *		   합계구하기, 통계... 목록을 출력 ...
 *		=> 형식)
 *		   for
 *		   for(int i =1 ; i <= 10 ; i++){ ==10번 수행
 *				
 *			}
 *			for(초기값 ; 조건식 ; 증감식){
 *				반복 실행문장
 *			}
 *			초기값 : 시작점 ==> 한번만 수행
 *			조건식 : 수행을 중단할때(중간점)
 *			증감식 : 초기 값 ~ 조건식 -> false 할때까지 수행
 *          ----- 감소도가능
 *          for(int i =10 ; i > 0 ; i--){
 *          	
 *          }
 *          증가는 여러개 증가도 가능하다.
 *          for(int i= 0 ; i < 10 ; i+=2)
 *                                  ---- 복합 대입연산자
 *                                  
 *          실행 순서 (**** 프로그램에서 가장 많이 사용되는 제어문 : for, if)
 *          => for문 한문장만 수행이 가능	
 *             여러문장 사용시에는 {}을 이용해서 처리한다.
 *                   ①  → ② →false(반복문 종료)
 *                         ↑  ↙︎④
 *          => for(초기값, 조건식, 증감식){
 *          			   ↓true➚
 *                          ③
 *                 반복 실행문장
 *             }                        
 *         1)초기값 => 2)조건식에 대입 => false => 종료(for)
 *         					  => true => 3)반복 수행문장 수행 -> 4)초기값증가
 *                   2) => 3) => 4)
 *                   
 *                   false면 종료
 */
public class 반복문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Hello java를 10번 출력
		System.out.println("Hello java!");
		System.out.println("Hello java!");
		System.out.println("Hello java!");
		System.out.println("Hello java!");
		System.out.println("Hello java!");
		System.out.println("Hello java!");
		System.out.println("Hello java!");
		System.out.println("Hello java!");
		System.out.println("Hello java!");
		System.out.println("Hello java!");
		
		System.out.println("------------for-----------");
		for(int i =0 ; i < 10 ; i++) {
			System.out.println(i+1+" Hello java!");
		}
		for(int i = 1; i <=10; i++) {
			System.out.println(i+" Hello java!"); 
		}

		
	}

}