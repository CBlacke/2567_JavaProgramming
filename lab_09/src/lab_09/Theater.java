package lab_09;

public class Theater extends Movie {

	private int theaterNo;
	
	Theater(String id, String name, Director director, int theaterNo){
		super(id, name, director);
		this.theaterNo =theaterNo;
	}
	public String getTheaterName() {
		return super.getName();
	}
	public String toString() {
		return "";
	}

}
 