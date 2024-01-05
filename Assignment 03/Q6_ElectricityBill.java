import java.util.Scanner;

public class Q6_ElectricityBill {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the units of electricity consumed");
        float elec=sc.nextInt();

        if(elec<=50)
        {
            System.out.println("The electricity bill is rupees" + (3*elec));
        }
        else if(elec>50&&elec<=200)
        {
            System.out.println("The electricity bill is rupees" + ((3*50)+(4.80*(elec-50))));
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
