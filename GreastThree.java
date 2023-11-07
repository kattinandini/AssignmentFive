package com.Bridgelab.assignmentfive;
import java.util.*;
public class GreastThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1= scan.nextInt();
        int n2= scan.nextInt();
        int n3= scan.nextInt();
        if(n1> n2 && n1>n3){
            System.out.println(n1 +"is greater.....");
        }else if(n2 > n1 && n2>n3){
            System.out.println(n2 +"is greater...");

        }else{
            System.out.println(n3 +"is greater.....");
        }
    }
}
