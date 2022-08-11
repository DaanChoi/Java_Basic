
public class Exam_basic {

	public static void main(String[] args) {
		
		String name = "Choi";
		int a = (int) 1.1;
		double b = 1;
		String c = Integer.toString(a);
		System.out.println("abc" == "abc");
		System.out.println(name.length());
		System.out.println("Hello " + name);
		System.out.println("Hello [[[name]]]".replace("[[[name]]]", "Daan"));
		System.out.println(a);
		System.out.println(b);
		System.out.println(c + " => " + c.getClass());
		System.out.println(Math.ceil(1.3));
		System.out.println(Math.floor(1.3));
		System.out.println(Math.PI);
		
	}

}
