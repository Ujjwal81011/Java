// encapsualation ka matlab hota hai data(variable) aur method(function) ko ek unit yani (class) mein chhupa kar rakha jata hai jisase data safe rhta hai aur koi third person usko access nhi kr pata hai
// builtin packages
// user definded packages

// access modifires in java:- inske kuch keywords hote hai jo ye decide krte hai ki kisi class,variable,method ya constructor ko kha se access kia ja skta hai
// Public : kisi bhi package ko kisi bhi class se access kia ja skta hai koi rokk tokk  nhi hai
// Protected : same class mein, same oackage mein, child class mein
// Private : sirf same lass ke andar hi access kia ja skta hai kisi bhi dosri class mein nhi
// default : sirf same package mein access kr skte hai

class Account{
    public String name;
    protected String email;
    private String password;

    //getters & setterts :: getters ka mtlb us private cheej ki information vapis de dejiye aur setters ka matlb hota hai ki uski value set kr dejiye

    // iss getpass method se hum phle private cheej ko phle get karenge
    public String getpass(){ // iska return type String isliye hai kyuki ye String return nhi karega
        return this.password;
    }

    public void setpass(String pass){ // yha pr return type void isliye hai kyuki ye kuch return nhi karega
        this.password = pass;

    }

    public void display(){
        System.out.println(this.name);
        System.out.println(this.email);
    }
}
public class Encapsule {
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.name = "Ujjwal Mishra";
        a1.email = "mishraujjwal9936@gmail.com";
        a1.display();
        // a1.password = "abcd"; // hmm private cheejo ko access nhi kr skte
        a1.setpass("abcd");
        System.out.println(a1.getpass());
    }
}