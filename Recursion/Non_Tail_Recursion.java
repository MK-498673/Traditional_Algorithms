/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

/**
 *
 * @author Masum Khan
 */
public class Non_Tail_Recursion {

    public static void main(String[] args) {
        int n = 3;
        haha(n);
    }

    static int haha(int n) {
        if (n == 0) {
            return 0;
        }
        haha(n - 1);
        System.out.println(" __ " + n);

        return 0;
    }
}
