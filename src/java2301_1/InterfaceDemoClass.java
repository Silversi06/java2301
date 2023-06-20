//package java2301_1;
//
//import java.util.ArrayList;
//import java.util.Iterator;
//
//interface Payable{
//    void pay();
//    default void myMethod(){
//        System.out.println("impl");
//    }
//}
//interface Cleanable{
//    void clean();
//}
//
//interface Cookable{
//    void cook();
//}
//
//class EntertainmentDog implements Payable,Cleanable,Cookable{
//
//    @Override
//    public void pay() {
//        System.out.println("결제를 합니다");  //결제를 할 수 있기(행동)를 요구 => pay이라고 하는 추상 메서드를 구현함으로서 계약을 지킴
//
//    }
//
//
//    @Override
//    public void clean() {
//        System.out.println("청소를 합니다.");    //청소를 할 수 있기(행동)를 요구 => clean이라고 하는 추상 메서드를 구현함으로서 계약을 지킴
//    }
//
//    @Override
//    public void cook() {
//        System.out.println("요리를 합니다");  //요리를 할 수 있기(행동)를 요구 => cook이라고 하는 추상 메서드를 구현함으로서 계약을 지킴
//    }
//}
//
//class FruitsIterable implements Iterable<String>{
//    @Override
//    public Iterator<String> iterator(){
//        String[] fruits ={"apple","banana","orange"};
//        return new Iterator<String>() {
//            private int currentIndex = 0;
//            @Override
//            public boolean hasNext() {
//                return fruits.length>currentIndex;
//            }
//
//            @Override
//            public String next() {
//                String fruit = fruits[currentIndex];
//                currentIndex++;
//                return null;
//            }
//        };
//    }
//}
//
//class IntRange implements Iterable<Integer> {
//    private int start, end;
//
//    public IntRange(int start, int end) {
//        this.start = start;
//        this.end = end;
//    }
//
//    @Override
//    public Iterator<Integer> iterator() {
//        return new Iterator<Integer>() {
//            @Override
//            public boolean hasNext() {
//                return start <= end;
//            }
//
//            @Override
//            public Integer next() {
//                return start++;
//            }
//        };
//}
//
//public class InterfaceDemoClass {
//    public static void main(String args[]) {
//        FruitsIterable fruitsIterable = new FruitsIterable();
//
//        for (String fruit : fruitsIterable) {
//            System.out.println(fruit);
//        }
//        IntRange intRange = new IntRange(1, 10);
//        for (Integer i : intRange) {
//            System.out.println(i);
//        }
//        ArrayList<Double> arr = new ArrayList<>();
//        arr.add(1.0);
//        arr.add(2.0);
//        arr.add(3.0);
//
////        EntertainmentDog dog = new EntertainmentDog();
////        Payable payable = dog;  //인터페이스는 업캐스팅만 할 수 있다 (객체 생성 불가능)
////        Cleanable cleanable = dog;
////        payable.pay();
////        cleanable.clean();
//
//    }
//    }
//}
