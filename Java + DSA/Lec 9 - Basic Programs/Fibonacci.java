public class Fibonacci {
    public static void main(String[] args) {
        int first = 0;
        int second = 1;
        int count = 2;

        while (count <= 7){
            int temp = second;
            second = first+second;
            first = temp;
            count++;
        }
        System.out.println(second);
    }
}
