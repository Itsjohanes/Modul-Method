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
public class Ambigu {
     public static double  max(int i,double j){
        if(i > j){
            return i;
            
        }else{
            return j;
        }
    }
    
    public static double max(double i,int j){
        if(i > j){
            return i;
            
        }else{
            return j;
        }
    }
	public static void main(String[] args) {
	    System.out.println(max(1,2));
	    
	    //1 bisa jadi 1.0 bisa jadi 1
	    //2 bisa jadi 2.0 bisa jadi 2

	}
}
