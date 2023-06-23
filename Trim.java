import java.util.*;
public class Trim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=" ab bc ";
		System.out.print(trim(s));
	}
	public static String trim(String s){
	    int start=0;
	    int end=s.length()-1;
	    for(int i=0;i<s.length();i++){
	        if(s.charAt(i)!=' ')
	        break;
	      start++;
	    }
	    for(int i=s.length()-1;i>=0;i--){
	        if(s.charAt(i)!=' ')
	        break;
	      end--;
	    }
	    String ans="";
	    for(int i=start;i<=end;i++){
	        ans+=s.charAt(i);
	    }
	    return ans;
	}
}
