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
public class MencariMax {
     public static int max(int num1,int num2){
        int result;
        if(num1 > num2){
            result = num1;
        }else{
            result = num2;
        }
        return result;
    }
	public static void main(String[] args) {
	    int z = max(1,2);
	    System.out.println(z);
		
	}
    
}
