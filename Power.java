package com.Bridgelab.assignmentfive;

public class Power {


        public static void main(String[] args) {
            if (args.length == 0) {
                System.out.println("Please provide a value for N.");
                return;
            }

            int N = Integer.parseInt(args[0]);

            if (N < 0 || N >= 31) {
                System.out.println("N should be between 0 (inclusive) and 31 (exclusive).");
                return;
            }

            int i = 0;
            int powerOf2 = 1;

            System.out.println("Powers of 2 that are less than or equal to 2^" + N + " are:");
            while (i <= N) {
                System.out.println("2^" + i + " = " + powerOf2);
                powerOf2 *= 2;
                i++;
            }
        }
    }


