package lab_03;
import java.util.*;
public class lab303 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int space=0, word=0;
		System.out.print("Input a sentence : ");
		String sentence = input.nextLine();
		
		while(!sentence.endsWith("."))
		{
			System.out.print("Input a sentence, again: ");
			sentence = input.nextLine();
		}
		for(int i=0;i<=sentence.length()-1;i++)
		{
			char ch = sentence.charAt(i);
			if(ch == ' ')
			{
				space++;
			}
		}
		String text[] = sentence.split(" ");
        for (int i=0;i<text.length;i++){
            word++;
        }
		System.out.println("This sentence has "+ space + " spacebar.");
		System.out.println("This sentence has "+ word + " word.");
	}

}
