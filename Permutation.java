package Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Permutation {

    static void per(int[] arr, int n, List<Integer> al, boolean[] bool) {
        if (al.size() == arr.length) {
            for (int i = 0; i < n; i++) {
                System.out.print(al.get(i) + " ");
            }
            System.out.println();
            return;
        }
        for (int i = 0; i < n; i++) {
            if (!bool[i]) {
                bool[i] = true;
                al.add(arr[i]);
                per(arr, n, al, bool);
                al.remove(al.size() - 1);
                bool[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        List<Integer> al = new ArrayList<>();
        boolean[] bool = new boolean[n];
        per(arr, n, al, bool);
    }
}
