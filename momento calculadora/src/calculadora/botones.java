package calculadora;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class botones {
    double numero=0, resultado=0;
    char operacion = 'n';
    StringBuffer s = new StringBuffer();
    JTextField display;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;
    JButton bs, br, bd, bm, bp, bi, reset;
    JPanel superior, medio, inferior;

    public void main() {
        //Interfaz Gráfica para el Usuario
        display = new JTextField();
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b0 = new JButton("0");
        bs = new JButton("+");
        br = new JButton("-");
        bd = new JButton("/");
        bm = new JButton("*");
        bp = new JButton(".");
        bi = new JButton("=");
        reset = new JButton("Nuevo Cálculo");
        superior = new JPanel();
        medio = new JPanel();
        inferior = new JPanel();

        //Colocar componentes
        setLayout(new BorderLayout());
        superior.setLayout(new BorderLayout());
        superior.add("Center",display);
        display.setEditable(false);
        medio.setLayout(new GridLayout(4,4));
        medio.add(b0);
        medio.add(b1);
        medio.add(b2);
        medio.add(bs);
        medio.add(b3);
        medio.add(b4);
        medio.add(b5);
        medio.add(br);
        medio.add(b6);
        medio.add(b7);
        medio.add(b8);
        medio.add(bd);
        medio.add(b9);
        medio.add(bp);
        medio.add(bi);
        medio.add(bm);
        inferior.setLayout(new BorderLayout());
        inferior.add("Center",reset);
        add("North",superior);
        add("Center",medio);
        add("South",inferior);

        //Manejo de eventos por los botones
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        bs.addActionListener(this);
        br.addActionListener(this);
        bd.addActionListener(this);
        bm.addActionListener(this);
        bp.addActionListener(this);
        bi.addActionListener(this);
        reset.addActionListener(this);

        setBounds(50,50,200,200);
        setVisible(true);
        this.setLocationRelativeTo(null);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
                System.exit(0);
            }
        });
    }

}
