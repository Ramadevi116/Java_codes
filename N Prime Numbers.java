import java.util.*;
class Primenum{
        static boolean prime(int a){
            if(a==1){
                return false;
            }if(a==2 || a==3){
                return true;
            }if(a%2==0 || a%3==0){
                return false;
            }
            for(int i=5;i*i<=a;i=i+6){
                if(a%i==0 || a%(i+2)==0){
                    return false;
                }
            }
                return true;
   }
   static void PrintPrimenum(int n){
   for(int j=2;j<=n;j++){
        if(prime(j)){
            System.out.println(j);
        }
   }
   }
    
     public static void main(String[] args){
         Scanner in=new Scanner(System.in);
         int n1=in.nextInt();
         PrintPrimenum(n1);
     }
}
