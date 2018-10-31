	package algorithms;

// TODO: Auto-generated Javadoc
/**
 * The Class BinarySearch: Array must be Pre-Assorted Ascending order.
 */
public class BinarySearch {

	/**
	 * Recursive.
	 *
	 * @param arr int[]
	 * @param x int target to find
	 * @param left index of first element in range
	 * @param right index of last element in range
	 * @return index of target x
	 */
	public static int recursive(int[] arr, int x,int left,int right) {
		
	int mid=0;
		
if(right>=left)
{
		mid= left+ (right-left)/2;
		
		if(arr[mid]==x)
			return mid;
		
		if(x>arr[mid]) 
			return recursive(arr,x,mid+1,right);
		
		if(x<arr[mid]) 
			return recursive(arr,x,left,mid-1);
	
		return -1;
}

else return -1;
	}
	
	
	/**
	 * Iterative Binary Search:  T(n)= Log n.
	 *
	 * @param arr the array
	 * @param x the target integer inside arr
	 * @return the index of x
	 */
	public static int iterative(int[] arr, int x) {
	
		int left =0;  		int right =arr.length-1;
		
		while(right>=left) {
			
			int mid= left+ (right-left)/2;
			
			if(arr[mid]==x)
				return mid;
			
			else if(x>arr[mid]) 
				left=mid+1;
			
			else if(x<arr[mid])
				right=mid-1;
			
		}
		return -1;
		
	}
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		
		int[] array = { 2, 2, 4, 5, 6, 7, 9, 10 };   //MUST BE ORDERED: ASCENDING
	
		System.out.println(recursive(array, 5, 0, 8) );
		System.out.println(iterative(array, 5));
		}
		
		

	

}
