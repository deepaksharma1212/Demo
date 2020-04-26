import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class InversionOfArray {
	 static HashMap<String,Integer> map = new HashMap<String,Integer>();
		public static void main (String[] args) {
		    Scanner scn = new Scanner(System.in);
		    Integer totalCases = Integer.valueOf(scn.nextLine());
		    
		    int i=0;
		    List<String> list = new ArrayList<String>();
		    while(i<totalCases){
		        scn.nextLine();
		        list.add(scn.nextLine());
		        i++;
		    }
	        	    
		    for(String str : list){
		        map.clear();
		        int arr[] = convertStrToInt(str);
		        inversion(arr);
		        System.out.println(""+(map.containsKey("Count") ? map.get("Count") : 0));
		    }
		}
		
		public static void inversion(int[] arr){
		    for(int i=0;i<arr.length;i++){
		        for(int j=i+1;j<arr.length;j++){
		            if(arr[i] > arr[j]){
		                if(map.containsKey("Count")){
		                    map.put("Count",map.get("Count")+1);
		                }else{
		                    map.put("Count",1);
		                }
		            }
		        }
		    }
		}
		
		
		public static int[] convertStrToInt(String str){
		    return Arrays.asList(str.split(" ")).stream().mapToInt(x -> Integer.valueOf(x)).toArray();
		}
}
