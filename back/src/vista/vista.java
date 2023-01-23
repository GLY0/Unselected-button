package vista;

import controlador.controlador;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class vista extends JFrame {
    
    // declarar componentes swings 
    JLabel lbltitulo;
    public JButton btnYes, btnNo;
    //construcor
    public vista(){
        this.setTitle("Ventana principal");
        this.setSize(500,300);// x, y
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
        Componentes();
    }
    //metodo 
    private void Componentes(){
        
        JPanel General = new JPanel();
        this.getContentPane().add(General);
        General.setLayout(new FlowLayout(FlowLayout.CENTER));
        General.setSize(400, 500); 
               
        GridLayout grid = new GridLayout(2,1,10,10);
        General.setLayout(grid);
        this.add(General);   
        
//titulo
        JPanel subpanel1 = new JPanel();
        lbltitulo = new JLabel("wanna marry me? :D");
        lbltitulo.setFont(new Font("Colibri Light",Font.LAYOUT_NO_START_CONTEXT, 50));
        lbltitulo.setForeground(Color.GRAY);
        subpanel1.add(lbltitulo);
        
//botones 
        btnYes = new JButton("YES");
        btnNo = new JButton("NO");
        btnNo.setSize(100, 50);
        btnYes.setSize(100,50);
        
        JPanel subpanel2 = new JPanel();
        subpanel2.add(btnYes,BorderLayout.PAGE_END);
        subpanel2.add(btnNo,BorderLayout.PAGE_END); 
        
        //UNION DE PANELES
        General.add(subpanel1);
        General.add(subpanel2); 
    }
    public static void main(String[] args) {
        //mostrar la ventana 
        vista ventana = new vista();
        ventana.setVisible(true);
        //llamar controlador 
        controlador controlador = new controlador(ventana);
    }
    
}
