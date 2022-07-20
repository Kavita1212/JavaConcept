package redoPractice19072022;

public class StaticCommonProp {
	static String collegeName = "Rungta";
	String name;
	int rollNo;

	public StaticCommonProp(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
	}

	public static void main(String[] args) {
		StaticCommonProp s1 = new StaticCommonProp("ajeet", 123);
		StaticCommonProp s2 = new StaticCommonProp("kumar", 23);
		StaticCommonProp s3 = new StaticCommonProp("ajeet", 14);
		
		System.out.println(s1.name);
		System.out.println(s1.rollNo);
		System.out.println(collegeName);
		System.out.println(s1.hashCode());
		
		System.out.println("==========");

		System.out.println(s2.name);
		System.out.println(s2.rollNo);
		System.out.println(collegeName);
		System.out.println(s2.hashCode());
		
		System.out.println("==========");


		System.out.println(s3.name);
		System.out.println(s3.rollNo);
		System.out.println(collegeName);
		System.out.println(s3.hashCode());

	}

}
