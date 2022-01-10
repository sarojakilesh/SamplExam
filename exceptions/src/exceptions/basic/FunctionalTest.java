package exceptions.basic;

public class FunctionalTest {
	public static void main(String[] args) {
		FunctionalInterFaceEx ex = new FunctionalInterFaceEx() {
		//	@Override
		public Integer result(int a, int b) {
			return a + b;
		}

			@Override
			public void sayHlo(String name) {
				// TODO Auto-generated method stub
				
	    }
		};
		 System.out.println(ex.result(1000, 20000));

			
		//FunctionalInterFaceEx akilesh = (a, b) -> {return a * b;};
		//System.out.println(akilesh.result(70, 80));}
		
		 }
}
	
