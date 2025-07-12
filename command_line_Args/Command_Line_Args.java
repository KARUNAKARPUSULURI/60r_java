class CommandLineArgs{
	public static void main(String[] args){
		System.out.print("Name :");
		System.out.println(args[0]);
		System.out.print("Age :");
		System.out.println(args[1]);
		System.out.print("Gender : ");
		System.out.print(args[2]);
		System.out.print("Add :");
		System.out.print(args[3] + args[4]);//"2" + "2" -> "22"
	}
}

