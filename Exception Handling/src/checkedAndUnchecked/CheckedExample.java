package checkedAndUnchecked;
//exception handled immediately---------------------------------------
import java.io.*;

public class CheckedExample {
	public static void main(String[] args) {
		/*
		 * filereader try and catch block 
		 */
		try {
			FileReader f = new FileReader("aaa.txt");
		}
		catch(FileNotFoundException e){
			System.out.println(e.getMessage());


		}

		/*
		 * try and catch block of for loop 
		 */
		for(int i =1;i<=10;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				System.out.println("handled");
			}
		}
	}
}
