// interface : iska mtbl hai fully abstraction mtlb ye sari useless info. hide kr legi
// isko interface keyword se define krte hai
// isme extends ke place pr implements keyword ka use krte hai
// interfaces ke constructors nhi bnte hai
// interfaces ke andar koi non abstract function nhi hona chahiye aur na hi implementation honi chahiye
// interface class mein method by default public aur abstract hote hai

interface Animal{
    int eye = 2;
    public void walk();
}

class Horse implements Animal{
    public void walk(){
        System.out.println("horse is walking on four legs");
    }
}
public class intrface{
    public static void main(String[] args) {
    Horse H1 = new Horse();
    H1.walk(); 
    }
}