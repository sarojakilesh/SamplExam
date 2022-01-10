package exceptions.basic;

class FactorialExample{  
	public static void main(String args[]){  
		int i,fact=1;  
		int number=10;//It is the number to calculate factorial    
		for(i=1;i<=number;i++){    
			fact=fact*i;   
			
			System.out.println(fact);
			System.out.println(i);
			System.out.println("''''''''''''''");
		}    
		//System.out.println("Factorial of "+number+" is: "+fact);    
	}  
}  


