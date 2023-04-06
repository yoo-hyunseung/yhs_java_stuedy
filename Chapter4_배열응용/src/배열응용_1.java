/*
 *    배열 : 같은 데이터를 모아서 관리
 *          --------
 *    변수
 *       ------
 *         10  => a   ==> int a = 10; (한개만 저장하는 공간)
 *                        --- 기본형(자바에서 지원하는 데이터형)
 *       ------
 *    배열arr[0]....      	arr[4]
 *       -------------------
 *        1 | 2 | 3 | 4 | 5 
 *      |-------------------
 *      arr	 
 *      
 *      자바의 메모리 구조
 *      -----------------------------------
 *      method area -> method , static
 *      -----------------------------------
 *      stack -> 메모리 관리(지역변수, 매개변수)
 *                        ------
 *                        {}에서만 사용이 가능
 *      -----------------------------------
 *      Heap => 동적 메모리 할당(new) 배열/클래스
 *      -----------------------------------
 *      
 *      1. 배열선언
 *         데이터형 [] 배열명;
 *         데이터형 배열명 [];
 *      2. 배열할당 (연속적으로 몇개를 만들지 여부)
 *         데이터형[] 배열명 = new 메모리 만들어주고 다음에 만든 메모리에 주소값을 넘겨준다.
 *                         --- malloc(sizeof(10)) => 연산자로 바뀜
 *                          delete
 *                               free() ---> 개발자가 사용을 잘 안함 => 
 *                               GC => 사용하지 않거나 null값인 경우 자동 회수
 *                               
 *         데이터형 []배열명 = new 데이터형[크기결정]
 *         
 *         예) 
 *            int []arr = new int[5];
 *            ---------   ----------
 *            stack       Heap (실제 데이터가 저장)
 *            ---------   ---------------------------
 *            arr
 *            -----       -[0]--[1]--[2]--[3]--[4]--
 *            0x100              0    0    0    0    0 
 *            -----       --------------------------
 *             |          0x100
 *             |  *      
 *            new
 *            실제 저장된 데이터의 메모리 주소를 이용해서 데이터 관리(참조변수)
 *            ==> 배열 / 클래스
 *       ** 변수 (변수,배열,클래) => 초기화 후 사용
 *              클래스(많이 사용) ==> 영화정보, 회원, 게시물 ...
 *              ---------
 *                -----
 *                10
 *                -----
 *                10.4
 *                -----
 *                "홍길동"
 *                -----
 *              ---------
 *     1. 인덱스를 이용하는 방법 => 초기화
 *     2. for문을 이용한 초기화
 *     3. 선언과 동시에 초기화
 *     4. 배열 => 고정
 *        배열 확장 => 새로운배열
 *        배열 복사
 *        얕은 복사 = > 주소를 동일하게 만든다
 *        int [] arr = arr2;
 *        깊은 복사 = > 새로운 주소를 만든다
 *        int [] arr1 = arr.clone();
 *        arraycopy();
 *        for 이용
 *        
 *        
 *        *** new를 이용하는 경우 기본 디폴드값이적용
 *        int[]
 *        char[]
 *        String[]  디폴드 null  메모리주소가 없는 경우 NullPointerException
 *        
 *        
 *        double[]
 *        boolean[]
 *      
 *      
 */
public class 배열응용_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// char 배열 선언  'A' ~ 'Z';
		
		char[] alpha = new char[26];
		
		char c = 'A';
		for(int i=0; i < alpha.length;i++) {
			alpha[i]= c++;
		}
		for(char ch : alpha) {
			System.out.print(ch+" ");
		}
	}

}
