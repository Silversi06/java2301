package java2301_1;

public class StringBufferStudy {
    public static void main(String[] args) {
        String result="";
        for(int i=0; i<10; i++){
            result+=i+"";

        }
        //System.out.println(result);
        String s = "abcd";
        StringBuffer sb = new StringBuffer();
        sb.append("01234567789");
        sb.delete(1,3);

//        sb.append("Hello");
//        sb.append(" World");
//        String s1 = "Hello";
//        s1+=" World";
        System.out.println(sb);
        System.out.println(sb.capacity());
    }
}
