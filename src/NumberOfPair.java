import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class NumberOfPair {
	static HashMap<String,Integer> map = new HashMap<String,Integer>();
	public static void main (String[] args) {
	    Scanner scn = new Scanner(System.in);
	    int totalCases = Integer.valueOf(scn.nextLine());
	    int i =0;
	    String arr1 = "";
	    String arr2 = "";
	    while(i<totalCases) {
	    	String str = scn.nextLine();
	    	arr1 = scn.nextLine();
	    	arr2 = scn.nextLine();
	    	i++;
	    }
	    
	    int a1[] = convertToIntArr(arr1);
	    int a2[] = convertToIntArr(arr2);
	    
	    numberOfPair(a1,a2);
	    
	    System.out.println(""+(map.containsKey("Pair") ? map.get("Pair") : 0));
	}
	
	public static int[] convertToIntArr(String str) {
		return Arrays.asList(str.split(" ")).stream().mapToInt(x -> Integer.valueOf(x)).toArray();
	}
	
	public static BigInteger power(Integer a, Integer b) {
		return new BigInteger(String.valueOf(a)).pow(b);
	}
	
	public static void numberOfPair(int a1[],int a2[]){
	    
	    for(int i=0;i<a1.length;i++){
	        for(int j=0;j<a2.length;j++){
	        	int val = power(a1[i],a2[j]).compareTo(power(a2[j],a1[i]));
	            if(val == 1){
	                if(map.containsKey("Pair")){
	                    map.put("Pair",map.get("Pair")+1);
	                }else{
	                    map.put("Pair",1);
	                }
	            }
	        }
	    }
	    
	}}
