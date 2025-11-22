public class Q2 {
    public static void main(String[] args) {
        String name = "Himanshu";
        char ch = 'k';
        boolean found = false;
        
        for(int i = 0;i<name.length();i++){
            if(name.charAt(i) == ch){
                found = true;
                break;
            }
        }
        if(found){
            System.out.println("Char Element Exists");
        }else{
            System.out.println("Char Element do not exists");
        }

    }
    
}
