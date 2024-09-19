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
        //here
        return null;
    }

    public double[][] readTwoDimensionalArray(String fileName){
        //here
        return null;
    }

    public double calculate(double[] array){
        return 0;
    }
    public double calculate(double[][] array){
        //here

        return 0;
    }
    public void processArray(double[] array){
    }
    public void processArray(double[][] array){
        //here
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
