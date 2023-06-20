//import jdk.nashorn.internal.parser.Scanner;
//import sun.security.util.math.intpoly.IntegerPolynomial448;
//
//import java.lang.reflect.Array;
//import java.util.ArrayList;
////import java.util.Scanner;
//
//
//public class ArrayList1 {
//    //public static void main(String[] args) {
//
////        ArrayList<Integer> numbers = new ArrayList<Integer>();
////        numbers.add(1);
////        numbers.add(2);
////        numbers.add(3);
////        numbers.add(4);
////        numbers.add(5);
////
////        for(int i=0; i<numbers.size(); i++){
////            System.out.println(numbers.get(i));
////        }
////        for(Integer i : numbers){
////            System.out.println(i);
////        }
//
////        ArrayList<Double> grades = new ArrayList<>();
////        grades.add(90.0);
////        grades.add(80.0);
////        double sum =0;
////        for(Double d : grades){
////            sum += d;
////        }
////        System.out.println(sum / grades.size());
//
////        Scanner in = new Scanner(System.in);
////
////        ArrayList<String> colors = new ArrayList<>();
////        for(int i=0; i<3; i++){
////            String color = in.nextInt();
////            colors.add(color);
////        }
////        for(String color : colors) System.out.println(color);
////
//
////        static ArrayList<String> findLongest2 (ArrayList<Stirng> words){
////            int len = -1;
////            for(String word : words){
////                if(word.length() >len) len = word.length();
////            }
////            ArrayList<String> result = new ArrayList<>();
////            for(String word : words){
////                if(word.length() == len) result.add(word);
////            }
////            return result;
//        //}
//
////        ArrayList<String> words = new ArrayList<>();
////        words.add("world");
////        words.add("goodbye");
////        words.add("mirim");
////
////        int findLongest =0;
////
////        String result = "";
////
////        for(int i=0; i<words.size(); i++){
////            if(words.get(findLongest).length() < words.get(i).length()){
////                findLongest = i;
////            }
////            System.out.println("가장 긴 이름은 : "+words.get(findLongest));
////        }
////        System.out.println(result);
//
//        static <T> ArrayList<T> merge(ArrayList<T> list1, ArrayList<T> list2){
//            ArrayList<T> result = new ArrayList<>();
//            for(T i : list1) result.add(i);
//            for(T i : list2) result.add(i);
//            return result;
//        }
//
//        static ArrayList<ArrayList<Integer>> randomSeats(int total, int [] layout) {
//            ArrayList<Integer> students = new ArrayList<>();
//            for(int i=1; i<=total; i++) students.add(i);
//            Collections.shuffle(students);
//
//            int idx=0;
//            ArrayList<ArrayList <Integer>> result = new ArrayList<>();
//            for(int count : layout){
//                ArrayList<Integer> seats = new ArrayList<>();
//                for(int i=0; i<count; i++ ) {
//                    seats.add(students.get(idx));
//                    idx++;
//                }
//                result.add(seats);
//
//            }
//            return result;
//        }
//
//}
//
