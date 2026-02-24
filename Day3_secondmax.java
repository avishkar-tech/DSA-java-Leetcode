import java.util.*;
public class Day9 {
    public static void main(String[] args) {
        int[]arr = {10,20,50,55,62,95};
        int max1;
        int max2;
        if(arr[0]>arr[1])
        {
            max1 = arr[0];
            max2 = arr[1];
        }
        else {
            max1 = arr[1];
        max2 = arr[0];
        }
        for (int i = 2 ; i < arr.length ; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            }
        else if (arr[i]>max2) {
                max2 = arr[i];
            }
        }

            System.out.print("2nd largest number:" + max2);
        }
    }

