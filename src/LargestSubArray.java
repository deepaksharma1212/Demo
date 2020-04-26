import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

public class LargestSubArray {
	
	private int a;
		 @Override
	public int hashCode() {
		return 112;
	}
	@Override
	public boolean equals(Object obj) {
		return false;
	}
		public static void main(String[] args) throws Exception{ 
			 String s1 = "ABC";
			 String s2 = new String("ABCD");
			// System.out.println(s2.compareTo(s1));
			 char value[]= {'A','B','C'};
			 LargestSubArray sub1 = new LargestSubArray();
			 LargestSubArray sub2 = new LargestSubArray();
			 HashMap<LargestSubArray, String> hm = new HashMap<>();
			 System.out.println(hm.put(sub1, "B"));
			 System.out.println(hm.put(sub2, "A"));
			 System.out.println(hm.put(sub2, "C"));
			 System.out.println(hm);
			 System.out.println(hm.get(sub1));
			 HashSet<LargestSubArray> set = new  HashSet<>();
			 set.add(sub1);
			 set.add(sub2);
			 System.out.println(set);
			 int h = 0;
		        if (h == 0 && value.length > 0) {
		            char val[] = value;

		            for (int i = 0; i < value.length; i++) {
		                h = 31 * h + val[i];
		            }
		            LargestSubArray key = new LargestSubArray();
		            System.out.println(key.hashCode());
		            System.out.println(10&21);
		            System.out.println(((key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16)));
		           System.out.println("ABC"+""+(14 & ((key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16))));
		        }
			 System.out.println(s1.hashCode()+" "+s2.hashCode()+" "+Arrays.toString(s1.getBytes())+" "+h);
		 } 

}
