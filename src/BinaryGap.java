import java.util.HashMap;

public class BinaryGap {

	public static void main(String[] args) {
	System.out.println(solution(6291457));
	System.out.println(Integer.toBinaryString(6291457));
	}

    static HashMap<String,Integer> map = new HashMap();
    public static int solution(int N) {
       String string = Integer.toBinaryString(N);
       recursive(string,null);
       return map.size() == 0 ? 0 : map.get("Size");
    }
    
    public static void recursive(String binaryString, String firstChar){
        
        if(binaryString == null || binaryString.length() == 0)
            return;
        String first = String.valueOf(binaryString.charAt(0));
        if(firstChar != null){
            if(first.equals("1")){
             recursive(binaryString.substring(binaryString.indexOf("1")+1),null);
            }else{
                if(binaryString.indexOf("1") != -1){
                    if(map.containsKey("Size")){
                        if(!(map.get("Size") > binaryString.substring(0,binaryString.indexOf("1")).length()-1)){
                               map.put("Size",binaryString.substring(0,binaryString.indexOf("1")).length()-1);
                        }
                    }else{
                        map.put("Size",binaryString.substring(0,binaryString.indexOf("1")).length()-1);
                    }   
                    recursive(binaryString.substring(binaryString.indexOf("1")+1),null);
                }
            }
        }else{
            if(first.equals("1")){
            recursive(binaryString.substring(binaryString.indexOf("1")+1),first); 
            }
        }
            
    }

}
