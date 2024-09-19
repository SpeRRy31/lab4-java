import java.io.*;
import java.util.*;

public class OneDimensionalArray implements DoubleArrayReader, ArrayProcessor{
    public double[] readOneDimensionalArray(String fileName) {
        try (Scanner in = new Scanner(new File(fileName))) {
            System.out.println("scan");
            int n = in.nextInt();
            double[] arr = new double[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = in.nextDouble();
            }
            return arr;
        }
        catch (FileNotFoundException ex) {
            System.err.println("Error reading file " + ex.getMessage());
            return null;
        }
    }

    public double[] readOneDimensionalArray(File file){
        try (Scanner in = new Scanner(file)) {
            int n = in.nextInt();
            String arr = in.nextLine();
            System.out.println(arr);
            return stringToArray(n, in.nextLine());
        }
        catch (FileNotFoundException ex) {
            System.err.println("Error reading file " + ex.getMessage());
            return null;
        }
    }

    public double[][] readTwoDimensionalArray(File file){
        return null;
    }

    public double[][] readTwoDimensionalArray(String fileName){
        return null;
    }

    public double calculate(double[] array){
        double multi = 1;
        for (int i = 0; i < array.length; i++){
            multi=multi * array[i];
        }
        return multi;
    }
    public double calculate(double[][] array){
        return 0;
    }
    public void processArray(double[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.printf(array[i] + "; ");
        }
    }
    public void processArray(double[][] array){
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
