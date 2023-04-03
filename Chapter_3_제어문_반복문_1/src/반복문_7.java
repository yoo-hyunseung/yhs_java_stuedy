// 1~100까지 사이 반복수행
// 11, 22, 33, 44, 55 이면
// 두개는 같은 정수입니다. /다른 정수입니다.를 출력
public class 반복문_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i =10 ; i <100; i++) {
			if(i%11 == 0) {
				System.out.println(i+" 는 두개는 같은 정수입니다.");
			}
			else {
				System.out.println(i+" 다른 정수입니다.");
			}
		}
	}

}
