package VnekatFrameWork.VenkatRestAutomation;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class LongestSubstringWithoutRepeatingChar {

    public static int longestSubstring(String str) {


      str =  str.trim();
        if (!(str == " ") && !(str =="") && !(str == null)) {
            LinkedList<Character> lc = new LinkedList<>();
            LinkedList<Integer> lengthChar = new LinkedList<>();
            char[] ch = str.toCharArray();
            for (int i = 0; i < ch.length; i++) {
                if (!lc.contains(ch[i])) {
                    lc.add(ch[i]);
                } else {
                    lengthChar.add(lc.size());
                    lc.clear();
                    lc.add(ch[i]);
                }

            }

            int size = lengthChar.stream().sorted(Collections.reverseOrder()).findFirst().get();
           // System.out.println(size);
            return size;

        } else {

           // System.out.println("0");
            return 0;
        }

    }

    public static void main(String[] args) {
        String str= "  ";

        System.out.println(longestSubstring(str));

        // Collections.sort(lengthChar);
    }
}
