package java2301_1;

import java.awt.*;

interface Color{

    public static final String RED ="RED";
    public static final String GREEN ="GREEN";
}
interface MyNumber{

    final int LUCKY_NUMBER=777;
}
public class Exercises {

    public static void main(String[] args) {
        System.out.println(Color.RED);
        System.out.println(Color.GREEN);

        System.out.println(MyNumber.LUCKY_NUMBER);

    }
}
