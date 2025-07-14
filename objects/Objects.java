class Dog{
	static int age = 30;
	String name = "shitzhu";
	public String walk(){
		return "Walking";
	}
	public static int sleep(){
		return 11;
	}
	public int teach(){
		return 2;
	}
	public static void main(String [] args){
		Dog d1 = new Dog();
		Dog d2 = new Dog();
		System.out.println(d1.walk());
		System.out.println(sleep());
		System.out.println(d1.teach());
		System.out.println(age);
		System.out.println(d1.name);
		System.out.println("---------------------------------");
		System.out.println(d2.walk());
		System.out.println(sleep());
		System.out.println(d2.teach());
		System.out.println(age);
		System.out.println(d2.name);
	}
}