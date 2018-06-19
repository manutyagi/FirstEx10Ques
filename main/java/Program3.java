import java.util.ArrayList;
import java.util.Scanner;
public class Program3 {
	
		public ArrayList<String> isVowel(String str) {
			ArrayList<String> myList=new ArrayList<String>();
			int length =str.length();
			for(int i=0;i<length;i++) {
				char ch =str.charAt(i);
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				myList.add(ch+" is a vowel");
			}else {
				myList.add(ch+" is a consonant");
			}
	}
			return myList;
		}
		}
//  public static void main(String[] args)
//    {
//        Scanner in = new Scanner(System.in);
//        System.out.print("Input the string: ");
//        String str = in.next();
//        vowelsAndConsonants(str);
//    }
// public static void vowelsAndConsonants(String str)
//    {
//        int length =str.length();
//        for (int i = 0; i < length; i++)
//        {	
//        	char ch =str.charAt(i);
//        	int val=ch;
//            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
//            {
//               System.out.println(ch+" is a vowel");
//            }else if((val>=65 &&val<=90)||(val>=97&&val<=122)) {
//            	System.out.println(ch+" is a consonant");
//            }else {
//            	System.out.println("Not a recognisable input");
//            }
//        }
//    }
