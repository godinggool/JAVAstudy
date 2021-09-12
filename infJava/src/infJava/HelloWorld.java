package infJava;
//https://www.inflearn.com/course/java-codesquad/lecture/7206?tab=curriculum
import java.io.PrintStream;
import java.util.Scanner;

class HelloWorld {
	PrintStream out;
	Scanner in;
	
	HelloWorld() {
		out = new PrintStream(System.out);
		in = new Scanner(System.in);
	}


	void start() {
		out.printf("Enter your name: ");
		String name = in.nextLine();
		//in.close();
		
		out.printf("Hello %s!!\n" , name);
	}
	
	void usergugu() {
		out.printf("Enter i,j: ");
		String numbers = in.nextLine();
		in.close();
		GugudanMain.eachNumber(numbers);
	}
	

	public static void main(String[] args) {
		new HelloWorld().start();
		new HelloWorld().usergugu();
//		new GugudanMain(); 
	}
}