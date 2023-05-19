import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CapturaEventoBotao implements ActionListener  {
    private JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;

    public void janela(){
        JFrame frame = new JFrame();
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b10 = new JButton("0");
        b11 = new JButton(".");
        b12 = new JButton("=");
        b13 = new JButton("+");
        b14 = new JButton("-");
        b15 = new JButton("*");
        b16 = new JButton("/");

        b1.setBounds(50,50,50,50);
        b2.setBounds(50,50,50,50);
        b3.setBounds(50,50,50,50);
        b4.setBounds(50,50,50,50);
        b5.setBounds(50,50,50,50);
        b6.setBounds(50,50,50,50);
        b7.setBounds(50,50,50,50);
        b8.setBounds(50,50,50,50);
        b9.setBounds(50,50,50,50);
        b10.setBounds(50,50,50,50);
        b11.setBounds(50,50,50,50);
        b12.setBounds(50,50,50,50);
        b13.setBounds(50,50,50,50);
        b14.setBounds(50,50,50,50);
        b15.setBounds(50,50,50,50);
        b16.setBounds(50,50,50,50);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);


        JPanel painel = new JPanel();
        painel.add(b1);
        painel.add(b2);
        painel.add(b3);
        painel.add(b4);
        painel.add(b5);
        painel.add(b6);
        painel.add(b7);
        painel.add(b8);
        painel.add(b9);
        painel.add(b10);
        painel.add(b11);
        painel.add(b12);
        painel.add(b13);
        painel.add(b14);
        painel.add(b15);
        painel.add(b16);


       frame.getContentPane().add(painel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200,200);
        frame.setVisible(true);

    }
    public  void  actionPerformed(ActionEvent evento){
        b1.setText("Botão foi clicado!");
        b1.setFont(new Font("SansSerif",Font.BOLD,20));
    }
    public static void main (String[]args){
        CapturaEventoBotao captura = new CapturaEventoBotao();
        captura.janela();
    }
}
