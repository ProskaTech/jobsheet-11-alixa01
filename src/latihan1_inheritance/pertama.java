//author 21343040_alixa arivya tofer
package latihan1_inheritance;

/**
 *
 * @author HP
 */
public class pertama {
    private int a = 10;
    
    protected void terprotek(){
        System.out.println("Method ini hanya untuk anaknya");
    }
    
    public void info(){
        System.out.println("a = " + a);
        System.out.println("Dipanggil pada = " + this.getClass().getName());
    }
}
