package lab_10;
import java.util.*;
public class FictionDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("book Title: ");
		String Booktitle = scan.nextLine();
		System.out.print("book Publish year: ");
		int publicYear = scan.nextInt();
		scan.nextLine();
		System.out.print("Author name: ");
		String author_name = scan.nextLine();
		System.out.print("Author email: ");
		String author_Email = scan.nextLine();

		
		FictionBook book1 =new FictionBook(Booktitle, publicYear);
		book1.setAuthorName(author_name);
		book1.setEmail(author_Email);
		while (!book1.checkEmail()) {
			System.out.print("Author email, again: ");
			author_Email = scan.nextLine();
			book1.setEmail(author_Email);	
		}
		Line();
		System.out.print(book1);
		
		scan.close();
		
	}
	
	public static void Line() {
		for(int i =0;i<20;i++) {
			System.out.print("=");
		}
		System.out.print("\n");
	}

}
