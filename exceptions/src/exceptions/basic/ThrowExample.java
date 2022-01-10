package exceptions.basic;


public class ThrowExample {
	static String user = "Surendra";
	
	public static void main(String[] args) {
		if(user.equals("Surendra")) {
			System.out.println("Welcome !!");
		}
		else {
			try {
				throw new UserNameNotFounException();
			} catch (UserNameNotFounException e) {
				throw new UserNameNotFounException("Please enter valid user name", e);
			}
			
		}
		
		System.out.println("Your creadentials : Pandu..#1");
	}
}
