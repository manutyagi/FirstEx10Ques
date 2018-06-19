import java.util.Scanner;
public class PalindroneProgram {
	
	
	public  String makeReverse(int no) {
		int temp=no;
		int rInt=0,r;
		String s="";
		while(no!=0){    
			   r=no%10;
//			   if(r%2==0) {
//				   dig+=r;
//			   }
			   rInt=(rInt*10)+r;    
			   no=no/10;   
			  }
		if(temp==rInt) {
			s="The number is a palindrome";
		}else {
			s="Not a palindrome";
		}
		return s;
	}



	public  String calculateSum(int no) {
		int temp=no;
		int rInt=0,r,dig=0;
		String s="";
		while(no!=0){    
			   r=no%10;
			   if(r%2==0) {
				   dig+=r;
			   }
			   rInt=(rInt*10)+r;    
			   no=no/10;   
			  }
		if(dig>25&&(temp==rInt)) {
			s="Palindrome and sum >25";
		}else if(dig<25&&(temp==rInt)){
			s="Palindrome and sum <25";
		}else {
			s="Not a palindrome";
		
	}
		return s;
	}


}
