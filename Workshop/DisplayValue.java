public class DisplayValue <T>{

    T num;

    public DisplayValue(T num) {
        this.num = num;
    }

    public void displayData(){

        System.out.println("Value of num is: " + num);

    }

}

// class DisplayDouble{

//     Double num;

//     DisplayDouble(Double num) {

//         this.num = num;

//     }

//     public void displayData(){

//         System.out.println("Value of num is: " + num);

//     }
// }

public class GenericEx{
HJ
    public static void main(String[] args) {

        DisplayValue <T> i1 = DisplayValue <>(1);
        obj1.displayData();

        DisplayDouble i2 = new DisplayValue <>(3.6);
        obj2.displayData();

    }
    
    
}