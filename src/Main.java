import java.io.File;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        File lab41 = new File("src/lab41.txt");
        OneDimensionalArray arrayManager = new OneDimensionalArray();

        double[] array = arrayManager.readOneDimensionalArray(lab41);

        printArrayProcess(arrayManager, array);

        File lab42 = new File("src/lab42.txt");
        TwoDimensionalArray arrayManager2 = new TwoDimensionalArray();

        double[][] array2 = arrayManager2.readTwoDimensionalArray(lab42);

        printArrayProcess(arrayManager2, array2);

    }


    public static void printArrayProcess(ArrayProcessor obj, double[] arr){
        obj.processArray(arr);

        System.out.println(" ");
        System.out.println("array calculate: " + obj.calculate(arr));
    }
    public static void printArrayProcess(ArrayProcessor obj, double[][] arr){
        obj.processArray(arr);

        System.out.println(" ");
        System.out.println("array calculate: " + obj.calculate(arr));
    }
}