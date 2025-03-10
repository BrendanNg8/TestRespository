//Brendan Ng, 3/10/2025, Concrete Price Application

import java.util.Scanner;
public class Firstprompt{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int poleNumber;

        System.out.println("How many poles?: ");
        poleNumber = scanner.nextInt();

        double volume = 3.14*(1.5*1.5)*5;

        System.out.println(volume);
        System.out.println("Volume after poles: "+(volume * poleNumber));
        

        double price = ((volume / 27) * 12.98) * poleNumber;

        System.out.println("Price is: "+price);
        
        
    }
}