import java.util.Scanner;
public class stringReverse {
	public String reverseString(String str) {
		int len=str.length();
		String rev="";
		for(int i=len-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		return rev;
	}
}
//public static void main(String []args) {
//	String s,rev="";
//	Scanner sc =new Scanner(System.in);
//	s=sc.nextLine();
//	int len =s.length();
//	for(int i=len-1;i>=0;i--) {
//		rev =rev +s.charAt(i);
//	}
//	System.out.println(rev);
//}
//}

