import java.util.Scanner;
public class Program5 {
//  public static void main(String[] args)
//    {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Input the string: ");
//        String str = input.next();
//        upperLowerDigitChar(str);
//    }
 public static String upperLowerDigitChar(String str)
    {	
	 	char ch = 0;
        int length =str.length();
        String s = null;
        for (int i = 0; i < length; i++)
        {	
        	ch =str.charAt(i);
        	int val=ch;
            if((val>=65 &&val<=90)) {
            	s=ch+" is a capital letter";
            }else if(ch>=97 && ch<=122){
            	s=ch+" is a small letter";
            }else if((ch>0 && ch<=47)||(ch>=58 && ch<=64)||
               (ch>=91 && ch<=96)||(ch>=123 && ch<=127)) {
            	s=ch+" is a special symbol";
            }else {
            	s=ch+" is a digit";
            }
        }
        
        return s;
    }
 
}