package streaming;
import java.util.Scanner;
import java.io.*;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		try {
			Scanner in = new Scanner(new File("P:\\Downloads\\me_at_the_zoo.in"));
		} catch (FileNotFoundException e) {
			System.out.print("byebye birdie");
		}
	}
}
