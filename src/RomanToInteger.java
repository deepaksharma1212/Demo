import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.HashMap;

public class RomanToInteger {
	public static void main (String[] args) {
		//code
		Scanner scn = new Scanner(System.in);
		List<String> list = new ArrayList();
		
		int totalCases = scn.nextInt();
		
		while(totalCases>0){
			list.add(scn.next());
			totalCases--;
		}
		
		HashMap<String,Integer> map = new HashMap();
		map.put("I",1);
		map.put("V",5);
		map.put("X",10);
		map.put("L",50);
		map.put("C",100);
		map.put("D",500);
		map.put("M",1000);
		for(String str : list) {
			System.out.println(convertRomanToInteger("XXIII", map));	
		}
		
	}
	
	public static int convertRomanToInteger(String str,HashMap<String,Integer> map){
	    if(str.length()== 0) return 0;
	    int sum =0;
	    if(str.length() == 1){
	        return map.get(str);
	    }
	    while(str.length()>=1){
	        if(str.length() >1){
	            String firstChar = str.substring(0,1);
	            String secondChar = str.substring(1,2);
	            if(!map.containsKey(firstChar)) str = str.replaceAll(firstChar,"");
	            if(!map.containsKey(secondChar)) str = str.replaceAll(secondChar,"");
	            
	            if(map.get(firstChar) != null && map.get(secondChar) != null){
	                if(map.get(firstChar) >= map.get(secondChar)){
	                    sum += map.get(firstChar);
	                    str = str.substring(str.indexOf(firstChar)+1);
	                }else{
	                    sum += map.get(secondChar) - map.get(firstChar);
	                    str = str.substring(str.indexOf(secondChar)+1);
	                }
	            }else if(map.get(firstChar) != null){
	                sum += map.get(firstChar);
	            }else if(map.get(secondChar) != null){
	                sum += map.get(secondChar);
	            }
	            
	        }else{
	            sum = sum + (map.containsKey(str) ? map.get(str) : 0);
	            str="";
	        }
	    }
	    return sum;
}
}
