package com.mycompany.mod4lab;

/**
 *
 * @author Naweed
 */

public class Mod4LAB {
    public static void main(String[] args) {
        int[] counts = new int[10];
        int[] bonus = new int[15];
        int[] bestScores = new int[] { 10, 20, 30, 40, 50 };
        
        // Sets the elements of 'counts' to zero:
        for (int i = 0; i < counts.length; i++) {
            counts[i] = 0;
        }
        
        // Adds one to each element of "bonus":
        for (int i = 0; i < bonus.length; i++) {
            bonus[i]++;
        }
        
        // Displays the elements of 'bestScores' in column format:
        System.out.println("Best Scores:");
        for (int i = 0; i < bestScores.length; i++) {
            System.out.println(bestScores[i]);
        }
    }
}
