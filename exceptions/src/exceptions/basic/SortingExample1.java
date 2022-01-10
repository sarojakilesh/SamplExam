package exceptions.basic;


	public class SortingExample1 implements Comparable<SortingExample1> {

		private Integer id;
		private String exName;
		private Double amount;

		@Override
		public int compareTo(SortingExample1 o) {

			//return this.getId() - o.getId();
			return (int) (this.getAmount() - o.getAmount());
			//return this.getExName() - o.getExName();
		}

		public SortingExample1(Integer id, String exName, Double amount) {
			super();
			this.id = id;
			this.exName = exName;
			this.amount = amount;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getExName() {
			return exName;
		}

		public void setExName(String exName) {
			this.exName = exName;
		}

		public Double getAmount() {
			return amount;
		}

		public void setAmount(Double amount) {
			this.amount = amount;
		}

		public SortingExample1() {
			super();
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {
			return "SortingExample1 [id=" + id + ", exName=" + exName + ", amount=" + amount + "]";
		}

	}