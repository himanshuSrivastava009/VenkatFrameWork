package VnekatFrameWork.VenkatRestAutomation;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FindingMedianOfTwoGivenArray {


    public static double findMedian(int[]ar1, int[]ar2){

        List<Integer> al = new ArrayList<>();
        for (int i: ar1) {
            al.add(i);
        }
        for (int i: ar2) {
            al.add(i);
        }
        System.out.println("Combined 2 array's are==" +al);
      al =   al.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted AraayList is " +al);
       Integer sum  = al.stream().collect(Collectors.summingInt(Integer::intValue));

      // double median = (double)sum/al.size();
       // System.out.println("median is "+median);
        if(al.size()%2!=0 && al.size()>1){

            return al.get((al.size()/2));
        }
        else if(al.size()==1){

            return al.get(0);
        }
        else if(al.size()%2==0){
            int firstNumber = al.get(al.size()/2);
            int secondNumber = al.get(al.size()/2-1);
            System.out.println(firstNumber + "&" + secondNumber);
            double med = (double)(firstNumber+secondNumber)/2;
            System.out.println(med);
            return med;
        }
        else {
            return 0;
        }


    }

    public static void main(String[] args) {
        System.out.println( findMedian(new int[]{1,2,3},new int[]{4,5,6,7}));
    }
}
