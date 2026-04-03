import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so hang : ");
        int rows = sc.nextInt();
        System.out.print("Nhap so cot : ");
        int cols = sc.nextInt();

        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        int[][] sumMatrix = new int[rows][cols];

        System.out.println("Nhap cac phan tu ma tran 1:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Nhap cac phan tu ma tran 2:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("\nKet qua phep cong hai ma tran:");
        for (int i = 0; i < rows; i++) 
	{
            for (int j = 0; j < cols; j++) 
            {
                System.out.print(sumMatrix[i][j] + "\t");
            }
            System.out.println(); 
        }

        sc.close();
    }
}