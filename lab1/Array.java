import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so phan tu : ");
        int n = sc.nextInt();
        double[] array1 = new double[n];

        System.out.println("Nhap cac phan tu :");
        for (int i = 0; i < n; i++) 
	{
            System.out.print("Phan tu [" + i + "]: ");
            array1[i] = sc.nextDouble();
        }

        Arrays.sort(array1);

        double sum = 0;
        for (double num : array1) 
	{
            sum += num;
        }
        double average = sum / n;

        System.out.println("Mang sau khi xap xep: " + Arrays.toString(array1));
        System.out.println("Tong cac phan tu: " + sum);
        System.out.println("Gia tri trung binh: " + average);

        sc.close();
    }
}