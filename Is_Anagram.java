
public class Is_Anagram {
	public static void main(String[] args) {
	    String s1="Heart";
	    String s2="Earth";
		System.out.print(isAnagram(s1, s2));
	}
	public static boolean isAnagram(String s1, String s2){
	    int n1=s1.length();
	    int n2=s2.length();
	    if(n1!=n2){
	    return false;
	    }
	    if(n1==n2){
	        int[] a=new int[26];
	        int[] b=new int[26];
	        for(int i=0;i<n1;i++){
	            int ch=(int)s1.charAt(i);
	            if(ch>=97 && ch<=122){
	            int index1=ch-97;
	                a[index1]++;
	            }
	            if(ch>=65 && ch<=90){
	            int index1=ch-65;
	                a[index1]++;
	            }
	        }
	        for(int i=0;i<n2;i++){
	            int ch=(int)s2.charAt(i);
	            if(ch>=97 && ch<=122){
	            int index2=ch-97;
	                b[index2]++;
	            }
	            if(ch>=65 && ch<=90){
	            int index2=ch-65;
	                b[index2]++;
	            }
	        }
	        int i=0,j=0;
	        while(i<a.length && j<b.length){
	                if(a[i]!=b[j]){
	                return false;
	            }
	            i++;
	            j++;
	        }
	    }
	    return true;
	}
}
