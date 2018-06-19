public class stackRoute {
	public String func(String str,String num) {
		int len = str.length();
		int n;
		try {
			n=Integer.parseInt(num);
		}catch(NumberFormatException e){
			return "Invalid number";
		}
		if(len==0) {
			return "Empty String";
		}if(n>len) {
			return "Index out of bounds";
		}else {
		int fromBegin = len-n;
		String s=str.substring(fromBegin);
		for(int i=0;i<n;i++) {
			str=str+s;			
		}
		return str;
		}
	}
//	public static void main(String[] args) {
//		stackRoute sr =new stackRoute();
//		System.out.println(sr.stackRouterep("stackroute", 5));
//	}
	
}
