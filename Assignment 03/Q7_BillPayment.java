import java.util.Scanner;
public class Q7_BillPayment {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the units of electricity consumed");
        float elec=sc.nextInt();
        char response;
        double bill= 0;
        
        if(elec<=50)
        {
            bill= 3*elec;
            System.out.println("The electricity bill is rupees " + bill);
        }

        else if(elec>50&&elec<=200)
        {
            bill= (3*50)+(4.80*(elec-50));
            System.out.println("The electricity bill is rupees " + bill);
        }

        else if(elec>200&&elec<=400)
        {
            bill= (3*50)+(4.80*150)+(5.80*(elec-200));
            System.out.println("The electricity bill is rupees " + bill);
        }
        else if(elec>400)
        {
            bill= (3*50)+(4.80*150)+(5.80*200)+(6.20*(elec-400));
            System.out.println("The electricity bill is rupees " + bill);
        }

        else
        {
            System.out.println("Invalid input");
        }

        System.out.println("Do you want to pay online? (y/n)");
        response=sc.next().charAt(0);
            if(response=='y'){
                System.out.println("Your bill amount is " + bill);
                System.out.println("Your discount is "+ 0.03*bill);
                System.out.println("Your discounted amount is" + (bill- (0.03*bill)));
            }

            else if(response=='n'){
                System.out.println("Your bill amount is " + bill);
            }

            else{
                System.out.println("Invalid input");
            }

        sc.close();

    }
    
}
