    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet4.Percobaan4;

/**
 *
 * @author DEBORA
 */
public class MainPercobaan4 {
    public static void main(String args[]){
        Penumpang p = new Penumpang("12345","Mr.Crab");
        Gerbong gerbong = new Gerbong("a",10);
        gerbong.setpenumpang(p, 1);
        gerbong.setpenumpang(p, 2);
        System.out.println(gerbong.info());
    }
    
}
