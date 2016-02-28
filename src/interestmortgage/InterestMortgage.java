/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interestmortgage;

/**
 *
 * @author kevinkindorf
 */
import java.util.Scanner;

public class InterestMortgage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        double monthAmount, totalAmount, interest, periodInterest, monthBalance, monthTotalPayment;
        System.out.println("How much is your outstanding balance for the whole mortgage?");
        totalAmount = in.nextDouble();
        interest = 0.0487;
        periodInterest = interest / 12;
        double firstPow= periodInterest * (Math.pow((1.0+periodInterest),360));
        double secondPow = Math.pow((1.0+periodInterest),360)-1;
        monthTotalPayment = totalAmount *(firstPow/secondPow);
        System.out.println("Your monthly payment total is: "+monthTotalPayment);
        double firstMonthInterest = totalAmount * periodInterest;
        double firstmonthPrinciple = monthTotalPayment - firstMonthInterest;
        System.out.println("Your first month principal payment is: "+firstmonthPrinciple);
        System.out.println("Your first month interest payment is: "+firstMonthInterest);

    }
    
}
