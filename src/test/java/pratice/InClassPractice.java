package pratice;

public class InClassPractice {
	
	static String staticTest = "It will ONLY have 1 copy in Java";
	String noneStaticTest = "It will have multiple copy in Java";
	
	
	static void testStaticMethod() {
		
		System.out.println(staticTest);
		
		
		testStaticMethod();
		
		
	}
	
	
	void testNoneStaticMethod() {
		System.out.println(noneStaticTest);
		System.out.println(staticTest);
		
		testStaticMethod();
		testNoneStaticMethod();
	}

}
