
package pert10latihan01;

/**
 *
 * @author Kristina 20103239
 */
public class Pert10Latihan01 {

    public static void main(String[] args) {
        karyawan kr = new karyawan();
        kr.setNIP("12345");
        System.out.println("Dari kelas karyawan :"+kr.getNIP());
        
        dosen dsn = new dosen();
        dsn.setNIP("11545");
        System.out.println("Dari kelas dosen :"+dsn.getNIP());
        
        dosen dsn2 = new dosen();
        dsn.setNID("67887");
        System.out.println("NID Dosen : "+dsn.getNID());
    }  
}
