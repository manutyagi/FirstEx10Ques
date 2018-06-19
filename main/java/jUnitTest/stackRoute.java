package jUnitTest;

public class stackRoute {
	public String funcRepeat(String str,int num) {
		int len = str.length();
		int fromBegin = len-num;
		String s=str.substring(fromBegin, len);
		for(int i=0;i<num;i++) {
			str=str+s;			
		}
		return str;
	}
//	public static void main(String[] args) {
//		stackRoute sr =new stackRoute();
//		System.out.println(sr.stackRouterep("stackroute", 5));
//	}
	
}
