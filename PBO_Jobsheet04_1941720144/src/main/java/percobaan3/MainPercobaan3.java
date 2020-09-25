/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan3;
public class MainPercobaan3 {
    public static void main(String[] args) {
        Pegawai masinis=new Pegawai("1234","Spongebob");
        Pegawai asisten=new Pegawai("4567","Psatr7");
        KeretaApi keretaApi=new KeretaApi("Tayo","Chugington",masinis,asisten);
        
        System.out.println(keretaApi.info());
    }
}
