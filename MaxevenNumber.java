
package evennumber1;


public class MaxevenNumber {
    
    public void EvenMax(int anArray[]){

        int evenmax=anArray[0];
        for(int i=0;i<anArray.length;i++){
            //If arr[i]%2 that means arr[0] index value % 2==0, that is even number otherwise odd number.
            if(anArray[i]%2==0){
                if(anArray[i]>evenmax){//if array even numbergreaterthen evenmax then store evenmax=current array value
                    evenmax=anArray[i];
                }
                
            }
            
        }
        System.out.println(",even Max:"+evenmax);
        
    }
}
