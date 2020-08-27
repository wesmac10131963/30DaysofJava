import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) throws FileNotFoundException {
		try {
				Scanner in = new Scanner(new File("test"));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		LinkedList<String> names = new LinkedList<String>();
			names.push("Caleb");
			names.push("Sue");
			names.push("Sally");
			
			System.out.println(names.remove());
			System.out.println(names.removeFirst());
			System.out.println(names.pop());

		
	}
}