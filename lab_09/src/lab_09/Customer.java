package lab_09;

public class Customer {

		private int id;
		private String name;
		private int discount;
		
		public Customer(int id,String name,int discount) {
			this.name = name;
			this.id = id;
			this.discount = discount;
		}
		
		public int getID() {
			return this.id;
		}
		public String getName() {
			return this.name;
		}
		public int getDiscount() {
			return this.discount;
		}
		
		public void setDiscount(int discount){
			this.discount = discount;
		}
		
		public String toString() {
			return getName() + "(" + getID() + ")(" + getDiscount() + "%)";
		}

}
