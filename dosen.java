
package pert10latihan01;

/**
 *
 * @author kristina 20103239
 */
public class dosen extends karyawan {
    private String NID;
    private int umur;
    
  public void setNID(String nid){
       this.NID = nid; 
    }
  public String getNID(){
      return this.NID;
    }
  public void setUMUR(int umur){
      this.umur = umur;
  }
  public int getUMUR(){
      return this.umur;
  }
  
}
