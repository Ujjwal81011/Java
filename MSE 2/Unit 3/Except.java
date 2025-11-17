// Runtime exception
public class Except {
    public static void main(String[] args) {

        // int arr[] = new int[5];

        // System.out.println("Namaste Duniya");

        // try {
        //     int result = 5/0;
        //     System.out.println(arr[8]); // in this line exception caught

        //     // int result = 5/0; // ye line run hi nhi hogi kyunki isse phle wali line mein error aa chuka hai to compiler seedhe catch block mein chala jayega
        // } 
        // catch (ArrayIndexOutOfBoundsException e) 
        // {
        //     System.out.println("can not access index is out of bound");// TODO: handle exception
        // }
        // catch(ArithmeticException e){
        //     System.out.println(e.getStackTrace());
        //     System.out.println(e.getMessage());
        //     System.out.println(e);
        // }


        int arr[] = new int[5];
        System.out.println("Namaste Duniya");

        try {
            int result = 5/0;
            System.out.println(arr[8]); // in this line exception caught

            // int result = 5/0; // ye line run hi nhi hogi kyunki isse phle wali line mein error aa chuka hai to compiler seedhe catch block mein chala jayega
        } 

        catch(Exception e){ // it is parents catch in which all type of Exception will be handles
            System.out.println("can handle all exceptions");
        }

        // catch (ArrayIndexOutOfBoundsException | ArithmeticException e) 
        // {
        //     System.out.println("Handling the exception");// TODO: handle exception
        // } 
        
        // catch (ArithmeticException e){  // in place of this we can de this like
        //     System.out.println("handling the exception"); // we can add Arith. Exc in upper catch block
        // }
        
        System.out.println("Jai Shree Shyam");
    }
}