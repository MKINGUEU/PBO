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
public class segitiga extends bangundatar{
     private int alas, tinggi;
     
    
        public void setAlas(int alas) {
		this.alas = alas;
	}

	public void setTinggi(int tinggi) {
		this.tinggi = tinggi;
	}   
         
         
    public int getLuas() {
		int luas;

		luas = this.tinggi * this.alas ;
		return(luas);
	}
}