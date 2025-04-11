public class BitMask {
    public static void main(String[] args) {
        

    int num = 5;
    int pos = 2;
    int bitmask = 1<<pos;
    // GET BIT operation is done using & operatior
    if((bitmask & num)==0){
        System.out.println("the bit was zero");
    }
    else{
        System.out.println("the bit was one!..");
    }

    //SET OPERATION IS DONE USING | OPERATIOR

    int newNumber =  bitmask | num;
    System.out.println("the new number after bit manupulation is: "+newNumber);

    /*CLEAR BIT OPERATION IS DONE FIRST STEP
     * FIRST STEO: GET THE BITMASK
     * SECOND STEP DO NOT OPERATION TO THE BITMASK (~BITMASK)
     * THIRD DO AND OPERAITON WITH (~BITMASK)
    */

    int conNum  = ~(bitmask);

    int clrbit  = (conNum & num);
    System.out.println("number after clearing the bit is: "+clrbit);

    
}
}

