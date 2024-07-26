/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package set;

/**
 *
 * @author LENOVO
 */
public class MyInteger {
      private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
    
    public boolean isEven(){
        return value % 2 == 0;
    }
    
    public boolean isOdd(){
        return value % 2 == 1;
    }
    
    public boolean isPrime(){
        for(int divisor = 2; divisor <= value / 2; divisor++)
            if(value % divisor == 0)
                return false;
        return true;
    }
}   
    

