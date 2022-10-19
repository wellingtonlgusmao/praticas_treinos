import javax.swing.text.StyledEditorKit.BoldAction;

/**
 * Classe utilizada para demonstrar o uso do operador logico
 * E ( && )
 * classe utilizada para demonstrar o uso do operador logico
 * ou (11)
 * classe utilizada para demonstrar o uso do operador logico
 * negação
 */
public class OperadoresLogicos {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = true;
        boolean d = false;

        System.out.println(a && b);
        System.out.println(a && c);
        System.out.println(b && d);
        System.out.println(a || b);
        System.out.println(b || c);
        System.out.println(!a);
        System.out.println(!(b || c));
    }
}