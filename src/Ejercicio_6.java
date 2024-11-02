import javax.swing.JOptionPane;
public class Ejercicio_6 {
    public static void main(String[] args){
        short O, N=0;
            N= Short.parseShort(JOptionPane.showInputDialog("Ingresa el valor de N"));
            O= (byte) (N%2);
            if (O==0){
                 JOptionPane.showMessageDialog(null, "N es par");
            }else{
                 JOptionPane.showMessageDialog(null, "N es impar");
            }
            
            
    }
}
