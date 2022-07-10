
public class SingletonExample {
	
    private static SingletonExample singletonClass;

    private SingletonExample() {
        System.out.println("Singleton Class object created.");
    }

    public static SingletonExample getSingletonClass() {
        if (singletonClass == null) {
            singletonClass = new SingletonExample();
        }
        return singletonClass;
    }

    public static void main(String[] args) {
    	SingletonExample sc1 = SingletonExample.getSingletonClass();
    	SingletonExample sc2 = SingletonExample.getSingletonClass();
    }
}