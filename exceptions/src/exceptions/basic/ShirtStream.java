package exceptions.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ShirtStream {
		public static void main(String[] args) {
			List<Shirt> shirtList = new ArrayList<Shirt>();
			shirtList.add(new Shirt("Pieter Eng", "Red",2500.0));
			shirtList.add(new Shirt("Levis", "Green", 1500.0));
			shirtList.add(new Shirt("Zara", "Green", 3500.0));
			shirtList.add(new Shirt("Wood land", "Red", 3500.0));
			shirtList.add(new Shirt("Buffalo", "Red", 2500.0));
			shirtList.add(new Shirt("Pieter Eng", "Green", 1500.0));
			shirtList.add(new Shirt("Levis", "Red", 2500.0));
			
			// red
			//List<Shirt> red = new ArrayList<>();
			//for (Shirt shirt : shirtList) {
			//	if (shirt.getBrandcolour().equals("Red")) {
				//	red.add(shirt);
			//	}
			//}
			//for (Shirt shirt : red) {
			//	if (shirt.getCost() == 2500) {
					// System.out.println(shirt);
				//}
			//}

			Set<Shirt> streamFilter = shirtList.stream()
					.filter(sh -> (sh.getBrandcolour().equals("Red")) && (sh.getCost() == 2500)).collect(Collectors.toSet());
			System.out.println(streamFilter);
			

			//long greenCount = shirtList.stream().filter(akhilesh ->( akhilesh.getBrandcolour().equals("Green"))
				//	.filter(ram -> ram.getCost() > 2000).count();
			//System.out.println(greenCount);
		}
	
}
