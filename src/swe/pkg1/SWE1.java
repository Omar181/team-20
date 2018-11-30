/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swe.pkg1;

import java.util.HashMap;

/**
 *
 * @author Karim
 */
public class SWE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    	int[] a= {1,3,2,4,2,3,11,2,3,4,1};
    	Most_common(a);
        
    	
    	// TODO code application logic here
    }
    
    public static void Most_common(int [] array){
    	HashMap<Integer,Integer> hash = new HashMap<>();
    	for(int i=0;i<array.length;i++)
    	{
    		
    		if(hash.containsKey(array[i]))
    		{
    			hash.put(array[i], hash.get(array[i]) + 1);
    		}
    		else {
    			hash.put(array[i], 1);
    		}
    	}
    		
    		
    		int max=0; int ind=0;
    	for (int i: hash.keySet())
    	{
    		if(hash.get(i)>max)
    		{
    			ind=i;
    			max=hash.get(i);
    		}
    	}
		System.out.println(max);
    	
    }
}
