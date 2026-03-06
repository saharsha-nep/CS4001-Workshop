public class MathOperator{
    public static void main(String[] args){
        int a = 5;
        int b = 6;
        System.out.println(a+b);
        System.out.println(a*b);
        System.out.println(a-b);
        System.out.println(a/b);
        System.out.println(a%b);
        a += 4;
        if(a>b && b<a){
            System.out.println("That shows both logical and relational");
        }
        System.out.println(++a);
        System.out.println(a++);
        int max = (a>b) ? a:b;
        System.out.println(max);
    }
}