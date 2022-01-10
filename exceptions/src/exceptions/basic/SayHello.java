package exceptions.basic;

public class SayHello {
   String  name;
   public static void main(String[] args) 
   {
	   SayHello say = new SayHello();
	   say.sayHi("Surendra");
	   say.name = say.sayhelllo();
	   System.out.println(say.name);
	
}
  
   	public void sayHi(String name) {
   		System.out.println("Hi  "+name);
   	}
   	
   	public String sayhelllo() {
		return "Äkhil";
   		
   	}
}
