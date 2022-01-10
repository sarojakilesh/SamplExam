package exceptions.basic;

public class Phython implements Comparable<Phython>{
	String name ;
	
	Phython(String name){
	this.name=name;
	}

	@Override
	public int compareTo(Phython phy) {
		// TODO Auto-generated method stub
		return this.name.compareTo(phy.name);
		
	}

	@Override
	public String toString() {
		return " [name=" + name + "]";
	}
	
}
