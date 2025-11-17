/*class Student{
    String name;
    int age;

    public void info(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(String naam, int umra){
        this.name = naam;
        this.age = umra;
    }
}
public class construct {
    public static void main(String[] args) {
        Student s1 = new Student("Ronit",16); // here new is a keyword and Student() is act like as a constrctor
        // s1.name = "Aman";
        // s1.age = 26;
        s1.info();
    }
}*/

// constructor ka aur class ka naam hamesa same hota hai
// types of constructor
// non parameterise constructor
// parameterise constructor
// constructor kuch return nhi krte
// constructor ka koi return type nhi hota jaise int float
// constructor ko sirf ek hi bar call kiya jata hai 
// constructor ko tbhi call kiya jata hai jb object create hota hai

// Copy Constructor
class Student{
    String name;
    int age;

    Student(){ // this is empty cons. for s1 object
        
    }

    Student(Student s2){ // this is copy constructor of s1 for object s2
        this.name = s2.name;
        this.age = s2.age;
    }

    public void info(){ // this is method for display
        System.out.println(this.name);
        System.out.println(this.age);
    }
}
public class construct{
    public static void main(String[] args) {
        Student s1 = new Student(); // this is object for s1
        s1.name = "Aman";
        s1.age = 26;

        Student s2 = new Student(s1); // copy cons. of s1
        s2.info();
    }
}