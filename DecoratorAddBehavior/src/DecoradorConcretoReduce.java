
import java.awt.Font;

public class DecoradorConcretoReduce extends Decorador{
    public void operacion() {
        super.operacion();
        aumento=aumento-3;
        AgregarComportamiento();
    }
    public void AgregarComportamiento() {
        fuente = new Font("Helvética", Font.ITALIC + Font.BOLD, aumento);
        pizarra.setFont(fuente);
    }
}
