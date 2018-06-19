import java.util.*;
public class nIteration {
	
	public String iteration(String num) {
		int i,j;
		String s="";
		int n=Integer.parseInt(num);
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++) {
				s+=Integer.toString(i);;
			}
		}
		return s;
	}
}

