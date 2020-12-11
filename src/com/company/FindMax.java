package com.company;

import java.util.Random;
import java.util.Scanner;

public class FindMax {

    public static void main(String[] args) {
        int[][] arr = new FindMax().creat();
        int size = arr.length;
        int max = new FindMax().Find(arr);
        System.out.println("max is: " + max);

    }

    int[][] creat() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("insert row");
        int row = scanner.nextInt();
        System.out.println("insert collum");
        int collum = scanner.nextInt();
        int[][] arr = new int[row][collum];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < collum; j++) {
                arr[i][j] = (int) Math.round(Math.random()*100);
            }
        }
        return arr;
    }

    int Find(int[][] arr) {
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(max<arr[i][j]){
                    max=arr[i][j];
                }
            }
        }
        return max;
    }
}
