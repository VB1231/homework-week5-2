package printsyntax;

public class program9 {
    public static void main(String []args){
        int a=-5;
        int b=8;
        int c=6;
        int A=a+b*c;
        int d=55;
        int e=9;
        int B=(d+e)%e;
        int f=20;
        int g=-3;
        int h=5;
        int C=f+g*h/b;
        int i=15;
        int j=3;
        int k=2;
        int D=h+i/j*k-b%j;
        System.out.println("Expected Result:"+A);
        System.out.println("Expected Result:"+B);
        System.out.println("Expected Result:"+C);
        System.out.println("Expected Result:"+D);

    }
}
