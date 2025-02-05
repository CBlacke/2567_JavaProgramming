package lab_09;

public class Director {

	private String name;
	private String email;
	private char gender;
	
	Director(String name, String email, char gender){
		this.name =name;
		this.email=email;
		this.gender=gender;
	}
	Director(String name, String email){
		this(name,email,'0');
	}
	public String getName() {
		return this.name;
	}
	public String getEmail() {
		return this.email;
	}
	public String getGender() {
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
	public String toString() {
		return "";
	}

}
