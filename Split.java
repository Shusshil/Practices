import java.util.*;
public class Split {
	public static void main(String[] args) {
	    String s="ab, pq, ,tz ";
	    String[] str=split(s,',');
	    for(int i=0;i<str.length;i++){
		System.out.print(str[i]);
	    }
	}
	public static String[] split(String s, char separator){
	    ArrayList<String> list=new ArrayList<>();
	    String str="";
	    for(int i=0;i<s.length();i++){
	        if(s.charAt(i)==separator){
	            list.add(str);
	            str="";
	            continue;
	        }
	        str+=s.charAt(i);
	    }
	    list.add(str);
	    String[] a=new String[list.size()];
	    for(int i=0;i<a.length;i++){
	        a[i]=list.get(i);
	    }
	    return a;
	}
}
