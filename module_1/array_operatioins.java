package module_1;

import java.util.Arrays;

public class array_operatioins {
    public static void main(String[] args) {

        int a[] = {3, 2, 4, 1, 5, 6};
        int b[] = {1,2,3,4,5,6};

        Arrays.sort(a);

        String w = Arrays.toString(a);
        System.out.println(w);

        System.out.println(Arrays.binarySearch(a,2));
        System.out.println(Arrays.equals(a,b));

    }
}