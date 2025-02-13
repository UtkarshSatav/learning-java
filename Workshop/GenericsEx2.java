public class GenericsEx2 {

    public <T,V>void getAddition( T  a, V b) {

        System.out.println("a is" +a);
        System.out.println("b is" +b);


    }

    public static void main(String[] args) {

        GenericsEx2 obj = new GenericsEx2();
        obj.getAddition(1,2);
        obj.getAddition(4.2,7.8);
    }

}
