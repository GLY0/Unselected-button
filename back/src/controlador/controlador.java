package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;
import javax.swing.JOptionPane;
 import vista.vista;
public class controlador {
    vista vent;   
    public controlador(){       
    }
    public controlador(vista vent) {
        this.vent = vent;

        EscuchaBotones escucha1 = new EscuchaBotones();
        
        EscuchaMause escucha2 = new EscuchaMause();
        //Botones
        this.vent.btnYes.addActionListener(escucha1);
        
        this.vent.btnNo.addMouseListener(escucha2);

    }
    class EscuchaBotones implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent ae) {
            if (ae.getSource() == vent.btnYes) {
                JOptionPane.showMessageDialog(null, "WOHOO!!!!");
            }
        } 
    }        
    class EscuchaMause extends MouseAdapter {
        @Override
        public void mouseEntered(MouseEvent me) {
            if (me.getSource() == vent.btnNo) {
//          vent.btnNo.setBounds(10, 10, 0, 0); // cambiar de locacion del componente
            Random random = new Random();
            int x = random.nextInt(100);      
            int y = random.nextInt(100);
            if(x>20){
                x=x+300;
            }else {
                x=x+20;
            }
            vent.btnNo.setLocation(x,y);// cambiar de locacion del componente   
            }
        }   
    }
}
