import java.util.*;
public class StringBuilders {
    public static void main(String arge[]){
      StringBuilder sb = new StringBuilder("Tony");
      // StringBuilder sb = new StringBuilder("h");  // this is for append function
      // System.out.println(sb);
      
      // char at index 0
      // System.out.println(sb.charAt(0));

      //set char at index
    //   sb.setCharAt(0,'P');
    //  System.out.println(sb);

     //insert function
    //  sb.insert(0,'S');
    //  System.out.println(sb);

     //  inserting n in 2nd index
    //  sb.insert(2,'n');
    //  System.out.println(sb);

     //Delete the element in the string   
     // we delete the extra n in the 2nd index inthe string
    //  sb.delete(2, 3);
    //  System.out.println(sb);

     // in this we delete the both  n in the index
      // sb.delete(2, 4);
    //  System.out.println(sb);

    // Append this means we add 
    // sb.append("e");
    // sb.append("l");
    // sb.append("l");
    // sb.append("o");
    // System.out.println(sb.length());

   // reverse the element 
    for(int i = 0; i<sb.length()/2; i++){
      int front  = i;
      int back = sb.length() -1 -i;//  5-1-0 => 4
      char frontChar = sb.charAt(front);
      char backChar = sb.charAt(back);

      sb.setCharAt(front , backChar);
      sb.setCharAt(back , frontChar);
    }
    System.out.println(sb);
    }
}