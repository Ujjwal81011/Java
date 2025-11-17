// Abstraction : isme hum user ko sirf jaruri cheeji hi dikhate hai waki cheeje user se chhupa lete hai
// abstract method sirf abstract class mein hi work krta hai aur iske liye class ka bhi abstract hona jaruri hai
// kisi bhi class ya method ko abstract banane ke liye hum (abstract) keyword ka use krte hai
// hum abstract class ka constructor bhi bna skte hai aur wo constuctor bhi extend hoga child class mein
// abstraction mein semi abstraction hota hai
// iska bada bhai hota hai Interfac jo ki fully abstract hota hai

abstract class Animal{
    abstract void walk();
}

class Horse extends Animal{
    public void walk(){
        System.out.println("horse is walking");
    }
}

class Puppy extends Animal{
    public void walk(){
        System.out.println("puppy is walking");
    }
    public void bark(){
        System.out.println("puppy is barking");
    }
}

public class anstraction {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.walk();
        Puppy p1 = new Puppy();
        p1.walk();
        p1.bark();
    }
}

// dekho isme Animal ek abstract class jiska ek method hai Walk, ab hai kya animal class khti hai ki mujhe pta hai ki sare animal walk krte hai pr kaun kaise walk krta hai ye mujhe nhi pta
// to hai ye ki hr ek class jo animal class ko inherit karegi usko ek walk method to banana hi padega taki wo ye bta sake ki wo animal kaise walk krta hai
// ya phir animal class ke walk method ko override kr sake