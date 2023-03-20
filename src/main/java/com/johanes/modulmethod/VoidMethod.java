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
public class VoidMethod {
    public static void nPrintln(String pesan, int n){
        for(int i = 0;i<n;i++){
            System.out.println(pesan);
        }
    }
	public static void main(String[] args) {
	    nPrintln("Selamat datang java",5);
	}
}
