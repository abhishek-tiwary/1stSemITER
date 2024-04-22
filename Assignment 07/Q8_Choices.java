import java.util.Arrays;
import java.util.Scanner;
public class Q8_Choices {

    public static int[] createArray(int a, Scanner sc){
        int arr[]= new int[a];
        System.out.println("Enter " + a + " elements for your array");
        for(int i=0; i<a; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Array created successfully");
        return arr;
    }

    public static String displayArray(int[] arr){
        System.out.println("Your array is: " + Arrays.toString(arr));
        return "";
    }

    public static void insertElement(int[] arr, int a, int pos, int newElement){
        int[] array=new int[a+1];
        for(int i=0; i<pos; i++){
            array[i]= arr[i];
        }
        array[pos]= newElement;
        for(int i=pos+1; i<a+1; i++){
            array[i]= arr[i-1];
        }
        System.out.println("The new array is: " + Arrays.toString(array));
    }

    public static void deleteElement(int[] arr, int a, int pos){
        int[] array=new int[a-1];
        for(int i=0; i<pos; i++){
            array[i]= arr[i];
        }
        for(int i=pos+1; i<a; i++){
            array[i-1]= arr[i];
        }
        System.out.println("The new array is: " + Arrays.toString(array));
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        char ch;
        System.out.println("Enter the number of elements in your array");
        int a= sc.nextInt();
        int arr[] = createArray(a, sc);

        do{
        System.out.println("Your choices are: ");
        System.out.println("a. Create an array of n integers");
        System.out.println("b. Display the array elements");
        System.out.println("c. Insert an element at specific position");
        System.out.println("d. Delete an element at a given position");
        System.out.println("e. Exit");
        System.out.println("Enter your choice");
        ch= sc.next().charAt(0);

        switch(ch){
            case 'a':
                System.out.println("You want to create an array of n integers");
                arr= createArray(a, sc);
                break;
            
            case 'b':
                System.out.println("You want to display the array"); 
                displayArray(arr);
                break;

            case 'c':
                System.out.println("You want to insert an element in the array");
                System.out.println("What is the position in which you want to insert the element?");
                int pos= sc.nextInt();
                if (pos < 0 || pos > a) {
                    System.out.println("Invalid position");
                } 
                else {
                System.out.println("What is the new element you want to insert?");
                int newElement= sc.nextInt();
                insertElement(arr, a, pos, newElement);
                a++;
                }
                break;
            
            case 'd':
                System.out.println("You want to delete an element in the array");
                System.out.println("What is the position in which you want to delete the element?");
                int position= sc.nextInt();
                if (position < 0 || position >= a) {
                    System.out.println("Invalid position");
                } 
                else {
                deleteElement(arr, a, position);
                a--;
                }
                break;
            case 'e':
                System.out.println("Exited successfully");

            default:
                System.out.println("Invalid choice");
                break;

        }
        }while(ch!='e');
        sc.close();
    }

}
