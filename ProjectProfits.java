/* 

Name: Nirupama Poojari
CSE 174, Section F-J
Date: 8/27/2021
Description:Making a cost 

*/

public class ProjectProfits {
    
    public static void main(String[] args) {
        //Variables to declare 
   
        int profitA = 2000000;
        float percentA = 0.051f;
        float rateA = profitA * percentA;
        int profitB = 2500000;
        float percentB = 0.072f; 
        float rateB = profitB * percentB;
        int profitC = 3000000;
        float percentC = 0.093f;
        float rateC = profitC * percentC;
        int profitD = 4000000;
        float percentD = 0.112f; 
        float rateD = profitD * percentD;
        float total = (rateA + rateB + rateC + rateD) / 4;
        float percent1 = 0.06f;
        float rate1 = profitA * percent1;
        float percent2 = 0.08f;
        float rate2 = profitB * percent2;
        float percent3 = 0.101f;
        float rate3 = profitC * percent3;
        float percent4 = 0.132f;
        float rate4 = profitD * percent4;
        float total2 = (rate1 + rate2 + rate3 + rate4) / 4;
        float percentF = 0.080f;
        float rateF = profitA * percentF;
        float percentS = 0.105f;
        float rateS = profitB * percentS;
        float percentT = 0.130f;
        float rateT = profitC * percentT;
        float percentL = 0.168f;
        float rateL = profitD * percentL;
        float total3 = (rateF + rateS + rateT + rateL) / 4;
        int totalProfit = (int)(total + total2 + total3);
        
        System.out.println("The average profit for the next year: " + total);
        System.out.println("The average profit for the second year: " + total2);
        System.out.println("The average profit for the third year: " 
                                                              + total3 + "\n");
        
        System.out.println("Total profit in next 3 years: " + totalProfit);
    } 
        
}
