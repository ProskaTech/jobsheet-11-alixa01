//author 21343040_alixa arivya tofer
package latihan4_inheritance;

/**
 *
 * @author HP
 */
public class DemoOverride2 {
    public static void main(String args[]){
        b obj = new b();
        obj.setA(50);
        obj.setB(150);
        //akan memanggil method yang terdapat pada kelas B
        obj.tampilkanNilai();
    }
}
