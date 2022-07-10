import java.util.Scanner;

public class mini2 {
    public static void main (String args[] ){
        Scanner in = new Scanner(System.in);
        int arr [] = new int [5];
        for (int i=0; i< arr.length; i++ ) {
            System.out.println("Enter element # "+(i+1)+":" );
            arr[i]= in.nextInt();
        }
        int sum=0;
        for (int i=0; i< arr.length; i++ ) {
            sum+=arr[i];
        }
        double avg = sum/arr.length;
        System.out.println("Average : "+avg);

        }
}
