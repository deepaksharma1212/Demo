import java.util.HashMap;

public class GCM {

	
	public static HashMap<String, Integer> map = new HashMap<String, Integer>();
	
	public static void main(String args[]) {
		
		System.out.println("ABCDS".substring(0,2));
		System.exit(0);
		int firstNumber = 14;
		int secondNumber = 28;
		
		
		gcm(firstNumber,secondNumber,2);
		
		System.out.println(map.containsKey("GCM") ? map.get("GCM") : 1);
	}
	
	public static void gcm(int first, int second, int num) {
		if( first <= 1 || !(num <= first) ) return;
		
		if(first%num == 0 && second%num == 0) {
			if(map.containsKey("GCM")) {
				map.put("GCM", map.get("GCM")*num);
			}else {
				map.put("GCM", num);
			}
				gcm(first/num,second/num,num);
		}else {
			gcm(first,second,num+1);
		}
		
	}
}
