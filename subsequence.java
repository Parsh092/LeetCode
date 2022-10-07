package Recursion;

import java.util.ArrayList;

public class subsequence {
    static void aps(int index, int[] s, ArrayList<Integer> arr) {
        if (index == s.length) {
            System.out.println(arr);
        } else {
            arr.add(s[index]);
            aps(index + 1, s, arr);
            arr.remove(arr.size() - 1);
            aps(index + 1, s, arr);
        }
        return;
    }

    public static void main(String[] args) {
        int[] s = {3, 1, 4};
        ArrayList<Integer> arr = new ArrayList<>();
        aps(0, s, arr);

    }
}
