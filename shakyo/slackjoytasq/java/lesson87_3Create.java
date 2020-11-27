import java.util.*;
public class lesson87_3Create{
public static void main(String[] args){
       //make a new array of 10 integers
       int a[] = new int[10];

       //declare an object which we can use to generate random numbers
       //this object probably uses the system time to generate numbers that appear random
       //but at the end of the day, java does it for us so
       //we don't really need to know or care how it generates random numbers
       Random randomGenerator = new Random();

       //loop over each element in our array
       for (int i = 0; i < a.length; i++){
             //for each element, set that element to a random between 1 and 100 inclusive
             //nextInt(x) gets a number between 0 (inclusive) and x (not inclusive)
             //so to translate that to 1 to x inclusive, we need to add 1 to the result
             a[i] = 1 + randomGenerator.nextInt(100); 
       }

       //everything below here does literally nothing to solve the problem
       //everything you need to fill the array with random numbers is above

       for (int i = 0; i < a.length; i++) { 
             int number = 1 + randomGenerator.nextInt(100); 
             int count = 0; 
             for (int j = 0; j < i; j++) {
               if (a[j] == number) {
                 count += 1; 
               } 
             } 
             if (count > 0) i -= 1;
             else a[i] = number; 
           } 
       
			 }
}
