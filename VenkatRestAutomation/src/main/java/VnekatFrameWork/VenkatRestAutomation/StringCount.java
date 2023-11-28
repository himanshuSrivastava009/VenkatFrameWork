package VnekatFrameWork.VenkatRestAutomation;


import java.util.*;

public class StringCount {

    public static void main(String[] args) {
        String s = "awertyawkrtmbmbmbma";
        char[] cl = s.toCharArray();
        // Arrays.asList(cl).stream().sorted().forEach(System.out::println);

        TreeMap<Character, Integer> map = new TreeMap<>();

        char[] ch = s.toCharArray();
        for (char c : ch) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }


        }
        ArrayList<Integer> al = new ArrayList<>();
        //  System.out.println(map);
        for (Map.Entry<Character, Integer> count : map.entrySet()) {

           al.add(count.getValue());

        }
        Collections.sort(al);
        System.out.println(al);

        for (Map.Entry<Character, Integer> count : map.entrySet()) {
            System.out.println(count.getKey() + "="+count.getValue());

        }
//
//        int k = 100;
//        ++k;
//        System.out.println(++k);
//
//        String string = "tomorrowip";
//
//       // System.out.println(string.substring(5, 7));//ro
//        String ab = string.substring(5, 7);
//        System.out.println(ab);
//        char a = string.charAt(1);//o
//        System.out.println(a);
//        System.out.println(ab+a);//roo
//        System.out.println(string.indexOf('t'));
//        String n = new String("tomorrowip");
//        System.out.println(string.equals(n));//true
//        System.out.println(string==n);//false


        for(int i=0;i<7;i++){
            if(i>3){
                continue;
            }
            System.out.println(i);//1,2,3
        }
    }
}
