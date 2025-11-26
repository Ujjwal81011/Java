public class Test{
    public static void main(String[] args) {
        try {
            int a = 5/0;
        } catch (NullPointerException e) {
            System.out.println("Null Pointer");
        }
        System.out.println("End");
    }
}