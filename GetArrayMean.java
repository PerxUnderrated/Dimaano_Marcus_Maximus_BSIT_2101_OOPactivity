import java.util.Scanner;

public class GetArrayMean {

    public static double GetArray(double[] arr) {
        if (arr.length == 0) {
            return 0; 
        }
        double sum = 0;
        for (double num : arr) {
            sum += num;
        }
        return sum / arr.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        double[] arr = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " +  ": ");
            arr[i] = scanner.nextDouble();
        }

        double mean = GetArray(arr);
        System.out.printf("Mean of the array is: %.2f%n",  mean);
        
        scanner.close();
    }
}


