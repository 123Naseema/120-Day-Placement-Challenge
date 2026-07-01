public class SwapOfNumber {
    public static void main(String[] args){
        int n1=90;
        int n2=50;
        System.out.println("before swap");

        System.out.println(n1);
        System.out.println(n2);

        n1=n1+n2;
        n2=n1-n2;
        n1=n1-n2;
        System.out.println("After swap");

        System.out.println(n1);
        System.out.println(n2);

    }
}
