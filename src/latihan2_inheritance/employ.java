//author 21343040_alixa arivya tofer
package latihan2_inheritance;

/**
 *
 * @author HP
 */
public class employ extends person {
    private String noKaryawan;
    
    public employ (String noKaryawan, String name, int age){
        super(name, age);
        this.noKaryawan = noKaryawan;
    }
    
    public void info(){
        System.out.println("No. Karyawan : " + this.noKaryawan);
        super.info();
    }
}
