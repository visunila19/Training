import java.util.*;

public class Main {
    public static void main(String[] args) {
      int mark[]={5,15,20,25,30};
      

      System.out.println(mark.length);

    }
}



reverse method :
    int mark[]={5,15,20,25,30};
      for(int i=mark.length-1;i>=0;i--){ 



import java.util.*;

public class Main {
    public static void main(String[] args) {

      int mark[]=new int [5];
      Scanner scan=new Scanner(System.in);
      for(int i=0;i<mark.length-1;i++){
        System.out.println("Enter the "+i+" index  value");
        mark[i]=scan.nextInt();
      }
      System.out.println(Arrays.toString(mark));

      }

    }








import java.util.*;

public class Main {
    public static void main(String[] args) {
      int arr[]={7,8,15,17,91,15};
      int max=arr[4];
      
      for(int i=4;i<arr.length;i++){
         if(max>arr[i]){
          max=arr[i];
         }
     
    }
System.out.println(max);

     

      }

    }



import java.util.*;

public class Main {
    public static void main(String[] args) {
int min=Integer.Min_Value;
int max=Integer.Max_Value;

     System.out.println(min);
    
System.out.println(max);