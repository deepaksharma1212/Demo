import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeSet;

public class FindLongestSubArrayWithGivenSum {

	static HashMap<String, Integer> map = new HashMap<String, Integer>();
	public static void main(String args[]) {
		int arr[] = {0,1,2,3,1,1,5};
		int sum = 5;
		System.out.println(recursive(arr, sum, arr.length-2));
	}
	
	public static int recursive(int arr[],int sum,int k) {
		int l =0;
		if(k==0) return map.containsKey("Sum") ? map.get("Sum") : 0;
		
		while(l<arr.length && l+k+1<=arr.length) {
			checkForSum(Arrays.copyOfRange(arr, l, l+k+1), sum);
			l++;
		}
		return recursive(arr, sum, k-1);
	}
	
	public static void checkForSum(int[] arr,int sum) {
		Arrays.sort(arr);
		int i=0;
		int calcSum =0;
		while(i<arr.length) {
			calcSum += arr[i];
			if(calcSum == sum) {
				if(map.containsKey("Sum") ){
						if( map.get("Sum") < i+1) map.put("Sum", i+1);
						return;
				}else {
					map.put("Sum", i+1);
					return;
				}
			}else if(calcSum > sum) {
			if(map.containsKey("Sum") ){
					if( map.get("Sum") < i) map.put("Sum", i);
					return;
			}else {
				map.put("Sum", i);
				return;
			}
			}
			i++;
		}
	}
}
