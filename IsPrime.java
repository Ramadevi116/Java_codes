import java.util.*;
class Primenum{
        static boolean prime(int a){
            for(int i=2;i<=a/2;i++){
                if(a%i==0){
                    return false;
                }
            }
                return true;
            
   
   }
    
     public static void main(String[] args){
         Scanner in=new Scanner(System.in);
         int n1=in.nextInt();
         System.out.println(prime(n1));
     }
}