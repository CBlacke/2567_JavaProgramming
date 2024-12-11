package lab_03;
import java.util.*;
public class SecurePasswordCheker {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true)
		{
			System.out.print("Enter your password(type 'exil' to quit)");
			String password = scan.nextLine();
			if(password.equalsIgnoreCase("exil"))
			{
				System.out.println("Program terminate");
				break;
			}
			String errors = "";
			if(password.length()<8)
			{
				errors += "- Password must be al least 8 character long.\n";
			}
			boolean hasUpper = false;
			boolean haslower = false;
			boolean hasDigit = false;
			for(int i =0 ;i<=password.length()-1;i++)
			{
				char ch = password.charAt(i);
				if(ch>='A'&&ch<='Z')
				{
					hasUpper=true;
				}
				else if(ch>='a'&&ch<='z')
				{
					haslower=true;
				}
				else if(ch>='0'&&ch<='9')
				{
					hasDigit=true;
				}
			}
			if(!hasUpper)
			{
				errors += "- Password must not contain at lease one uppercase letter(A-Z).\n";
			}
			if(!haslower)
			{
				errors += "- Password must not contain at lease one lower letter(a-z).\n";
			}
			if(!hasDigit)
			{
				errors += "- Password must not contain at lease one digit letter(0-9).\n";
			}
			
			if(errors.isEmpty())
			{
				System.out.print("Your password is secure.");
				break;
			}
			else 
			{
				System.out.println("Password validation errors.");
				System.out.println(errors);
			}
		}
		
		scan.close();

	}

}
