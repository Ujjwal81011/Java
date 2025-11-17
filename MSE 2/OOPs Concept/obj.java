class Pen{ //class
    String color;
    String brand;

    public void write(){ // methor or function
        System.err.println("pen is use for writting");
    }

    public void display(){ //method or function
        System.out.println("color is "+color);
        System.out.println(this.brand); // this tells it that which object cis calling this function
    }
}
public class obj{ //class
    public static void main(String[] args) { // main method
      Pen pen = new Pen();
      pen.color = "Red";
      pen.brand = "classmate";

      pen.write();
      pen.display();
    }
}