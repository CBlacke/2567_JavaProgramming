package lab_11;
import java.util.*;
import java.io.*;
public class Lab1101 {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		System.out.print("Input Section: ");
		int section = input.nextInt();
		
		printHeader(section);
		displayStudentList(section);
	}
	public static void printHeader(int sec) {
		System.out.println("**********************************************************");
		System.out.println("\t\tList of Data for Section"+ sec);
		System.out.println("**********************************************************");
	}
	public static void displayStudentList(int sec) throws IOException {
		try(BufferedReader readFind= new BufferedReader(new FileReader("src//txtFile//List107.txt"))) {
			String temp="";
			while ((temp = readFind.readLine())!=null) {
				String[] data = temp.split("\t");
				if(data.length<6) continue;
				int studentSction = Integer.parseInt(data[3]);
				double midTerm = Double.parseDouble(data[4]);
				double finalScore = Double.parseDouble(data[5]);
				if(studentSction == sec){
					System.out.printf("%s %s\t\t%s\t%s\t%s%n",data[0],data[2],midTerm,finalScore,
							determineResult(midTerm,finalScore));
				}
			}
		} catch (IOException e) {
			System.out.print(e);
		}
	}
	public static String determineResult(double Mid,double Final) {
		return (Mid+Final) <=40?"Fail":"Pass";
	}

}
