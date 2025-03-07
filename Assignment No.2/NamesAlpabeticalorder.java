import java.util.*;
public class NamesAlpabeticalorder {
    public static void main(String args[]){
      String names[]=new String[10];
      Scanner sc=new Scanner(System.in);
      
      System.out.println("Enter the 10 names:");
      for(int i=0;i<10;i++){
        names[i]=sc.nextLine();
      }

      Arrays.sort(names);


      System.out.println("Names in alphabattical order:");
      for(int i=0;i<10;i++){
        System.out.println(names[i]);
      }
    }

}
