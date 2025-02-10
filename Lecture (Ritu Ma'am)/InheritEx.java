class Animal{
    String name;
    public void eat(){
        System.out.println("i can eat");
    }

}

class Dog extends Animal{
    public void bark(){
        System.out.println( name +" bark");
    }
// }

class InheritEx{
    public static void main(String[] args){
        Dog labrador = new Dog();
        labrador.name = "Tommy";
        labrador.bark();
        labrador.eat();
        
    }
} 