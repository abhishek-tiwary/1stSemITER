import java.util.Arrays;

public class Q7_DecToOct {
	static int[] decToOct(int[] arr) {
		int octArr[]=new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			int octNum=0;
			int value=1;
			while(arr[i]!=0){
				int rem=arr[i]%8;
				octNum +=rem*value;
				value=value*10;
				arr[i]=arr[i]/8;
			}
			octArr[i]=octNum;
		}
		return octArr;
	}
	public static void main(String[] args) {
		int array[]= {22,33,35,31,25,59};
		int octArray[]=new int[array.length];
		System.out.println(Arrays.toString(array));
		octArray=decToOct(array);
		System.out.println(Arrays.toString(octArray));
	}

}
