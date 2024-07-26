/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package set;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String formed of numbers separated by commas: ");
        String s = scan.nextLine();
        Set set = new Set(s);
        
        
        System.out.println("\nThere are " + set.countEven() + " even values in the set");
        
        
        System.out.println("\nThe prime values in the set: ");
        MyInteger[] primes = set.getPrimeNumbers();
        for(int i=0;i<primes.length;i++)
         System.out.print(primes[i].getValue() + " ");
        
        MyInteger[] odd = set.getMyIntegers();
        System.out.println("\n\nThe odd values are: ");
        for(int i = 0; i < odd.length; i++) 
            if(odd[i].isOdd()) 
                System.out.println(odd[i].getValue() + " ");
                
        
        System.out.println("\nSet:");
        System.out.println(set);//name of instance(call public string toString())
    }
} 
    
    

