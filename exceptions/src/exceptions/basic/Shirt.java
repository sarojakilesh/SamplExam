package exceptions.basic;

public class Shirt {
	String BrandName; 
	String Brandcolour;
	Double Cost;
	
	public Shirt(String BrandName, String Brandcolour, Double Cost) {
		// TODO Auto-generated constructor stub
		this.BrandName = BrandName;
		this.Brandcolour = Brandcolour;
		this.Cost = Cost;
	
	}

	public String getBrandName() {
		return BrandName;
	}

	public void setBrandName(String brandName) {
		BrandName = brandName;
	}

	public String getBrandcolour() {
		return Brandcolour;
	}

	public void setBrandcolour(String brandcolour) {
		Brandcolour = brandcolour;
	}

	public Double getCost() {
		return Cost;
	}

	public void setCost(Double cost) {
		Cost = cost;
	}

	@Override
	public String toString() {
		return "Shirt [BrandName=" + BrandName + ", Brandcolour=" + Brandcolour + ", Cost=" + Cost + "]";
	}
	

}
