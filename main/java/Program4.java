import java.util.Scanner;
public class Program4 {//unspecified number input
public String stringInput(String s) {
	int sum=0;
	String number ="";
	String[] array= s.split(" ");
	String res ="";
	try {
		for(int i=0;i<array.length;i++) {
			
			sum+=Integer.parseInt(String.valueOf(array[i]));
			System.out.println(sum);
		}
		number= Integer.toString(sum);
	}catch(NumberFormatException e) {
		number= "Invalid input";
	}
	
	return number;
}

}
