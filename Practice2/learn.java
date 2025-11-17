class Student{
        String name;
        int age;

        Student(String name, int age){
            this.name = name;
            this.age = age;
            System.out.println("name is "+name);
            System.out.println("age is "+age);
        }

        Student(Student s){
            name = s.name;
            age = s.age;
        }
    }
public class learn {
    public static void main(String[] args) {
        Student s1 = new Student("Rahul",20);
        Student s2 = new Student(s1);
    }
}