class Examples{
	String name = "karuakar";
	public void Sleep(){
		static String name = "sleeping";
		System.out.println(name);
	}
	public static void main(String [] args){
		Examples e1 = new Examples();
	
		e1.Sleep();
	}
}




