
public class Max_Dist_betn_2_same_No {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] c={1,2,4,4,2};
		System.out.print(maxDist(c));
	}
	public static int maxDist(int[] arr){
	    int i=0;
	    int j=arr.length-1;
	    int max_length=0;
	    while(i<=j){
	        if(arr[i]==arr[j]){
	            if((j-i)>max_length){
	               max_length=j-i;
	            }
	            i++;
	            j=arr.length-1;
	        }
	        else{
	            j--;
	        }
	    }
	    return max_length; 
	}
}
