package com.dipesh.FirstPackage;

import static com.dipesh.SecondPackage.ToImport.greetString;
import static com.dipesh.SecondPackage.ToImport.num;

public class Main {
    public static void main(String[] args) {
        System.out.println(greetString);
        System.out.println(num);
    }

}