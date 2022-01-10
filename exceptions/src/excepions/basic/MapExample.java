package excepions.basic;

	import java.util.HashMap;
	//import java.util.Iterator;
	import java.util.Map;
	import java.util.Map.Entry;
	import java.util.Set;

	 class MapExample {

		public static void main(String[] args) {

	
			Map<Integer, String> map = new HashMap<>();
			map.put(1, "Surendra T");
			map.put(2, "Akilesh S");
			map.put(3, "Akilesh S");
			map.put(1, "Surendra T");
			map.put(2, "Akilesh S");

			Set<Entry<Integer, String>> entrys = map.entrySet();

			//Iterator<Entry<Integer, String>> itr = entrys.iterator();
	//while (itr.hasNext()) {
			//	System.out.println(itr.next());
	
			//}
           for
		 (Integer k : map.keySet()) {
				System.out.println(k);
			}
			for (String v : map.values()) {
				System.out.println(v);
			}

			for (Map.Entry<Integer, String> entry : map.entrySet()) // using map.entrySet() for iteration
			{
				// returns keys and values respectively
				System.out.println("Keys " + entry.getKey() + ", Values " + entry.getValue());
			
		}
	}
}
