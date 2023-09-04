import java.util.*;
class GCD{
   static int gcd(int a,int b){
    int min=0;
    if(a>b){
        min=b;
    }else{
        min=a;
    }
    for(int i=min;i>=1;i--){
        if(a%i==0 && b%i==0){
            return i;
        }
    }
    return 1;
   }
    
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int num1=in.nextInt();
        int num2=in.nextInt();
        System.out.println(gcd(num1,num2));
    }
}