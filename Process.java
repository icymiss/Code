import java.util.Scanner;
public class Process {
    public static void main(String arg[]){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please input the size:");
        int size = keyboard.nextInt();
        for(int i=0; i<size; i++){
            for(int j=0; j<size;j++){
                if(j<size-i){
                    System.out.print(j+1);
                }else System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=0; i<size-1; i++){
            for(int j=0; j<size;j++){
                if(j<=i+1){
                    System.out.print(j+1);
                }else System.out.print(" ");
            }
            System.out.println();
        }

    }
}
