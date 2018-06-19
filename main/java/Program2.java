import java.util.Scanner;

public class Program2 {
		
		public boolean isEven(String no) {
			int num = Integer.parseInt(no);
			if(num%2==0) {
				return true;
			}else {
				return false;
			}	
		}
		
		public boolean rangeCheck(String no) {
			int num = Integer.parseInt(no);
			if(num>20&&num<30) 
					return true;
				else
					return false ;
			}
		public String printStatements(String no) {
			if(rangeCheck(no)) {
				if(isEven(no)) {
					return "Jerry";
				}else {
					return "Tom";
				}
			}else {
				return "";
			}
		}
		
}