public class mini3 {
    public static void main (String args[] ){
        int arr[]={5,9,15,27};
        int num = 2;
        boolean f= false;
        for (int i=0; i< arr.length; i++){
        if (arr[i]==num) {
            f= true;
            break;

        }

        }
        if (f){
            System.out.println("Found");
        }else {
            System.out.println("Not found");
        }


    }
}
