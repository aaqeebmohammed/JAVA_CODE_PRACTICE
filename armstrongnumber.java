import java.util.Scanner;
public class armstrongnumber{
    public static void main(String[] args) {
        int num, arm=0, rem, c;
        System.out.println("enter any number");
        Scanner sc = new Scanner(System.in);
        num=sc.nextInt();
        c=num;
        while (num>0) { 
            rem=num%10;
            arm=(rem* rem* rem)+arm;
            num=num/10;
        }
        if(c==arm)   
        System.out.println("armstrong number");
        else
        System.out.println("not armstrong number");


    }
}