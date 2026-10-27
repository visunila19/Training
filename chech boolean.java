import java.util.*;

public class main{
public static void main(String[]args){
    int arr[]= {6,1,0,2,9,5,6,3,7,4};
    boolean check =new boolean [arr.length+1];
    check[0]=true;
    for(int i=0;i<arr.length;i++){
        if(arr[i]>0 && arr[i]<=arr.length){
            check[arr[i]]=true;
            System.out.println(Arrays.toString(arr));
        }
    
    for(int i=0;i<check.length;i++){
    if(!check[i]){
    System.out.println(i);
    break;
    }
    }
    }
}