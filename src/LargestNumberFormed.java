import java.util.Arrays;

public class LargestNumberFormed {
	
	public static void main (String[] args) {
		int arr[] = {54,546,548,60};
		String largestNumber = "";
		int larger =0;
		System.out.println(greaterNumber(991, 99));
		for(int i =0;i<arr.length;i++){
		    Integer large = arr[i];
		    int lastIndex = 0;
		    for(int j=i+1;j<arr.length;j++){
		            large = greaterNumber(arr[i], arr[j]);
		            if(large == arr[j]) {
		            	swap(arr,i,j);
		            }
		            if(larger < large) {
		            	if(large == arr[i]) lastIndex = i;
			            else lastIndex = j;
		            	larger = large;
		            }
		            System.out.println("Greater number between "+arr[i]+" and "+arr[j]+" is "+large);
		    }
		   //swap(arr,i,lastIndex);
		   System.out.println("After Swapping "+ Arrays.toString(arr));
		   
		}
		
		
	}

	public static int greaterNumber(int i,int j) {
			
		int tempi =i;
		int tempj = j;
			if(String.valueOf(i).length() == String.valueOf(j).length()) {
				return greatest(i, j);
			}
			if(i>9) {
				tempi = compute(i);
			}
			if(j>9) {
				tempj = compute(j);
			}
			
			if(tempi != tempj) {
				int larger = greatest(tempi, tempj);
				if(larger == tempi)
					return i;
				else
					return j;
			}else {
				int larger = 0;
				int tempiRemin = String.valueOf(i).length() != 1 ? i%((int)(Math.pow(10, (String.valueOf(i).length() -1)))) : -1;
				int tempjRemin = String.valueOf(j).length() != 1 ? j%((int)(Math.pow(10, (String.valueOf(j).length() -1)))) : -1;
				
				if(tempiRemin == 0) tempiRemin = tempi;
				if(tempjRemin == 0) tempjRemin = tempj;
				
				if(tempiRemin == -1 && tempjRemin == -1) {
					return i;
				}else if(tempiRemin == -1 ) {
					larger = greaterNumber(i,tempjRemin);
					tempiRemin = i;
				}else if(tempjRemin == -1 ) {
					larger = greaterNumber(tempiRemin,j);
					tempjRemin = j;
				}else
					larger = greaterNumber(tempiRemin,tempjRemin);
//				int larger = greaterNumber(tempiRemin,tempjRemin);
//				
				if(larger == tempiRemin) {
					return i;
				}else return j;

				
			}
			
	}
	
	public static int compute(int number) {
		return (int) (number/Math.pow(10, (String.valueOf(number).length() -1)));
	}
	
	public static int computeReminder(int number) {
		return (int) (number/Math.pow(10, (String.valueOf(number).length() -1)));
	}
	
	public static int greatest(int i ,int j) {
			if(i>j) return i;
			if(j>i) return j;
			return -1;
	}
	
	public static void swap(int arr[],int i , int j) {
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

}