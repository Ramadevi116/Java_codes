import java.util.Scanner;
class Sort{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("count");
        int h=in.nextInt();
        
        int[] arr=new int[h];
        System.out.println("Enter numbers: ");
        for(int i=0;i<h;i++){
            arr[i]=in.nextInt();
            }
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
               int temp=0;
                if(arr[j]<arr[i]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    }
            }
	System.out.print(arr[i]+" ");
        }
        
        
    }
}