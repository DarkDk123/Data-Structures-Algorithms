public class productDigit {
    public static void main(String[] args) {
        int n = 525;
        System.out.println("Product is : " + digitProd(n));
    }

    static int digitProd(int n){
        if (n==0) return 1;

        int lastDigit = n%10;
        return (lastDigit * digitProd(n/10));
    }
}
