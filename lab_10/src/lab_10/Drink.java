package lab_10;

public class Drink extends Coffee{
	private int type;
	private char size;
	
	Drink(int type, char size) {
		this.type = type;
		this.size= size ;
	}
	Drink() {
		this(0,' ');
	}
	public String getTypeName() {
		if(type==1) {
			return "Hot";
		}else if(type == 2) {
			return "Cold";
		}else {
			return null;
		}
	}
	public int getTypePrice() {
		if(type==1) {
			return 10;
		}else if(type == 2) {
			return 20;
		}else {
			return 0;
		}
	}
	public String getSizeName() {
		if(size=='S'||size=='s') {
			return "Small";
		}else if(size=='M'||size=='m') {
			return "Medium";
		}else if(size=='L'||size=='l') {
			return "Large";
		}else {
			return null;
		}
	}
	public int getSizePrice() {
		if(size=='S'||size=='s') {
			return 15;
		}else if(size=='M'||size=='m') {
			return 20;
		}else if(size=='L'||size=='l') {
			return 25;
		}else {
			return 0;
		}
	}
	public int getTotalprice() {
		return getSizePrice()+ getTypePrice();
	}

}
