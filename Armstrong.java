import java.util.Scanner;
class arm{
    boolean armstrong(int num){
        int temp,sum=0,rem;
        temp=num;
        while(temp!=0){
            rem=temp%10;
            sum=sum+(rem*rem*rem);
            temp=temp/10;
            
        }
        if(sum==num){
            return true;
        }else{
            return false;
        }
    }
}

class main{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        arm obj=new arm();
        for(int i=0;i<=num;i++){
            if(obj.armstrong(i)){
                 System.out.println(i);
        }
        }
    }
}