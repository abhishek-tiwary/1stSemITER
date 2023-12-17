import java.util.Scanner;
public class Q7_BillPayment {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the units of electricity consumed");
        float elec=sc.nextInt();
        char y, n;
        

        if(elec<=50)
        {
            System.out.println("The electricity bill is rupees" + (3*elec));
            System.out.println("Do you want to pay online?");
            char response=sc.next;

            if(response=y){
                System.out.println("Your bill amount is " + (3*elec));
                System.out.println("Your discount is "+ 0.03*(3*elec));
            }
            else if(response=n){
                System.out.println("Your bill amount is " + (3*elec));

            }

        }
        else if(elec>50&&elec<=200)
        {
            System.out.println("The electricity bill is rupees" + ((3*50)+(4.80*(elec-50))));
            System.out.println("Do you want to pay online?");
            boolean response=sc.nextBoolean();

            if(response=y){
                System.out.println("Your bill amount is " + ((3*50)+(4.80*(elec-50))));
                System.out.println("Your discount is "+ 0.03*((3*50)+(4.80*(elec-50))));
            }
            else if(response=n){
                System.out.println("Your bill amount is " + (3*elec));

            }
        }
        else if(elec>200&&elec<=400)
        {
            System.out.println("The electricity bill is rupees" + ((3*50)+(4.80*150)+(5.80*(elec-200))));
        }
        else if(elec>400)
        {
            System.out.println("The electricity bill is rupees" + ((3*50)+(4.80*150)+(5.80*200)+(6.20*(elec-400))));
        }
        else
        {
            System.out.println("Invalid input");
        }
        sc.close();

    }
    
}
