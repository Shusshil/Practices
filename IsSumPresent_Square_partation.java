
public class IsSumPresent_Square_partation {
	public static void main(String[] args) {
	    int a[]={2,2,2,5,5,5,6,7};
	   /*  int a[]={-3,-1,0,5,6,7};
	     a=square(a);
	     for(int i=0;i<a.length;i++){
	         System.out.print(a[i]+" ");
	     }*/
		System.out.println(IsSumPresent(a,7));
	}
	public static int IsSumPresent(int[] a,int sum){
	    int start=0, count=0;
	    int end=a.length-1;
	    while(start<end){
	        if(a[start]+a[end]==sum)
	        count++;
	        
	        if(a[start]+a[end]>sum)
	        end--;
	        
	        else
	        start++;
	    }
	    return count;
	}
	public static int[] square(int[] a){
	    int n=a.length;
	    int[] b=new int[n];
	    int i=0, j=n-1, k=b.length-1;
	    while(i<=j){
	        int first=a[i]*a[i];
	        int last=a[j]*a[j];
	        if(first>last){
	            b[k]=first;
	            k--;
	            i++;
	        }
	        else{
	           b[k]=last;
	           k--;
	           j--;
	        }
	    }
	    return b;
	}
	public static void swap(int[] a,int i, int j) {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
   }
   public static int partition(int[] a,int low,int high) {
       int partn=low;
       int pivot=a[high];
       for(int i=low;i<high-1;i++){
           if(a[i]<=pivot){
               swap(a,i,partn);
               partn++;
           }
       }
       swap(a,partn,high);
       return partn;
   }
}
