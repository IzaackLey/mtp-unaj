import java.awt.Color;

public class DecoradorConcretoCambioColor extends Decorador{
    private int colors;
    
    public void operacion() {
        super.operacion();
        colors = (int) (Math.random() * 10);
        this.AgregarComportamiento();
    }
    
     public void AgregarComportamiento() {
        switch (colors) {
            case 1:
                color = Color.BLACK;
                break;
            case 2:
                color = Color.RED;
                break;
            case 3:
                color = Color.BLUE;
                break;
            case 4:
                color = Color.GREEN;
                break;
            case 5:
                color = Color.MAGENTA;
                break;
            case 6:
                color = Color.CYAN;
                break;
            case 7:
                color = Color.DARK_GRAY;
                break;
            case 8:
                color = Color.LIGHT_GRAY;
                break;
            case 9:
                color = Color.ORANGE;
                break;
            default:
                color = Color.PINK;
        }
        pizarra.setForeground(color);
    }

}
