import java.io.*;
import java.util.*;

public class OneDimensionalArray implements DoubleArrayReader, ArrayProcessor{
    public double[] readOneDimensionalArray(String fileName) {
        try (Scanner in = new Scanner(new File(fileName))) {
            int n = in.nextInt();
            double[] arr = new double[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = in.nextDouble();
            }
            return arr;
        }
        catch (IOException ex) {
            System.err.println("Error reading file");
            return null;
        }
    }

    public double[] readOneDimensionalArray(File file){
        try (Scanner in = new Scanner(file)) {
            int n = in.nextInt();
            double[] arr = new double[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = in.nextDouble();
            }
            return arr;
        }
        catch (IOException ex) {
            System.err.println("Error reading file");
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

}
