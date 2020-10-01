/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan4;

/**
 *
 * @author Rafi Rachmawan
 */
public class Main {
    public static void main(String[] args){
        Penumpang p = new Penumpang("12345", "Mr.Krab");
        Penumpang p2 = new Penumpang("67890", "Budi");
        Gerbong gerbong = new Gerbong("A", 10);
        gerbong.setPenumpang(p, 1);
        gerbong.setPenumpang(p2, 1);
        System.out.println(gerbong.info());
    }
}

