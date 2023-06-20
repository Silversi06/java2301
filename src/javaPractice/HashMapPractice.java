package javaPractice;

import java.lang.reflect.Array;
import java.util.*;

class Person{
    public String name;
    public String email;

    public Person(String kim, String s) {
    }
}
public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<String,Person> map = new HashMap<>();

        map.put("010-3423-4257",new Person("Kim","kim@naver.com"));
        map.put("010-5434-9805",new Person("Park","Park@naver.com"));
        System.out.println(map.get("010-3423-4257"));

        ArrayList<Integer> arr = new ArrayList<>(
                Arrays.asList(1,3,3,5,7,7,7,2)
        );
        HashMap<Integer,Integer> result = new HashMap<>();
        for(Integer num : arr){
            if (!result.containsKey(num)){
                //num 키 값을 1로 초기화 num 키값을
                result.put(num,1);
            }else{
                //키가 이미 잇으므로 num키 값을 1 증가
                result.put(num, result.get(num)+1);
            }
        }


    }
}