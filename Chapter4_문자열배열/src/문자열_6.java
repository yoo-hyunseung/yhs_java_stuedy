import java.util.ArrayList;
import java.util.Arrays;

public class 문자열_6 {
	public static void main(String[]args) {
		String menu = "원조김밥"
				+ " 2,500원"
				+ "쌀떡볶이"
				+ " 3,500원"
				+ "찹쌀순대"
				+ " 3,500원"
				+ "라면"
				+ " 3,500원"
				+ "쫄면"
				+ " 5,500원";
		System.out.println(menu);
		String[] menus = menu.split("00원");
		for(String s : menus) {
			System.out.println(s+"00원");
		}
//		Arrays.asList(null);

		ArrayList<String> list = new ArrayList<String>();
		list.add("hi");
		System.out.println(list);
		
	}
}
