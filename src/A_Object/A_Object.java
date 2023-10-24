package A_Object;

public class A_Object {
    static  String name="Selvin";
    String nameNonStatic="I'm non static";

    public void sample(){
        System.out.println(nameNonStatic);
    }

    public static void main(String[] args) {
        System.out.println(name);
        System.out.println(test.age);
        A_Object a=new A_Object();
        System.out.println(a);
        a.sample();
    }
}

class test{
   static int age=45;
}