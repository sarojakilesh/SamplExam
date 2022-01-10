package exceptions.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bieber {
	public static void main(String[] args) {
		List<Justin> justin = new ArrayList<>();
		justin.add(new Justin("Varanasi"));
		justin.add(new Justin("Kedarnath"));
		justin.add(new Justin("Bhadrinath"));
		justin.add(new Justin("Nasik"));
		justin.add(new Justin("Rameswaram"));
		//Collections.sort(justin);
		//justin.stream().map(s->s.name).forEach(System.out::print);
		Collections.reverse(justin);
		justin.stream().map(s->s.name).forEach(System.out::print);
		
		
	}

}
