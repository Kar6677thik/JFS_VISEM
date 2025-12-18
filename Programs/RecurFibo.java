import java.util.*;

class RecurFibo {

    public static boolean checkPal(String str, int i, int j) {
        if (i >= j)
            return true;
        if (str.charAt(i) != str.charAt(j))
            return false;
        return checkPal(str, ++i, --j);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.next();
        System.out.println(checkPal(str, 0, str.length() - 1));
        sc.close();
    }
}