public class BlockScope {
    public static void main(String[] args) {
        
        int a = 90;
        int b = 45;

        /*BLOCK SCOPE:- A block of code refers to all of the code between curly braces {} .   */

        {
//          int a  =78;   //Already intialized outside the block in the main function. 
            a = 90;  // changing the value of a.
            
            int c = 90;
            // value initialized in this block ,  will remain in this block.
        }


//Loops Scope:- 

        for (int i = 0; i <10; i++) {
      //          int a = 89; //Same as above , we can't intialized.
        }
        

        /*Anything which is intialised outside the block can be used inside the block but anything which is intialized inside the block cannot be used outside the block.
         * Same as anything intialised outside the block cannot be intialized inside the block but anything which is intialis inside the block can be intialised outside the block also.
         */
    }
}
