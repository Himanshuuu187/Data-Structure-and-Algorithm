public class FiboNaciSeries{
    public static void main(String[] args) {
        System.out.println(fibo(4));
    }
    public static int fibo(int n){
        if(n<2){
            return n;
        }else{
            return fibo(n - 1) + fibo(n - 2);
        }
            
        
    }
   
}