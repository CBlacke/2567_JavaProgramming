package lab_09;

public class Movie {

	private String id;
	private String name;
	private Director director;
	
	Movie(String id, String name, Director director){
		this.id=id;
		this.name=name;
		this.director=director;
	}
	public String getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public Director geDirector() {
		return this.director;
	}
	public void setDirector(Director director) {
		this.director = director;
	}
	public String toString() {
		return "";
	}

}
