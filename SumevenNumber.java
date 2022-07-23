
package evennumber1;

public class SumevenNumber {
    public void evensum(int anArray[]){

        int even=0;
        for(int i=0;i<anArray.length;i++){
            //If arr[i]%2 that means arr[0] index value % 2==0, that is even number otherwise odd number.
            if(anArray[i]%2==0){
                even+=anArray[i];//Array all evennumber addede store in even variable
                
            }
            
        }
        System.out.print("Even sum:"+even);
        
    }
    
}
