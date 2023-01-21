public class CheckBetter {
    
    public static boolean better(int arr[],int st){
        if(st>=arr.length-1)
        return true;
        if(arr[st]>=arr[st+1])
        return false;
        boolean sa=better(arr, st+1);
        return sa;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,54};
        System.out.println(better(arr, 0));
    }
}
