class board{
	int no;//0
	String name;//null
	String subject;
	String content;
	String pwd; // 본인여부
	String regdate;
	int hit;
    
}
public class 사용자정의_데이터형_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		board b1 = new board();
		System.out.println("b1 = "+b1);//b1 = board@3f8f9dd6
		b1.no = 1;
		b1.name = "홍길동";
		b1.subject = "메모리 공간 만들기(사용자 정의)";
//		b1.content = "class 를 이용해서 데이터를 모아서 관리";
		b1.regdate = "2023-04-12";
		b1.pwd = "1234";
		System.out.println("게시물 번호 : "+ b1.no);
		System.out.println("작성자 : "+ b1.name);
		System.out.println("게시물 제목 : "+ b1.subject);
		System.out.println("작성일 : "+ b1.regdate);
		System.out.println("내용 : "+ b1.content);
		System.out.println("조회수 : "+b1.hit);
		
		
	}

}
