import java.util.*;
public class Union_And_Intersection {
	public static void main(String[] args) {
	    int[] a={6,5,9,3,2,5};
	    int[] a1={1,2,3,4,5};
	    int[] b=intersection(a, a1);
	    int[] c=union(a,a1);
	    print(b);
	    print(c);
	}
	public static void print(int[] a){
	    for(int i=0;i<a.length;i++){
	        System.out.print(a[i]+" ");
	    }
	    System.out.println();
	}
	public static int[] convertToArray(ArrayList<Integer> list){
	    int[] a=new int[list.size()];
	    for(int i=0;i<list.size();i++){
	        a[i]=list.get(i);
	    }
	    return a;
	}
	public static int[] distinctElement(int[] arr){
	    mergeSort(arr,arr.length);
	    ArrayList<Integer> list=new ArrayList<>();
	    for(int i=0;i<arr.length-1;i++){
	        if(arr[i]!=arr[i+1]){
	            list.add(arr[i]);
	        }
	    }
	    list.add(arr[arr.length-1]);
	    return convertToArray(list);
	}
	public static void merge(int [] a, int []b, int[] merged){

	       int i=0, j = 0, k = 0;

	         while(i<a.length && j<b.length){
               if(a[i]<b[j]){
	           merged[k]=a[i];
	           i++;
	           k++;
	        }
	         else{
	         merged[k] = b[j];
	          j++;
	          k++;
	        }
	     }
	      while(i<a.length){
	       merged[k]=a[i];
	        i++;
	        k++;
	        }
	        while(j<b.length){
	          merged[k] = b[j];
	          j++;
	          k++;
	        }
	        }
		public static void mergeSort(int[] arr, int n) {
		    if(n<2)
		    return;
		    
		    int m=n/2;
		    
		    int[] left=new int[m];
		    int[] right=new int[n-m];
		    
		    for(int i=0;i<m;i++){
		        left[i]=arr[i];
		    }
		    for(int i=m;i<arr.length;i++){
		        right[i-m]=arr[i];
		    }
		    
		    mergeSort(left, m);
		    mergeSort(right, n-m);
		    
		    merge(left, right, arr);
		}
	public static boolean binarySearch(int[] a,int t){
	    int s=0;
	    int e=a.length-1;
	    while(s<=e){
	        int m=s+(e-s)/2;
	        if(t==a[m]){
	        return true;
	        }
	        if(a[m]>t)
	        e=m-1;
	        else
	        s=m+1;
	    }
	    return false;
	}
	public static int[] intersection(int[] arr1, int[] arr2){
	    arr1= distinctElement(arr1);
	    arr2= distinctElement(arr2);
	    ArrayList<Integer> list=new ArrayList<>();
	    for(int i=0;i<arr1.length;i++){
	        if(binarySearch(arr2,arr1[i])){
	        list.add(arr1[i]);
	        }
	    }
	    int[] a=convertToArray(list);
	    return a;
	}
	public static int[] union(int[] arr1, int[] arr2){
	    int n=(arr1.length+arr2.length);
	    int[] res=new int[n];
	    int i=0,j=0,k=0;
	    while(i<arr1.length && j<arr2.length){
	        res[k++]=arr1[i++];
	        res[k++]=arr2[j++];
	    }
	    while(i<arr1.length){
	       res[k++]=arr1[i++]; 
	    }
	    while(j<arr2.length){
	       res[k++]=arr2[j++]; 
	    }
	    res=distinctElement(res);
	    return res;
	}
}
