package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int mass[] = new int[a];
        for(int i = 0; i<a; i++) mass[i] = in.nextInt();
        int b = in.nextInt();
        for(int i = 0; i<a; i++){
            if(b == mass[i]){
                System.out.println(i + 1);
                return;
            }
        }
        System.out.println("NO");
    }
}