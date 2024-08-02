import java.util.*;

public class Array{
    public static void main(String args[]){
        Scanner sc=  new Scanner(System.in);
        //-----------1-------------
        int marks[] = new int[4];
        // int []marks = new int[4];
        // marks[0] = 45;
        // marks[1] = 68;
        // marks[2] = 82;
        // marks[3] = 59;
        // // System.out.println(marks[0]);
        // // System.out.println(marks[1]);
        // // System.out.println(marks[2]);
        // // System.out.println(marks[3]);

        // for(int i = 0; i<4; i++){
        // System.out.println(marks[i]);
        // }
        //------------2--------------
        int size = sc.nextInt();
        int numbers[] = new int [size];
         
         // input
         for(int i = 0; i<size; i++){
           numbers[i] = sc.nextInt();
        }

        int x = sc.nextInt();

         // output
         // traversing array
        for(int i = 0; i<numbers.length; i++){
          if(numbers[i] == x){
            System.out.println("X found at index: " + i);
          }
        }
        
    }
}