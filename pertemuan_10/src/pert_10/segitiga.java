/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pert_10;

/**
 *
 * @author JULIUS HUTABARAT
 */


import java.util.Scanner;
public class segitiga extends bangundatar{
    
    {
	double alas, tinggi, luas;
        Scanner scan = new Scanner(System.in);
        
        System.out.println();
        alas = scan.nextDouble();
        System.out.println();
        tinggi = scan.nextDouble();
 
        
        luas = 0.5 * alas * tinggi;
 
        
        System.out.println("luas segitiga adalah: " + luas);
    }
     }
     