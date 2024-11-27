import java.util.*;
import java.text.*;
public class javalab_02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input the number of minutes: ");
		int minustes = input.nextInt();
		int Mperyear = 60*24*365;
		int Mperday = 60*24 ;
		int year = minustes/Mperyear;
		int remainmin = minustes%Mperyear;
		int day = remainmin/Mperday;
		
		System.out.println(minustes+" minutes is approximately "+ year +" years and "+day+" days" );

	}

}
