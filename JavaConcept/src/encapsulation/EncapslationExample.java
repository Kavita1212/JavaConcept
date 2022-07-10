package encapsulation;

public class EncapslationExample {
	private String name;

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapslationExample ex = new EncapslationExample();
		ex.setName("Kavita");
		System.out.println(ex.getName());

	}

}
