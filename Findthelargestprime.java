
package findthelargestprime;

import java.util.Arrays;


public class Findthelargestprime {

    public static  String Findlargestprime (int[] x){
         Arrays.sort(x,0,x.length);
       String primeNumbers = "";
       for(int i =0 ; i<x.length;i++){
           
              int counter = 0; 	  
         
	  {
             if(i%x[i]==0)
	     {
 		counter = counter + 1;
	     }
	  }
	  if (counter ==2)
	  {
	     //Appended the Prime number to the String
	     primeNumbers = primeNumbers   ;
	  }	
       	
           
        primeNumbers = primeNumbers+(Integer.toString(x[i]) + " ") ;
        

}
        String[] integerStrings = primeNumbers.split(" ");
        int[] integers = new int[integerStrings.length]; 
        for (int d = 0; d < integers.length; d++){
              integers[d] = Integer.parseInt(integerStrings[d]);
          
           
       
           
          // System.out.println(primeNumbers);
           
          
       }
            
           
           
       
        System.out.println( integers[integers.length-1]);
            
        
           return primeNumbers;    
           }

       
       
      
        
        
        
        
        
        
        
        
    
        
    
    
    
    
    
    
    
    
   
    
    
    
    public static void main(String[] args) {
             int[] x = {4,6,8,9,43,47};           
        Findlargestprime(x);
        
    
    
    
    }
    
}
