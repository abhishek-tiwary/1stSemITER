public class Q06_Patterns1 {
    public static void main(String[] args) {
        System.out.println("Pattern 1: ");
        for(int i=1; i<=5; i++){
            for(int j= 1; j<=i; j++){
                System.out.print('*' + " ");
            }
            System.out.println();
        }
        System.out.println();
        /* OUTPUT:
        *
        * *
        * * *
        * * * *
        * * * * *
 */
        System.out.println("Pattern 2: ");
        for(int i= 1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println();
        /*OUTPUT:
        1
        2 2
        3 3 3
        4 4 4 4
        5 5 5 5 5
 */

        System.out.println("Pattern 3: ");
        int c=1;
        for(int i= 1; i<=5; i++){
            for(int j= 1; j<=i; j++){
                System.out.print(c + " ");
                c++;
            }
            System.out.println();
        }
        System.out.println();
        /*OUTPUT:
        1
        2 3
        4 5 6
        7 8 9 10
        11 12 13 14 15
 */

        System.out.println("Pattern 4: ");
        for(int i= 1; i<=5; i++){
            for(int j= 1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        /* OUTPUT:
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
 */
    }
}
