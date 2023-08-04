import java.util.Scanner;

public class Process {
    static Scanner keyboard = new Scanner(System.in);
    static int number;
    static int[]numberArray;
    public static void main(String args[]){
        sorting(dataInput());
    }

    public static int[] dataInput() {
        System.out.println("How many numbers would you like to input:");
        number = keyboard.nextInt();
        numberArray = new int[number];
        System.out.println("Please input the numbers for bubble sort");
        for (int i=0; i<numberArray.length;i++){
            int data = keyboard.nextInt();
            numberArray[i]=data;
        } return numberArray;
    }

    public static void sorting(int[] numberArray){
        System.out.println("Numbers are: ");
        for(int i=0; i<numberArray.length;i++){
            System.out.printf(numberArray[i] +" ");
        }
        for (int i = 0; i<numberArray.length-1; i++) {
            for (int j = 0; j < numberArray.length - 1; j++) {
                if (numberArray[j] > numberArray[j + 1]) {
                    int temp = numberArray[j + 1];
                    numberArray[j + 1] = numberArray[j];
                    numberArray[j] = temp;
                }
            }
        }
        System.out.println("\nAfter sorting:");
        for (int i = 0; i<numberArray.length; i++) {
            System.out.printf(" "+numberArray[i]);
        }
    }
}
