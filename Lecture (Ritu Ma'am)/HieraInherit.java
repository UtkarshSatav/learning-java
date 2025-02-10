class Animal {
    public String name;
    public void eat(){
        System.out.println(name + "eat");
    }
    Animal(){}
    Animal(String n){name = n;}
}

class Dog extends Animal{
    public void bark(){
        System.out.println(name + "bark");
    }
    Dog(){}
    Dog(String n){
        super(n);
    }
}

class cat extends Animal{
    public void meow(){
        System.out.println(name + "meow");
    }
}

class HieraInherit{
    public static void main(String[] args){
        Animal a = new Animal("Animal");
        a.name = "Jack ";
        a.eat();

        Dog d1 = new Dog("Kaju ");
        d1.bark();
        d1.eat();

        cat c = new cat();
        c.name = "Mew ";
        c.meow();
        c.eat();

    }
}

