package com.company;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        getTyping();
        readFile("out.txt");
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
    public static void readFile(String fileName){
        try{
            File file = new File(fileName);
            Scanner sc = new Scanner(file);
            while(sc.hasNextInt()){
                System.out.println(sc.nextInt());
            }
            sc.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

    }
}
