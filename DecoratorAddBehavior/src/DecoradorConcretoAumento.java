import java.awt.Font;


public class DecoradorConcretoAumento extends Decorador{
    public void operacion() {
        super.operacion();
        AgregarComportamiento();
    }
    public void AgregarComportamiento() {
        aumento=aumento+3;
        fuente = new Font("Helvética", Font.ITALIC + Font.BOLD, aumento);
        pizarra.setFont(fuente);
    }
}
