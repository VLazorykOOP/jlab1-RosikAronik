import java.util.Scanner;

public class Task2 {

    public void t2() {
            Scanner input = new Scanner(System.in);
            int n=201;
            int a,b;
        System.out.println("Input a");
        a=input.nextInt();
        System.out.println("Input b");
        b=input.nextInt();
            while (n>200)
            {
                System.out.println("Input SIZE of array <= 200");
                n=input.nextInt();
            }
            System.out.println("Input array");
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.print("array["+i+"]= ");
                array[i]=input.nextInt();
            }

            System.out.print("Your array: [");

            for (int i = 0; i < n-1; i++) {
                System.out.print(array[i] +", ");
            }
            System.out.print(array[n-1]+"] ");

            System.out.println();
            int maxValue = array[0];
            int l=0;
            for (int i = 0; i < n; i++) {
                if (maxValue < array[i]) {
                    maxValue = array[i];
                }
                int minValue = array[0];

                }
        int minValue = array[0];
        for (int i = 0; i < n; i++) {
            if (minValue > array[i]) {
                minValue = array[i];
            }

            }
        int asuma=0;
        for (int i = 0; i < n; i++) {
            if (array[i] < a) {
                asuma += array[i];
            }
        }
        int bsuma=1;
        for (int i = 0; i < n; i++) {
            if (array[i]>b) {
                bsuma *= array[i];
            }
        }
        System.out.println("bsuma:"+bsuma);
        System.out.println("asuma:"+asuma);
        System.out.println("Max:"+maxValue);
        System.out.println("Min:"+minValue);
        }
    }
