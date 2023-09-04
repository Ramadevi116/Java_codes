import java.util.*;
class Trailingzeros{
   static int trail(int n){
    int res=0;
    int powof5=5;
    while(n>=powof5){
        res=res+(n/powof5);
        powof5=powof5*5;
    }
    return res;
   }
public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        System.out.println(trail(num));
    }
}