public class ReverseWords {

	public static void main (String[] args) {
		
		String str = "i.like.this.program.very.much";
		String strArr[] = str.split("\\.");
		String finalArray = "";
		for(int i=strArr.length-1;i>=0;i--){
		    finalArray = finalArray + "." + strArr[i];
		}
		System.out.println(finalArray);
		System.out.println(finalArray.indexOf("."));
	}
}
