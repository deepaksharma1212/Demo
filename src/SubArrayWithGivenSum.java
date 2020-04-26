import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class SubArrayWithGivenSum {

	static ArrayList<String> finalList = new ArrayList<String>(); 
	public static void main (String[] args) {
	    
	    /*Scanner scn = new Scanner(System.in);
	    int totalCases = scn.nextInt();
	    ArrayList<HashMap<String,String>> list = new ArrayList<HashMap<String,String>>(totalCases);
	    
	    int i =0;
	    while(i<totalCases){
	       System.out.println(scn.nextLine());
	        i++;
	    }
	    
	    for(HashMap<String,String> map : list){
	        int N = Integer.valueOf((map.get("first").split(" "))[0]);
	        int sum = Integer.valueOf((map.get("first").split(" "))[1]);
	        int arr[] =convertToIntArray(map.get("second"));
	        System.out.println(recursive(arr,sum,arr.length-2));
	    }*/
	    String str = "26 144 125 24 173 62 182 4 33 106 194 126 32 93 143 23 87 65 101 188 161 14 175 71 171 36 34 112 161 97 68 86 151 141 95 96 25 20 126 177 95 59 103 172 67 79 194 52 85 19 65 120 153 1 88 61 127 11 158 171 116 177 28 44 159 165 110 83 87 166 88 178 75 26 28 30 129 24 121 103 163 124 197 138 62 196 126 65 61 3 117 31 127 12 172 12 148 154 121 191";
	    int ar[] = convertToIntArray(str);
	    System.out.println(ar[32]);
	    System.out.println(ar[37]);
	    System.out.println(recursive(ar, 528, ar.length-2));
	}
	
	public static String recursive(int[] arr, int sum,int k){
	    int l =0;
	    if(k < 0) return finalList.isEmpty() ? "" : finalList.get(0);
	    if(k == 0) return "-1";
	    while(l<arr.length && l+k+1<=arr.length){
	        if(checkForSum(Arrays.copyOfRange(arr,l,l+k+1),sum)){
	            finalList.clear();
	            if(l+1 == l+k+1) {
	            	finalList.add(l+1+"");
	            }else {
	            	finalList.add((l+1+""+(l+k+1)));	
	            }
	            
	            return finalList.get(0);
	        }
	        l++;
	    }
	    
	    return recursive(arr,sum,k-1);
	}
	
	public static boolean checkForSum(int arr[],int sum){
	    int i=0;
	    int calcSum =0;
	    while(i<arr.length){
	        calcSum += arr[i];
	        i++;
	    }
	    if(calcSum == sum)
	        return true;
	    else 
	        return false;
	}
	
	public static int[] convertToIntArray(String str){
		 return Arrays.asList(str.split(" ")).stream().mapToInt(x -> Integer.valueOf(x)).toArray();
	}
}

