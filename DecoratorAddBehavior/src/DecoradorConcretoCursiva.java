import java.awt.Font;


public class DecoradorConcretoCursiva extends Decorador {
	public void operacion() {
        super.operacion();
        AgregarComportamiento();
    }
   public  void AgregarComportamiento() {
        tipoLetra = (int) (Math.random() * 10);
        switch (tipoLetra) {
            case 1:
                tipoLetra=Font.BOLD;
                break;
            case 2:
                tipoLetra=Font.ITALIC+Font.BOLD;
                break;
            case 3:
                tipoLetra=Font.PLAIN;
                break;
            case 4:
                tipoLetra=Font.ROMAN_BASELINE;
                break;
            default :
                tipoLetra=Font.ITALIC;
        }
        fuente = new Font("Helvética", tipoLetra, aumento);
        pizarra.setFont(fuente);
    }
}
