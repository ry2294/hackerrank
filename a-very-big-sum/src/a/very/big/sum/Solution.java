/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a.very.big.sum;

import java.util.Scanner;

/**
 *
 * @author rakes
 */
public class Solution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        long sum = 0;
        while(length-- > 0) {
            sum += input.nextInt();
        }
        System.out.print(sum);
    }
    
}
