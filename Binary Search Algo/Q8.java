public class Q8 {
    static char ngl(char[] letters,char target){
        int s = 0;
        int e = letters.length - 1;
        while(s<=e){
            int mid = s + (e-s)/2;
            if(letters[mid]<=target){
                s = mid + 1;
            }else{
                e = mid - 1;
            }
        }
        return letters[s%letters.length];
    }

    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'c';
        char result = ngl(letters, target);
        System.out.println(result);
    }
    
}
