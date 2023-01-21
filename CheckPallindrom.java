public class CheckPallindrom {
    
    public static boolean check(String str){
        if(str.length()<0){
            return true;
        }
        return checkHelper(str,0,str.length()-1);
    }

    private static boolean checkHelper(String str, int i, int j) {
        if(i==j){
            return true;
        }
        if(str.charAt(i)!=str.charAt(j)){
            return false;
        }
        if(i<j){
            checkHelper(str, i+1, j-1);
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(check("racecar"));
    }
}
