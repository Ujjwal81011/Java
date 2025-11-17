// Polymoriphism ka matlab hota hai ek hi kaam ko lag alag tarike se krna iske do type hote hai
// method over-loading ise khte hai (compile time polymoriphism)
// method over-ridding ise khte hai (run time polymoriphism)

// method overloading ka matlab hota hai (method with same name with different parameters in same class)
// Rules: ya to function ke return type alag alag ho
// ya to agar return type same hai to parameters ke type alag alag hone chahiye
// agar parameters ke type bhi same hai to no. of parameters alag alag hone chahiye


// method overloading (compile time polymoriphism)
class Student{
    String name;
    int age;

    public void info(String name){
        System.out.println(name);
    }
    public void info(int age){
        System.out.println(age);
    }
    public void info(String name, int age){
        System.out.println(name + "  " + age);
    }
}
public class poly {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Madhav";
        s1.age = 24;
        // s1.info(s1.name);
        // s1.info(s1.age);
        s1.info(s1.name, s1.age);
    }
}


// method overriding
// class Animal {
//     void sound() {
//         System.out.println("Animal makes a sound");
//     }
// }

// class Dog extends Animal {
//     void sound() {   // overriding
//         System.out.println("Dog barks");
//     }
// }

// public class poly {
//     public static void main(String[] args) {
//         Dog d = new Dog();
//         d.sound();   // overridden method chalega
//     }
// }