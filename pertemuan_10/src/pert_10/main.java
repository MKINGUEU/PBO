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
public class main {
    public static void main(String[] args) {
                 persegi_panjang kertas;
		kertas = new persegi_panjang();

		kertas.setPanjang(10);
		kertas.setLebar(4);
               
		System.out.println("Luas = " + kertas.getLuas());
	
                segitiga Kertas;
		Kertas = new segitiga();

                    Kertas.setAlas( 10);
		Kertas.setTinggi(4);
               
		System.out.println("Luas = " + Kertas.getLuas());
    
    }
}
