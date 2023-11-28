package VnekatFrameWork.VenkatRestAutomation;

import java.util.ArrayList;

public class LongestStringPlaindrome {

    public static ArrayList<String> getSubString(String str, int sizeOfSubString){


        ArrayList<String> al = new ArrayList<>();
        int i = 0;
        int j = str.length() - sizeOfSubString;
        String checkPlain;
        String plainFound = null;
        while(i<=j && sizeOfSubString!=str.length()+1) {
            checkPlain = str.substring(i, sizeOfSubString);
            plainFound =  getPald(checkPlain);
           // System.out.println("plain found ==" +plainFound);
            if(plainFound!="" && plainFound!=null){
                al.add(plainFound);
            }
            i++;
            sizeOfSubString++;
        }

       // System.out.println(al);
        return al;
    }

    public static void getLongestPlain(String str){
        //str = mississippi
       int startIndex=0;
       int endIndex=1;
        str.substring(startIndex,endIndex);
        for(int i=0;i<str.length();i++){

        }
    }

    public static String getPald(String str){

        StringBuilder builder = new StringBuilder(str);
        builder.reverse();
        //System.out.println(str);
        //System.out.println(builder);
        if(str.equals(builder.toString())){
            return str;
        }
        else {
            return "";
        }

    }

    public static void main(String[] args) {

ArrayList al = new ArrayList();
        for(int i=1;i<10;i++) {
          al =  getSubString("mississippi", i);
          //  System.out.println(al);
        }
        System.out.println(al);
       // System.out.println(getPald("madam"));
      //  getLongestPlain("mississippi");
      //  String s = "abc";
        //System.out.println(s.substring(0,1));

    }

}
