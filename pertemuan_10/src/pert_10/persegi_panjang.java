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
public class persegi_panjang extends bangundatar{
   
 private int panjang, lebar;

	public void setPanjang(int panjang) {
		this.panjang = panjang;
	}

	public void setLebar(int lebar) {
		this.lebar = lebar;
	}
        
        
	public int getLuas() {
		int luas;

		luas = this.panjang * this.lebar;
		return(luas);
	}
}
 

