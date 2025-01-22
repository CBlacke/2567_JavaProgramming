package lab_07;

public class Car {

	private String companyName;
	private String modelName;
	private int year;
	private double mileage;
	
	Car(){
		/*companyName = "Unknow";
		modelName = "Unknow";
		year = 2000 ;
		mileage = 0.0;*/
		this("Unknow","Unknow",2000,0.0);
	}
	
	Car(String companyName, String modelname, int year, double mileage){
		this.companyName= companyName;
		this.modelName=modelname;
		this.year=year>=1886? year:2000;
		this.mileage=mileage;
	}
	public void setCompanyName(String companyname) {
		if(companyname!=null&& !companyname.trim().isEmpty()) {
			this.companyName=companyname;
		}else {
			System.out.print("Error: Invalid company or model name!");
		}
	}
	public String getCompanyName() {
		return this.companyName;		
	}
	public void setModelName(String modelname) {
		if(modelname!=null&& !modelname.trim().isEmpty()) {
			this.modelName=modelname;
		}else {
			System.out.println("Error: Invalid company or model name!");
		}
	}
	public String getModelname() {
		return this.modelName;		
	}
	public void setYear(int year) {
		if(year >= 1886) {
			this.year =year;
		}else {
			System.out.println("Error: Invalid year!");
		}
	}
	public int getYear() {
		return this.year;		
	}
	public double getMileage() {
		return this.mileage;		
	}
	public void display() {
		System.out.println("Company Name: "+ getCompanyName());
		System.out.println("Model Name: "+ getModelname());
		System.out.println("Year: "+ getYear());
		System.out.println("Mileage: "+ getMileage());	
	}
}
