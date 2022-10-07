package Recursion;

import java.util.ArrayList;

public class total_subsequence {
    static int aps(int index, int[] s, ArrayList<Integer> arr, int sum) {
        if (index == s.length) {
            if (sum == 2) {
                System.out.println(arr);
                return 1;
            } else {
                return 0;
            }
        }

        arr.add(s[index]);
        sum = sum + arr.get(arr.size() - 1);
        int l = aps(index + 1, s, arr, sum);
        sum = sum - arr.get(arr.size() - 1);
        arr.remove(arr.size() - 1);
        int r = aps(index + 1, s, arr, sum);

        return l + r;
    }

    public static void main(String[] args) {


        int sum = 0;
        int[] s = {1, 2, 1, 0};
        ArrayList<Integer> arr = new ArrayList<>();
        int a = aps(0, s, arr, sum);
        System.out.println("The total number of subsequences having sum is two = "+a);
    }
}
