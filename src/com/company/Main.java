package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String log = in.nextLine();
        Scanner id = new Scanner(System.in);
        String pas = id.nextLine();
        System.out.println(log);
        char[] ch =  pas.toCharArray();
        for (int i = 0;i < ch.length; i++){
            ch[i] = '*';
            System.out.print(ch[i]);
        }

    }
}
