import java.util.*;
public class P1{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int data[]= new int[4];
        for(int i =0; i<data.length; i++){
            data[i] = scn.nextInt();
        }
        for(int i =data.length-1; i>=0; i--){
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }
}