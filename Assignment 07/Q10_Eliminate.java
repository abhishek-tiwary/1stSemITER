import java.util.Arrays;

public class Q10_Eliminate {
    public static int[] eliminateDuplicates(int[] list){
        Arrays.sort(list);
        int arr[]= new int[(list.length/2)];
       int n=0;
        for(int i =0 ; i<list.length-1 ; i++){
            if(list[i]!=list[i+1]){
                arr[n]=list[i];
                n++;
            }
            
        }
        return arr;

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,2,1,6,3,4,5,2};
        System.out.println(Arrays.toString(eliminateDuplicates(arr)));

    }
}
