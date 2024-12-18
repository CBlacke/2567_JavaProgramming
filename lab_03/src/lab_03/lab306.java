package lab_03;
import java.util.*;
public class lab306 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 
        //variable
        String inputMessage;
        int countNichi = 0;
 
        //input
        System.out.print("Message: ");
        inputMessage = scan.nextLine();
        if (inputMessage.toLowerCase().indexOf("nichi")>=0) {
            countNichi++;
 
        }
       
        if (countNichi > 0) {
            System.out.println("Nichi is a sentence");
        }
        else {
            System.out.println(inputMessage);
        }
 
 
       
        scan.close();

	}

}
