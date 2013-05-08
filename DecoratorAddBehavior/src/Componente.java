
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextArea;
public abstract class Componente {
    protected int aumento = 10;
    protected Font fuente;
    protected int tipoLetra = Font.ITALIC;
    protected Color color;
    protected JTextArea pizarra;

    public JTextArea getTablero() {
        return pizarra;
    }

    public void setTablero(JTextArea a) {
        pizarra = a;
    }

    public int getSize() {
        return aumento;
    }

    public void setSize(int tam) {
        aumento = tam;
    }
    public abstract void operacion();

}
