/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nomor1;

/**
 *
 * @author ARMAN
 */
public class Laptop {

    //state or field
    String merek;

    //behavior or method
    void terjual(String merek, int terjual) {
        this.merek = merek;
        System.out.println(this.merek + ", Terjual " + terjual);
    }
}
