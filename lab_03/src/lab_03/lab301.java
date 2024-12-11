package lab_03;
import java.util.*;
public class lab301 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		String text = "";
		String word = "";
		while(true)
		{
			System.out.print("Enter word: ");
			word = kb.next();
			if(word.equalsIgnoreCase("stop"))
			{
				System.out.println("Program Terminate");
				break;
			}
			text += word.toUpperCase()+" ";
		}
		System.out.println(text);
		
		kb.close();

	}

}
