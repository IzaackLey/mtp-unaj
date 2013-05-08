import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;
public class Laboratorio  extends JFrame implements ActionListener {
	private JTextArea tablero;
    private String texto = "";
    private JButton cambiarColorTexto;
    private JButton letraCursiva;
    private JButton aumentarSize;
    private JButton disminuirSize;
    private Componente escrito;
    private int tam = 15;
    private Font f;
    private DecoradorConcretoAumento d1;
    private DecoradorConcretoReduce d2;
    private DecoradorConcretoCambioColor d3;
    private DecoradorConcretoCursiva d4;
    public Laboratorio() {
        this.setLayout(null);
        this.setTitle("Laboratorio de Moléculas");
        this.setSize(400, 500);
        this.setLocation(100, 100);
        f = new Font("Helvetica", Font.ITALIC + Font.BOLD, tam);
        tablero = new JTextArea();
        tablero.setSize(350, 300);
        tablero.setLocation(10, 10);
        tablero.setFont(f);
        tablero.setText("");
        tablero.setEditable(true);
        add(tablero);
        JScrollPane areaScrollPane = new JScrollPane(tablero);
        areaScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        areaScrollPane.setSize(350, 300);
        areaScrollPane.setLocation(10, 10);
        this.getContentPane().add(areaScrollPane);
        aumentarSize = new JButton();
        aumentarSize.setSize(300, 20);
        aumentarSize.setLocation(40, 330);
        aumentarSize.setText("Aumentar tamaño del Texto");
        aumentarSize.addActionListener(this);
        add(aumentarSize);
        cambiarColorTexto = new JButton();
        cambiarColorTexto.setSize(300, 20);
        cambiarColorTexto.setLocation(40, 360);
        cambiarColorTexto.setText("Cambiar Color del Texto");
        cambiarColorTexto.addActionListener(this);
        add(cambiarColorTexto);
        letraCursiva = new JButton();
        letraCursiva.setSize(300, 20);
        letraCursiva.setLocation(40, 390);
        letraCursiva.setText("Letra Cursiva");
        letraCursiva.addActionListener(this);
        add(letraCursiva);
        disminuirSize = new JButton();
        disminuirSize.setSize(300, 20);
        disminuirSize.setLocation(40, 420);
        disminuirSize.setText("Reuducir Tamaño del Texto");
        disminuirSize.addActionListener(this);
        add(disminuirSize);
        addWindowListener(new Cierre());
    }
    public void actionPerformed(ActionEvent e) {
        texto = tablero.getText();
        if (e.getSource() == aumentarSize) {
            escrito = new DecoradorConcretoAumento();
        }
        if (e.getSource() == cambiarColorTexto) {
            escrito = new DecoradorConcretoCambioColor();
        }
        if (e.getSource() == disminuirSize) {
            escrito = new DecoradorConcretoReduce();
        }
        if (e.getSource() == letraCursiva) {
            escrito = new DecoradorConcretoCursiva();
        }
        escrito.setTablero(tablero);
        escrito.setSize(tam);
        escrito.operacion();
        tam = escrito.getSize();
        tablero.setText(texto);
        tablero = escrito.getTablero();
    }
    class Cierre extends WindowAdapter {
        @Override
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    }
}
