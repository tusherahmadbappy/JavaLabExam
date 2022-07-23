
package evennumber1;

import java.util.Scanner;


public class EvenNumber1 {

    
    public static void main(String[] args) {

        int num;
        Scanner s1 = new Scanner(System.in);
        System.out.print("How many integers? ");  

        num=s1.nextInt();  
        //creates an array in the memory of length fixed num  
        int[] anArray = new int[num];  
        
        for(int i=0; i<num; i++)  
        {  
        //reading array elements from the user 
            System.out.print("Next integers?: ");  
            anArray[i]=s1.nextInt();  
            
        }
        
        
        SumevenNumber ob1 = new SumevenNumber();
        ob1.evensum(anArray);
        
        MaxevenNumber ob2=new MaxevenNumber();
        ob2.EvenMax(anArray);
        
    }
    
    
}
