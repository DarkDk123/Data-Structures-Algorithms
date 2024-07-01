/*
 * StringBuffer!
 * 
 * String Buffer Exploration!
 */

import java.text.DecimalFormat;

public class LearnStringBuffer {
    public static void main(String[] args) {

        // Various Constructors

        // Empty!
        StringBuffer sb = new StringBuffer();

        // With default capacity!
        // StringBuffer sb = new StringBuffer(50);


        // With initial string value!
        // StringBuffer sb = new StringBuffer("Dipesh Rathore");
        
        // StringBuffer obj remain original, String obj changes!
        // Shows Mutability!
        
        // String s = "HEY";
        // System.out.println(sb.hashCode());
        // System.out.println(s.hashCode());
        // for (int i = 0; i < 8; i++) {
        //     sb.append(i + " ");
        //     s += i + "";
        // }
        
        // System.out.println(sb.hashCode());
        // System.out.println(s.hashCode());


        // there are many more methods

        sb.append("Dipesh is Great!");
        System.out.println(sb);
        
        sb.replace(4, 7, "Replaced");
        System.out.println(sb);

        sb.insert(0, "OK");
        System.out.println(sb);


        sb.delete(3, 5);
        System.out.println(sb);


        // Data Formatting with Strings
        DecimalFormat dc = new DecimalFormat("00.00");
        

        System.out.println(dc.format(4.393));
        System.out.println(dc.format(1111.920));
    }
}
