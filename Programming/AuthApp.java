
public class AuthApp {

	public static void main(String[] args) {
		
		String[][] users = {
				{"daan", "1111"},
				{"tom", "2222"},
				{"jin", "3333"}
		};
		String id = args[0];
		String pw = args[1];
		String[] current = new String[1]; // 배열 선언 : String[] = (String형 데이터가 담긴 배열이다), new = (할당, 생성 키워드) String[1] = (배열 크기)
		boolean isLogined = false;
		for(int i = 0; i < users.length; i++) {
			current = users[i];
			if(current[0].equals(id) && current[1].equals(pw)) {
				isLogined = true;
				break;
			}
		}
		if(isLogined == true) {
			System.out.println("Hello Master!");
		} else {
			System.out.println("Who are you?");
		}

	}

}
