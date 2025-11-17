class Car{
    public void display(){
        System.out.println("Mahindra : ");
    }
}

class Scorpio extends Car{
    public void disp(){
        System.out.println("Scorpio matlab KALA GHODA");
    }
}

class Thar extends Scorpio{
    public void power(){
        System.out.println("Thar the KING of Ofroading");
    }
}

class ScorpioN extends Car{
    public void big(){
        System.out.println("ScorpioN Big Daddy of all SUV");
    }
}
public class inherit {
    public static void main(String[] args) {
        Thar ROXX = new Thar();
        ROXX.display();
        ROXX.disp();
        ROXX.power();
        ScorpioN Z8 = new ScorpioN();
        Z8.display();
        Z8.big();
    }
}