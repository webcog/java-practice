package com.wajahat;
import java.util.Scanner;
public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        float num = input.nextInt();
//        System.out.println(num);
        int num =(int)(65.23f);
        System.out.println(num);

        int a = 257;
        byte b = (byte)(a); // 257 %% 256 = 1
        System.out.println(b);
    }
}