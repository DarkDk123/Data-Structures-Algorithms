public class Reverse {
    public static void main(String[] args) {
        int number = 12345;
        int temp = number;
        int res = 0;
        while (number>0){

            res = (res * 10) + number%10;
            number/=10;
        }
        System.out.println(String.format("Reverse of %d is: %d", temp, res));
    }    
}
