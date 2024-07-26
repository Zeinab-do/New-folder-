/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package set;

/**
 *
 * @author LENOVO
 */
public class Set {
    private MyInteger[] myIntegers;

    public Set(String s) {
        String[] tokens = s.split(","); //split around commas
        myIntegers = new MyInteger[tokens.length];//get the size of myintegers array
        System.out.println(tokens.length);
        for(int i = 0; i < tokens.length; i++){
            tokens[i] = tokens[i].trim(); //to remove the extra spaces
            int value = Integer.parseInt(tokens[i]);//convert string to int to fill the array
            myIntegers[i] = new MyInteger(value);// filling the array
        }
    }
    
    public MyInteger[] getMyIntegers(){
        return myIntegers;
    }
    
    public int countEven(){
        int count = 0;
        for(int i=0; i<myIntegers.length;i++)
           if( myIntegers[i].isEven())
                count++;
        return count;
    }
    
    public int countPrime(){
        int count = 0;
      for(int i=0; i<myIntegers.length;i++)
            if( myIntegers[i].isPrime())
                count++;
        return count;
    }
    
    public MyInteger[] getPrimeNumbers(){
        MyInteger[] primes = new MyInteger[countPrime()];
        int j = 0;
      for(int i=0; i<myIntegers.length;i++)
            if(myIntegers[i].isPrime())
               primes[j++] = myIntegers[i];
        return primes;
    }
    
    @Override
    public String toString(){
        String str = "{";
        for(int i=0; i<myIntegers.length;i++)
           str+= myIntegers[i].getValue() + ", ";
        return str+ "}";
    }
}
    

