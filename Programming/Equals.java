
public class Equals {

	public static void main(String[] args) {
		
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = new String("Hello");
		
		System.out.println("str1 == str2 : " + (str1 == str2)); // true
		System.out.println("str1 == str3 : " + (str1 == str3)); // false
		System.out.println("str2 == str3 : " + (str2 == str3)); // false
		
		System.out.println("str1 객체 hashcode : " + System.identityHashCode(str1)); // 1694819250
		System.out.println("str2 객체 hashcode : " + System.identityHashCode(str2)); // 1694819250
		System.out.println("str3 객체 hashcode : " + System.identityHashCode(str3)); // 1365202186 
		// => str3는 객체 해시코드가 다른 것을 확인할 수 있고 이와 같은 경우 == 을 사용하면 false가 나온다. 따라서 equals로 문자열을 비교한다.
		
		System.out.println("str1.equals(str3) : " + str1.equals(str3)); // true
		System.out.println("str2.equals(str3) : " + str2.equals(str3)); // true
	}

}
