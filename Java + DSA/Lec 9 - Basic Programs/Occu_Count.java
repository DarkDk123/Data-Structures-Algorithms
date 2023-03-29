class Occu_Count{
    public static void main(String[] args) {
        int num = 1254551 ;
        int temp = num;
        int digit = 5;
        int occurences = 0;
        while (num>0){
            int loop_digit = num%10;
            if( digit==loop_digit){
                occurences++;
            }
            num = (int)num/10; // Casting to Integer Beacuase it needs to be in Python (But not in Java.)
        }
        System.out.println(String.format("%d Comes in %d only %d Times.", digit, temp, occurences));
    }
}