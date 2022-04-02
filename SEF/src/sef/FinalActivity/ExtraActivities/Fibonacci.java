package sef.FinalActivity.ExtraActivities;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Extra task 3

public class Fibonacci {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the length of Fibonacci series:");
        int i = 0;
        try {
            i = Integer.parseInt(br.readLine());
            if (i < 0 || i > 46) {
                throw new IllegalArgumentException();
            }
        } catch (NumberFormatException numberFormatException) {
            System.err.println("Invalid Format!");
            System.exit(1);
        } catch (IllegalArgumentException illegalArgumentException) {
            //To avoid int overflow, set the value limit to 46
            System.err.println("Length of Fibonacci series can not be less 0 and greater 46!");
            System.exit(1);
        }
        createFibonacci(i);
    }

    private static void createFibonacci(int num) {
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                arr[i] = 0;
                continue;
            }
            if (i == 1) {
                arr[i] = 1;
                continue;
            }
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        System.out.println("Printing a Fibonacci series of " + num + " numbers");
        for (int i = 0; i < arr.length; i++) {
            if (i == 0){
                System.out.print(arr[i]);
            }else{
                System.out.print(" " + arr[i]);
            }

        }

    }

}
