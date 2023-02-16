import java.util.Scanner;

public class Task3 {

    public Task3() {
    }

    public void t3()
    {
        Scanner sc=new Scanner(System.in);
        int n=16;
        while (n>15)
        {
            System.out.println("Input n= SIZE of matrix[n;n] <= 16");
            n=sc.nextInt();
        }
        int [][]A=new int[n][n];
        System.out.println("Enter elements of matrix A: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("matrix[" + i + "]" + "[" + j + "]=");
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("Elements of matrix A are: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }

        int [][]B=new int[n][n];
        System.out.println("Enter elements of matrix B: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("matrix[" + i + "]" + "[" + j + "]=");
                B[i][j] = sc.nextInt();
            }
        }
        System.out.println("Elements of matrix B are: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }
        int [][]X=new int[n][n];
        int []max= new int[n];
        max[0]  =B[0][0];
        for (int i = 0; i < n; i++) {
            int k=0;
            while(k!=n)
            {
                if(max[i]<B[i][k]){
                    max[i]=B[i][k];
                }
                k++;
            }
            System.out.println("max of "+i+"row= " +max[i]);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n ; j++) {
                X[i][j]=A[i][j]*max[i];
                System.out.print(X[i][j]+ " ");
            }
            System.out.println();
        }
    }
}

