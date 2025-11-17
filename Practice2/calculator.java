class Cal{
    void findaverage(){
       int arr[] = {10,20,30,40,50};
       int sum =0;
       int n = arr.length;
       for(int i=0;i<n;i++)
       {
        System.out.println("sum is "+sum);
        System.out.println("length is "+n);
       } 
       int avg = sum/n;
       System.out.println("average is "+avg);
    }
}
public class calculator{
    public static void main(String[] args) {
        Cal c = new Cal();
        c.findaverage();
    }
}