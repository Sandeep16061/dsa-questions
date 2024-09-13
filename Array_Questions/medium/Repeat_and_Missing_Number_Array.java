// time limit

import java.util.*;

public class Repeat_and_Missing_Number_Array {
    public static ArrayList<Integer> r_a_m(ArrayList<Integer> a) {
        Collections.sort(a);
        ArrayList<Integer> f = new ArrayList<>();
        for (int i = 0; i < a.size() - 1; i++) {
            if (a.get(i).equals(a.get(i + 1))) {
                f.add(a.get(i));
                break;
            }
        }
        for (int i = 0; i < a.size(); i++) {
            if (!(a.contains(i))) {
                f.add(i);
                break;
            }
        }
        return f;
    }

    public static void main(String args[]) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(3);
        arr.add(4);
        arr.add(3);
        arr.add(0);
        ArrayList<Integer> s = r_a_m(arr);
        System.out.println(s.get(0));
        System.out.println(s.get(1));
    }
}
