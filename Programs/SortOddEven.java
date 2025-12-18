import java.util.*;

public class SortOddEven {
    public static List<Integer> fun(int arr[]) {
        List<Integer> odd = new ArrayList<>(), even = new ArrayList<>();
        for (int n : arr) {
            if (n % 2 == 0)
                even.add(n);
            else
                odd.add(n);
        }
        Collections.sort(odd);
        Collections.sort(even);
        odd.addAll(even);
        return odd;
    }

    public static void main(String[] args) {
        int arr[] = { 12, 27, 7, 4, 6, 3, 5, 1, 16 };
        List<Integer> result = fun(arr);
        for (int n : result) {
            System.out.print(n + " ");
        }
    }
}
