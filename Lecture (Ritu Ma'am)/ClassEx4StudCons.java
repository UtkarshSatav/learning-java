class Student2{

    private int id;
    private String name;
    private int marks1;
    private int marks2;

    public Student2(int id, String name, int marks1, int marks2){
        this.id = id;
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
    }

    Student2(){

        id = 0;
        name = " ";
        marks1 = 0;
        marks2 = 0;

    }


    public String toString(){
        return "Id = "+id+" Name = "+name+" Marks1 = "+marks1+" Marks2 = "+marks2;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getMarks1(){
        return marks1;
    }
    public void setMarks1(int marks1){
        this.marks1 = marks1;
    }
    public int getMarks2(){
        return marks2;
    }
    public void setMarks2(int marks2){
        this.marks2 = marks2;
    }

    public void result(){
        System.out.println("Total Marks = "+(marks1+marks2));
    }

}

class ClassEx4StudCons{
    public static void main(String[] args){
        Student2 s1 = new Student2();
        System.out.println(s1);
        s1.setId(11);
        s1.setName("ABC");
        s1.setMarks1(70);
        s1.setMarks2(70);
        System.out.println("After setting values of s1"+s1);
        Student2 s2 = new Student2(12, "XYZ", 70, 75);
        System.out.println(s2);
        s2.setId(33);
        System.out.println("After setting id=33 for s2"+s2);
    }
}