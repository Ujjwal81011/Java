class Throwable {
    public void age(){
        int age = 15;

        if(age < 18){
            // manually exception throw kiya
            throw new ArithmeticException("Age must be 18 or above!");
        }

        System.out.println("Welcome, you can vote!");
    }
}

public class Throw{
    public static void main(String[] args) {
    Throwable t = new Throwable();
    t.age();
    }
}

// public class Throws {

//     // Method jo exception throw kar sakta hai
//     static void checkAge(int age) throws ArithmeticException {
//         if(age < 18){
//             throw new ArithmeticException("You are under 18!");
//         }
//         System.out.println("You can vote!");
//     }

//     public static void main(String[] args) {
//         checkAge(15);   // yaha exception aayega
//         System.out.println("End of Program");
//     }
// }