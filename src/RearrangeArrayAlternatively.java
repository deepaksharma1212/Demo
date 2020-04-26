import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RearrangeArrayAlternatively {

	
	public static void main(String args[]) {
		//Scanner scn = new Scanner(System.in);
		int i =0;
		//int totalCases = Integer.valueOf(scn.nextLine());
		List<String> list = new ArrayList();
		/*while(i<totalCases) {
			int totalNumber = Integer.valueOf(scn.nextLine());
			list.add(scn.nextLine());
			i++;
		}*/
		list.add("12 23 28 43 44 59 60 68 70 85 88 92 124 125 136 168 171 173 179 199 212 230 277 282 306 314 316 325 328 336 337 363 365 368 369 371 374 387 394 414 422 427 430 435 457 493 506 527 531 538 541 546 568 583 650 691 730 737 751 764 778 783 785 789 794 803 809 815 847 858 863 874 887 896 916 920 926 927 930 957 981 997");
		for(String str : list) {
			Integer arr[] = convertToIntArray(str);
			Collections.reverse(Arrays.asList(arr));
			rearrangeArray(arr);
			Arrays.asList(arr).stream().forEach(x -> {System.out.print(x+" ");});	
		}
		
	}
	
	public static String displayArray(int[] arr) {
		String str ="";
		for(int i=0;i<arr.length;i++) {
			str += " "+ arr[i];
		}
		return str.trim();
	}
	
	public static void rearrangeArray(Integer arr[]) {
		if(arr.length == 1) return;
		int l = 1;
		int h = arr.length -1;
		while(l < arr.length) {
				int temp = arr[l];
				arr[l] = arr[h];
				rearrange(arr, l+1, temp);
				l+=2;
		}
	}
	
	public static void rearrange(Integer[] arr,int index, int temp) {
			int i =arr.length-1;
			for (; i>index; i--) {
				arr[i] = arr[i-1];
			}
			arr[i] = temp;
	}
	
	
	
	public static Integer[] convertToIntArray(String str){
		return convertToWrapper(Arrays.asList(str.split(" ")).stream().mapToInt(x -> Integer.valueOf(x)).toArray());
	}
	
	public static Integer[] convertToWrapper(int[] arr) {
		return Arrays.stream(arr).boxed().toArray(Integer[]::new);
		
		
	}
	
}
