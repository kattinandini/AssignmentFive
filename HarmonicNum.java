package com.Bridgelab.assignmentfive;
import java.util.*;
public class HarmonicNum {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a value for N.");
            return;
        }

        int N = Integer.parseInt(args[0]);

        if (N == 0) {
            System.out.println("N should be a non-zero value.");
            return;
        }

        double harmonic = 0.0;
        for (int i = 1; i <= N; i++) {
            harmonic += (1.0 / i);
        }

        System.out.println("The " + N + "th Harmonic Value is: " + harmonic);
    }
}




