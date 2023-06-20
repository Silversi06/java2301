package java2301_1;

abstract class Shape { // 추상 클래스 선언
    public Shape() { }
    public void paint() {
        draw();
    }
    abstract public void draw(); // 추상 메소드
}

class Circle extends Shape{
    @Override
    public void draw() {
        System.out.println("Circle");
    }
}

public class AbstractClassStudy {
    public static void main(String args[]){
        Shape s = new Circle(); //업캐스팅
        Circle c = (Circle) s;
        //추상 클래스는 class 키워드가 앞에 abstract 키워드를 써서 정dml
        //추상 메서드가 있어도 되고 없어도 됨(보통 있음)
        //추상메서드는 메서드앞에 abstract 키워드를 써서 정의
        //추상 클래스는 반드시 "상속"을 통해서 구현 가능함

    }
}
