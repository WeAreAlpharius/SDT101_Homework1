package Part3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Part3 {

    public static int LinLoop(List<Integer> a, int s){
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i) == s) return i;
        }
        return -1;
    }

    public static int LinRec(List<Integer> a, int s){
        int i = a.size() - 1;

        if(i <= -1 || a.get(i) == s) return i;
        return LinRec(a, s, i - 1);
    }

    public static int LinRec(List<Integer> a, int s , int i){

        if(i <= -1 || a.get(i) == s) return i;
        return LinRec(a, s, i - 1);
    }

    public static int BinLoop(List<Integer> a, int s){
        int left = 0;
        int right = a.size() - 1;

        while(left <= right){
            int mid = (left + right)/2;

            if(a.get(mid) == s){ return mid;}
            else if (a.get(mid) < s){ left = mid + 1;}
            else{ right = mid - 1;}
        }
        return -1;
    }

    public static int BinRec(List<Integer> a, int s){
        int left = 0;
        int right = a.size() - 1;

        if(left > right){ return -1;}

        int mid = (left + right)/2;

        if(a.get(mid) == s){ return mid;}
        else if (a.get(mid) < s){ return BinRec(a, s, mid + 1, right);}
        else {return BinRec(a, s, left, mid - 1);}
    }

    public static int BinRec(List<Integer> a, int s, int left, int right){
        if(left > right) return -1;
        int mid = (left + right)/2;
        if(a.get(mid) == s) return mid;
        else if (a.get(mid) < s) return BinRec(a, s, mid + 1, right);
        else return BinRec(a, s, left, mid - 1);
    }


    static void main() {
        Random r = new Random(10);

        ArrayList<Integer> a = new ArrayList<>(100);
        for (int i = 0; i < 100; i++) {
            a.add(r.nextInt(101));
        }

        a.sort(Integer::compare);

        IO.println(a.indexOf(21));
        IO.println(LinLoop(a, 21));
        IO.println(LinRec(a, 21));
        IO.println(BinLoop(a, 21));
        IO.println(BinRec(a, 21));

        IO.println("\n" + a.indexOf(50));
        IO.println(LinLoop(a, 50));
        IO.println(LinRec(a, 50));
        IO.println(BinLoop(a, 50));
        IO.println(BinRec(a, 50));
    }
}
