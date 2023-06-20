package java2301_1;

import java.util.ArrayList;
class Student implements Comparable<Student>{
    public int id;
    public String name;
    public double grade;

    public Student(int id, String name, double grade){
        this.id=id;
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
    @Override
    public int compareTo(Student o){
        return this.name.compareTo(o.name);
    }

}

public class ArrayListDemo {

    public static void main(String[] args) {

//        ArrayList arrList = new ArrayList();
//        arrList.add(1);
//        arrList.add("1");

//        ArrayList<Integer> arrList = new ArrayList<>();
//        arrList.add(1);
//        arrList.add(2);
//        System.out.println(arrList.size());
//        arrList.clear();
//
//        ArrayList<String> stringArrayList = new ArrayList<>(10);
//        stringArrayList.add("Hello");
//        stringArrayList.add("World");
//        for(String item: stringArrayList){
//            System.out.println(item);
//        }
//        System.out.println(stringArrayList.contains("hello"));
//        System.out.println(stringArrayList.contains("asdas"));
//        System.out.println(stringArrayList.contains("hello"));
//        System.out.println(stringArrayList.contains("world"));
//        System.out.println(stringArrayList.contains("assd"));
//        stringArrayList.remove(1);
//        System.out.println(stringArrayList);
//        stringArrayList.add(1,"mirim");
//        System.out.println(stringArrayList);
//        String[] strArray = stringArrayList.toArray(new String[stringArrayList.size()]);
    }
}
