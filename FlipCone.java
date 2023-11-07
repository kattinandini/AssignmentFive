package com.Bridgelab.assignmentfive;
import java.util.*;
public class FlipCone {



        public static void main(String[] args) {
            int totalFlips = 1000; // Define the number of flips
            int heads = 0;
            int tails = 0;

            Random random = new Random();

            for (int i = 0; i < totalFlips; i++) {
                // Generating a random number, if it's less than 0.5, consider it as a head, otherwise, consider it as a tail.
                if (random.nextDouble() < 0.5) {
                    heads++;
                } else {
                    tails++;
                }
            }

            double percentageHeads = (heads * 100.0) / totalFlips;
            double percentageTails = (tails * 100.0) / totalFlips;

            System.out.println("Total flips: " + totalFlips);
            System.out.println("Heads: " + heads + " (" + percentageHeads + "%)");
            System.out.println("Tails: " + tails + " (" + percentageTails + "%)");
        }
    }
