
import java.util.Scanner;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Titus & Jeremy
 */
public class PYQ2015midsem4 {

    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        boolean ans, temp;
        int num, factor, count = 0, i = 0;
        do {                                                   //while(num!=-1)
            System.out.print("Enter a number(-1 to quit) : ");//if (num==-1)
            num = cs.nextInt();                               //break;
            if (num != -1) {
                System.out.print("Enter a factor : ");
                factor = cs.nextInt();
                System.out.print(factor + " is a factor of " + num + "? (true/false): ");
                ans = cs.nextBoolean();
                temp = num % factor == 0;
                /*if (num%factor==0)
                   temp=true
                else 
                    temp=false
                System.out.println(temp);
                 */

                if (ans == temp) {
                    System.out.println("Your answer is correct.");
                    count += 1;
                } else {
                    System.out.println("Your answer is incorrect.");
                }
                i++;
            }
        } while (num != -1);

        System.out.println("The final score is " + count + "/" + i);
    }
}
