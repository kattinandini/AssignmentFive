package com.Bridgelab.assignmentfive;

public class FactorNum {


        public static void main(String[] args) {
            if (args.length == 0) {
                System.out.println("Please provide a number to find its prime factors.");
                return;
            }

            long N = Long.parseLong(args[0]);

            System.out.println("The prime factors of " + N + " are:");
            for (long i = 2; i * i <= N; i++) {
                while (N % i == 0) {
                    System.out.print(i + " ");
                    N /= i;
                }
            }

            if (N > 1) {
                System.out.print(N);
            }
        }
    }


