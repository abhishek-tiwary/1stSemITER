public class Q07_Patterns2 {
    public static void main(String[] args) {
        System.out.println("Pattern 1: ");

        for(int i= 1; i<=5; i++){
            char ch= 'A';
            for(int j= 1; j<=i; j++){
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
        System.out.println();
        /*OUTPUT:
        A
        A B
        A B C
        A B C D
        A B C D E */

        System.out.println("Pattern 2: ");

        for(int i= 1; i<=5; i++){
            for(int j= 5; j>=i; j--){
                System.out.print('$' + " ");
            }
            System.out.println();
            /* OUTPUT:
        $ $ $ $ $
        $ $ $ $
        $ $ $
        $ $
        $
 */
        }
        System.out.println();
        
        System.out.println("Pattern 3: ");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5-i; j++) {
                System.out.print("  ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print(i + " ");
            }
            System.out.println();
            /*
    OUTPUT:
                1
              2 2
            3 3 3
          4 4 4 4
        5 5 5 5 5
 */
        }
        System.out.println();
        int n=5;
        for(int i=0; i<=5; i++){
            for(int j=0; j<=i; j++){
                System.out.print(n);
            }
            System.out.println();
            n--;
        }
         /* OUTPUT:
        5
        44
        333
        2222
        11111
        000000
         */
    }
}
