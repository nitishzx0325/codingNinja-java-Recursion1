import java.util.Arrays;

public class AllIndex {
    
    public static int[] all(int arr[],int x){
        int st=0;
        return allhelper(arr,x,st);
    }
    private static int[] allhelper(int[] arr, int x, int st) {
        if(st==arr.length){
            int out[]=new int[0];
            return out;
        }
        int sa[]=allhelper(arr, x, st+1);
        if(arr[st]==x){
            int newArr[]=new int[sa.length+1];
            newArr[0]=st;
            for(int i=0;i<sa.length;i++){
                newArr[i+1]=sa[i];
            }
            return newArr;
        }
        else{
            return sa;
        }
    }
    public static void main(String[] args) {
       
        int arr[]={9,8,10,8,8};
        int sa[]=all(arr, 8);
        System.out.println(Arrays.toString(sa));
    }
}
