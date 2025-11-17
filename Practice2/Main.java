class Student { // create a class with name of Student
    String name; // these are data members
    int age;

    void getinfo(String s, int a) // this is first method with name get info int take two prameters
    {
        name = s; // copy first parameter in name
        age = a; // copy second parameter in age
    }

    void display()  // here we create a new method name is display
    {
        System.out.println("Name: " + name); // here we print the name
        System.out.println("Age: " + age); // here we print the age
    }
}

public class Main { // here we create a new class Main for main method
    public static void main(String[] args) {
        Student s1 = new Student(); // creation of first object
        Student s2 = new Student(); // creation of second object

        s1.getinfo("Mayank", 21);  // here we call the method using objects
        s1.display(); // this is for display the data

        s2.getinfo("Ujjwal", 20); // here we call the method using objects
        s2.display(); // this is for display the data

        s1.display();
        s2.display();
    }
}