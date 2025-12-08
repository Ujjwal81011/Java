class Student{
    String name;
    String fname;
    int age;

    public void display(){
        System.out.println("name is "+name);
        System.out.println("Father's name is "+fname);
        System.out.println("age is "+age);
    }
}
public class clsmeth {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Aarju";
        s1.fname = "kaushik";
        s1.age = 20;
        s1.display();
    }
}
