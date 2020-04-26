import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Frogjmp {

	public static void main(String[] args) {
		int a[] = {3,1,2,4,3};
		System.out.println(solution(a));
	}

    public static int  solution(int[] A) {
        HashMap<String,Integer> map = new HashMap();
        if(A.length == 0 ) return 0;
        int P=0;
        int N = A.length;
        while(P<N-1){
            int firstSum = sum(Arrays.copyOfRange(A,0,P+1));
            int secondSum = sum(Arrays.copyOfRange(A,P+1,N));
            System.out.println(firstSum + " "+ secondSum);
            int min = Math.min(firstSum,secondSum);
            if(map.containsKey("Min")){
                if(map.get("Min") > min){
                    map.put("Min",min);   
                }
            }else{
                map.put("Min",min);   
            }
            P++;
        }
        
        return map.containsKey("Min") ? map.get("Min") : 0;
        
    }
    
    public static int sum(int[] arr){
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        int sum = list.stream().collect(Collectors.summingInt(Integer::intValue));
        return sum;
    }
    
}
