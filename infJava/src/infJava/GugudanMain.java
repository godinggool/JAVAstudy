package infJava;
//https://www.inflearn.com/course/java-codesquad/lecture/7206?tab=curriculum
public class GugudanMain {
	
	static void eachNumber(String numbers) {
		String[] a = numbers.split(",");

		int first = Integer.parseInt(a[0]);  
		int second = Integer.parseInt(a[1]);  
		
		int[] result = Gugudan.calculate(first,second);
		Gugudan.print(result);
	}
}	

