/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.johanes.modulmethod;

/**
 *
 * @author acer
 */
public class Swap {
    public static void swap(int n1,int n2){
        System.out.println("before swapping dalam method n1 = " + n1 + " dan n2 =  " + n2);
        int temp = n1;
        n1  = n2;
        n2 = temp;
        System.out.println("after dalam method n1 = " + n1 + " dan n2  = " + n2);
    }
	public static void main(String[] args) {
	    int num1,num2;
	    num1 = 1;
	    num2 = 2;
        System.out.println("before swapping n1 = " + num1 + " dan n2 =  " + num2);
        swap(num1,num2);
                System.out.println("After call swapping n1 = " + num1 + " dan n2 =  " + num2);

	}
}
