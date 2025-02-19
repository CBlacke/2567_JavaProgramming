package lab_10;

public class Barista {
	private String name;
	private char gender;
	
	Barista(String name, char gender) {
		this.name=name;
		this.gender = gender;// TODO Auto-generated constructor stub
	}
	public Barista(String name) {
		this(name, '0');
	}
	public String getName() {
		return this.name;
	}
	public String getGenderName() {
		if(this.gender == 'm'||this.gender == 'M') {
			return "Male";
		}
		else if(this.gender == 'f'||this.gender == 'F') {
			return "Female";
		}
		else {
			return "null";
		}	
	}
}
