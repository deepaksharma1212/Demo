
public class OddOccurenece {

	public static void main(String[] args) {
		int a[] = {9, 3, 9, 3, 9, 7, 9};
		System.out.println(solution(a));
	}
	
	 public static int solution(int[] A) {
	        boolean flag = false;
	        if(A.length == 0) return 0;
	        for(int i=0;i<A.length-1;i++){
	            flag = false;
	            for(int j=i+1;j<A.length;j++){
	                if(A[i] == A[j]){
	                    flag = true;
	                    break;
	                }
	            }
	            if(flag == false){
	                return A[i];
	            }
	        }
	        return 0;
	    }

}
