package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        getTyping();
    }

    public static void getTyping(){
        Scanner sc = new Scanner(System.in);
        int[] store = new int[5];
        int cnt = 0;
        while(sc.hasNextInt() && cnt < 5){
            store[cnt]=sc.nextInt();
            cnt++;
        }
        sc.close();
        for(int e:store){
            System.out.println("stored value is : "+e);
        }
    }
}
