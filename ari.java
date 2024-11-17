import java.util.Scanner;
class ari{
public static void main(String Args[]){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int meter=a/100;
a=a%100;
int feet=a/30;
a=a%30;
double inch=a/2.5;
int in=(int) inch;
a=a% 2.5;
System.out.println(meter+"meters "+feet+"feet "+in+"inches "+a+"cm");
}
}