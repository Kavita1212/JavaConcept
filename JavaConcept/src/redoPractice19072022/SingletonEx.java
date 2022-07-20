package redoPractice19072022;

//Private constructor - Outside person can't call this contructor and are not allowed to create object
//Private static variable of type sg(singleton)
//Public static method - Write a static method that has return type object of this singleton class(SingletonEx)

public class SingletonEx {

	
	private static SingletonEx sg;
	private SingletonEx() {
		
	}
	public static SingletonEx getInstance() {
		if(sg==null) {
			sg=new SingletonEx();
		}
		return sg;
	}
	public static void main(String[] args) {
		SingletonEx s1 = SingletonEx.getInstance();
		SingletonEx s2 = SingletonEx.getInstance();
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
}