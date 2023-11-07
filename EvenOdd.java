package com.Bridgelab.assignmentfive;
import java.util.*;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num=scan.nextInt();
        if(num%2==0){
            System.out.println(num +"even number....");

        }
        else{
            System.out.println(num + " odd number...");
        }
    }
}
