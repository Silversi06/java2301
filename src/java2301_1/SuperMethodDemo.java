package java2301_1;

class A{
public A(){
        super();
        System.out.println("A");
        }
}

class B extends A {
    public B(){
        super();
        System.out.println("B");
    }
}

class C extends B {
    public C(){
        super();
        System.out.println("C");
    }
}

public class SuperMethodDemo {
    public static void main(String args[]){
        C c = new C();
    }
}


