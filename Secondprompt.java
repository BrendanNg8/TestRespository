//Brendan Ng, 3/10/2025, Pythagorean Triplet Application


import java.util.Scanner;
public class Secondprompt{
    public static void main(String[]args){
        double m;
        double n;
        double side1;
        double side2;
        double hypo;
        double cost;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me m value: ");
        m = scanner.nextDouble();

        System.out.println("Give me n value that's n < m: ");
        n = scanner.nextDouble();

        side1 = (m*m) - (n*n);
        side2 = 2*(m*n);
        hypo = (m*m) + (n*n);

        System.out.println("Side1: "+side1+", side2: "+side2+", hypo: "+hypo);
        cost = (2.412 * side1) + (3.767 * side2) + (15.758 * hypo);
        System.out.println(cost);


        
    }
}
