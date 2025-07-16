class Static_Variables{
	static String collegeName = "Karunya";
	String name;
	int age;
	Static_Variables(String stu_name, int stu_age){
		name = stu_name;
		age = stu_age;
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("College Name: " + collegeName);
		System.out.println("-----------------------------");
	}
	public static void main(String [] args){
		Static_Variables p1 = new Static_Variables("Chaitanya", 21);
		Static_Variables p2 = new Static_Variables("Sai kumar", 22);
		Static_Variables p3 = new Static_Variables("Chaitanya", 23);
		
	}
}




