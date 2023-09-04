import java.io.*;
class Reverse{
    void rev(String l){
        char[] ch=new char[l.length()];
	System.out.println(l.length());
        int count=0;
        for(int i=l.length()-1;i>0;i--){
            ch[count]=l.charAt(i);
            count++;
    }
String emp=" ";
for(int j=0;j<l.length();j++){
emp=emp+ch[j];
}
System.out.println(emp);
}
}
class rev{
    public static void main(String[] args){
         String line= "hello";
        Reverse s=new Reverse();
        s.rev(line);
    }
}