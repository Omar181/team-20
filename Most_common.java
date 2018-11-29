/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14;

import static java.nio.file.Files.size;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class Most_common {
private int pop = 0;       
  public int find (int [][] array, int f){
      for (int j=0; j<array.length;j++){
      if (array[j][0]==f)
          return j;
      
      
      
      
      }
      
      return -1;
      
      
  }
    public Most_common(int [] array){
       int count =0; 
    int size =array.length;
     int[][] x=new int[size][2]; 
    for (int i=0 ;i<size;i++ ){
    if(find(x,array[i])!=-1){

     x[find(x,array[i])][1]++;


}
    
else{
x[count][0]=array[i];

x[count][1]= 1;


count++;

}   
    }    
 
int max = x[0][1];
for(int i= 0 ; i< count ; i++){

if (max<x[i][1]){
max=x[i][1];
pop=x[i][0];
}




}    
 
    
  
}
    
public int get(){

return pop;

}

}