/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author ranaa
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
     public int max(int num1, int num2){
  
        if(num1>num2){
            return num1;
        }
        else
            return num2;
    }
    
    public double max(double num1, double num2){
  
        if(num1>num2){
            return num1;
        }
        else
            return num2;
    }
    
     public int max(int num1, int num2, int num3){
  
        if(num1>num2&& num1>num3){
            return num1;
        }
        else if(num2>num1 &&  num2>num3){
            return num2;
        }
        else{
            return num3;
        }
        
    }
    public static void main(String[] args) {
       
   
        
     
        Scanner input = new Scanner(System.in);
        System.out.println("Enter int value 1 : ");
        int n1 = input.nextInt();
        System.out.println("Enter int value 2 : ");
        int n2 = input.nextInt();
        System.out.println("Enter int value 3 : ");
        int n3 = input.nextInt();
        System.out.println("Enter double value 1 : ");
        double d1 = input.nextDouble();
        System.out.println("Enter double value 2 : ");
        double d2 = input.nextDouble();
       JavaApplication3 maxNum = new JavaApplication3();
        System.out.println("Maximum Number in between two int numbers : "+maxNum.max(n1,n2));
        System.out.println("Maximum Number in between two double numbers : "+maxNum.max(d1,d2));
        System.out.println("Maximum Number in between two double numbers : "+maxNum.max(n1,n2,n3));

    }
    
}
