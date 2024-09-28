import java.io.*;
import java.util.*;

public class TwoDimensionalArray implements DoubleArrayReader, ArrayProcessor{
    public double[] readOneDimensionalArray(String fileName) {
        return null;
    }

    public double[] readOneDimensionalArray(File file){
        return null;
    }

    public double[][] readTwoDimensionalArray(File file){
        try (Scanner in = new Scanner(file)) {
            int n = in.nextInt();

            String arr = in.nextLine();
            System.out.println(arr);

            double[][] arr2D = new double[n][n];

            for (int i=0; i<n; i++){
                arr2D[i]=stringToArray(n, in.nextLine());
            }

            return arr2D;

        }
        catch (FileNotFoundException ex) {
            System.err.println("Error reading file " + ex.getMessage());
            return null;
        }
    }

    public double[][] readTwoDimensionalArray(String fileName){
        try (Scanner in = new Scanner(new File(fileName))) {
            int n = in.nextInt();

            String arr = in.nextLine();
            System.out.println(arr);

            double[][] arr2D = new double[n][n];

            for (int i=0; i<n; i++){
                arr2D[i]=stringToArray(n, in.nextLine());
            }

            return arr2D;

        }
        catch (FileNotFoundException ex) {
            System.err.println("Error reading file " + ex.getMessage());
            return null;
        }
    }

    public double calculate(double[] array){
        return 0;
    }

    public double calculate(double[][] array){
        double max;
        max = array[array.length-1][array.length-1];
        for (int i = array.length-1; i >= 0; i--) {
            for (int j = array.length-1; j >= i; j--) {
                System.out.printf(array[i][j] + " ");
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
            System.out.println("");
        }

        return max;
    }
    public void processArray(double[] array){
    }
    public void processArray(double[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    private double[] stringToArray(int length, String array){
        String[] stringValues = array.split(" ");

        double[] doubleArray = new double[length];

        for (int i = 0; i < length; i++) {
            try {
                doubleArray[i] = Double.parseDouble(stringValues[i]);
            } catch (NumberFormatException e) {
                System.err.println("Помилка формату числа на позиції " + i + ": " + stringValues[i]);
                return null;
            }
        }

        return doubleArray;
    }
}
