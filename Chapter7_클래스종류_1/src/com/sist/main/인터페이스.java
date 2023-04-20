package com.sist.main;
/*
 *    1. 사용처 => 응용 (문법 -> 구현)
 *    ---------------------------
 *    인터페이스 : 추상클래스의 일종 (보완)
 *       1) 다중 상속
 *       2) 인터페이스는 클래스와 동일(상속을 받으면 상위 클래스이다)
 *       3) 설계만 되어 있다. (구현이 안된 메소드만 모아서 선언)
 *       4) 장점 
 *          --- 
 *           = 기능 설계 => 개발시간 단축 ==> 8개월 개발기간
 *              아키텍처(PM)        DBA
 *                3개월               1개월
 *           = 요구사항 분석 => 데이터베이스 설계 => 데이터 수집
 *             -------------------------- 
 *                 추상클래스 / 인터페이스 설계
 *                       => 화면 UI  => 퍼블리셔 => 1개월
 *                       => 구현 => 웹 프로그래머 => 2개월
 *                       => 테스팅 => 테스터 => 1개월
 *                       => 배포 => PL => 1개월
 *           = 표준화 가능 : 같은 메소드를 사용
 *             --------  스프링(통합)
 *             프레임워크 : 세트 ==> Mybatis , JPA, Jquery, VueJS, React
 *           = 서로 관계없는 클래스 연결해서 사용이 가능
 *           = 유지보수가 편리하다
 *             (수정)
 *           = 독립적으로 사용이 가능
 *  ------------------------------------------
 *      클래스 여러개를 묶어서 한개의 이름으로 제어가 가능 
 *            List(*******) 가변형 Map , Set
 *              |
 *   ---------------------------------------
 *   |           |          |      |       |
 *   ArrayList  LinkedList Vector  Queue  Stack
 *   
 *   List list = new ArrayList<>();
 *   list = new Vector();
 *   list = new LinkedList<>();
 *   list = new Queue();
 *   list = new Stack();
 *   
 *   웹에서 가장 많이 사용하는 라이브러리 (3대)
 *   ----------------------------------
 *   1. String
 *   2. List
 *   3. Integer(int를 사용하기 편리하게 만든 클래스)
 *      웹 / 윈도우 ==> 모든 데이터형이 (String)
 *      page = 1 => "1" => 1 ==> Wrapper
 *      <input type=text>
 *      JTextField
 *   -----------------------------------
 *   
 *   => 형식)
 *      [접근지정어] interface InterfaceName{
 *      ----------------------------------
 *      
 *      ----------------------------------
 *      상수
 *        int a; ==> error
 *       ( public static final )int a = 10;
 *         ------------------- 자동추가
 *      ----------------------------------
 *      추상메소드
 *        void display();
 *        (public abstract) void display();
 *      ----------------------------------
 *      
 *      ----------------------------------
 *      }
 *      자동추가 
 *      1) import java.lang.* => String, Math...
 *      2) 메소드 => void aaa(){return // 자동추가}
 *      3) 생성자 => class A{
 *                          => A(){}
 *                         }
 *      4) 인터페이스 
 *         변수 선언 -> (public static final) int a =10;
 *                     ------------------- 
 *                    (public abstract) void dis...();
 *                     --------------- 
 *                    구현이 가능한 메소드
 *                    (public)default void aaa() 
 *         interface는 상수, 메소드 상관없이 public 만 사용한다.
 *      = 선언만 되어있다. => 상속을 내린다 
 *        => 상속받은 클래스를 구현해서 사용(오버라이딩)
 *      = 다중 상속을 지원한다.
 *        ------
 *        상속과정
 *        ------
 *        interface A
 *        class B extends A -> error
 *                ------- 확장해서 사용
 *        class B implements A 
 *                --------- 구현후에 사용
 *                
 *        interface ---> interface
 *        interface A
 *        interface B (extends) A
 *        -------------------------------
 *        interface ---> class
 *        interface A
 *        class B (implements) A
 *        -------------------------------
 *        class -> interface
 *        class A
 *        interface B (    ) A => error
 *        
 *        interface A
 *        interface B extends A
 *        class C implements B ---> 단일 상속
 *                                     
 *        interface A
 *        interface B
 *        class C implements A,B  ===> 다중 상속
 *        
 *        interface A
 *        interface B
 *        class C
 *        class D extends C implement A,B 
 *        
 *        class E extends JFrame implements MousteListener,KeyListener,ActionListener, Runnable
 *        
 *        => game : 마우스이동, 키보드이동, 버튼 이동, 쓰레드...
 *        
 *        247page 형식
 *        일반 메소드
 *        interface A{
 *            JDK 1.8 이상 -> 구현된 것을 지원
 *            default void display();
 *            void doGame(); // public abstract 생략
 *        
 *        }
 *        interface A{
 *            (public abstract)void aaa();
 *        
 *        
 *        }
 *        class B implements A{
 *        
 *            void aaa(){} => error // 접근 지정어가 default 로 설정되어 지정어 축소에 의해 오류 발생
 *            
 *        }
 *        class B implements A{
 *        
 *            public void aaa(){}  // 접근지정어를 public으로 설정해야 한다.
 *            
 *        }
 *        249 page
 *        1) 인터페이스는 객체를 생성할 수 없다.(구현이 안된 메소드를 가지고 있기 때문에
 *         메모리에 저장이 불가능)
 *         인터페이스 = new 구현한 클래스();
 *         => 거짓말이다(익명의 클래스를 이용하면 객체 생성할 수 있다.)
 *        2) 인터페이스는 다중상속이 가능하다.
 *           class A implements 인터페이스1, 인터페이스2, ...
 *   
 */
//interface A{
//	public int a =10; // public 을 써야한다.
//	void display(); // public abstract 가 생략되어 있음 , public 도 가능 
//	
//}
interface AA{
	int a =10;
	void aaa();
}
interface BB{
	int a = 10;
	void bbb();
} 
class CC implements AA,BB{  //CC cc => aaa() , bbb() ,print()
	// AA.a , BB.a 같은 변수명도 상관 없다.
	public void print() {
		System.out.println("AA = "+AA.a); //interfaceName.변수명
		System.out.println("BB = "+BB.a);
	}

	@Override
	public void bbb() {
		// TODO Auto-generated method stub
		System.out.println("BB.bbb() 구현");
	}

	@Override
	public void aaa() {
		// TODO Auto-generated method stub
		System.out.println("AA.aaa() 구현");
	}
	
}
/*
 *    class A
 *    class B extends A ==> B
 *    class C extends A
 *    class D extends A
 *    class E extends A
 *    class F extends A
 *    class G extends A
 *    class H extends A
 *    class I extends A ==> 8개의 객체를 생성(여러개를 동시에 처리하는 경우)보다는 A객체 하나만으로 제어하는것이 편하다.
 *    
 *    A a = new A() => 드물다
 *    B b = new B()  => 한개짜리 
 *    
 *    =>  추상 클래스, 인터페이스 => 상속받은 클래스를 한번에 제어
 *    
 */
public class 인터페이스 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		CC c =new CC(); // 다중 상속시에는 클래스 자체를 선언해야 활용도가 높다.
//		c.print();
		CC c = new CC(); // aaa(), bbb(), print() 접근가능
		c.print();
		c.aaa();
		c.bbb();
		
		///////////////////////////////
		
		
		AA aa = new CC(); //묵시적 형변환 implements 도 extends와 동일하게 적용
		// bbb()는 호출할 수 없다.
		// aaa() 만 접근가능
		aa.aaa();
		
		BB bb = new CC();
		// bbb() 만 접근가능
		bb.bbb();
		
	}

}
