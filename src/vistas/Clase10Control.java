
package vistas;

import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * Esta clase contiene todos los elementos de la Interface Gráfica para que
 * puedan ser manejados desde las otras clases del programa.
 * 
 * @author José Francisco Sánchez Portillo
 */
public class Clase10Control {
    // Se crean los arrays de elementos y los elementos:
    private JLabel[] jLabel_F;
    private JLabel[] jLabel_T;
    private static JTextArea jTextArea_Log;
    private JTextField[] jTextField_C;
    public static int[] filoCount;
    String NoFilosofos;
    

    /**
     * 
     * @param jLabel_Filo01 Filósofo
     * @param jLabel_Filo02 Filósofo
     * @param jLabel_Filo03 Filósofo
     * @param jLabel_Filo04 Filósofo
     * @param jLabel_Filo05 Filósofo
     * @param jLabel_Filo06 Filósofo
     * @param jLabel_Filo07 Filósofo
     * @param jLabel_Filo08 Filósofo
     * @param jLabel_Filo09 Filósofo
     * @param jLabel_Filo10 Filósofo
     * @param jLabel_Ten01 Tenedor
     * @param jLabel_Ten02 Tenedor
     * @param jLabel_Ten03 Tenedor
     * @param jLabel_Ten04 Tenedor
     * @param jLabel_Ten05 Tenedor
     * @param jLabel_Ten06 Tenedor
     * @param jLabel_Ten07 Tenedor
     * @param jLabel_Ten08 Tenedor
     * @param jLabel_Ten09 Tenedor
     * @param jLabel_Ten10 Tenedor
     * @param jTextArea_Log Area para el Log
     * @param NoFilosofos Numero de Filosofos
     */
    public Clase10Control(JLabel jLabel_Filo01, JLabel jLabel_Filo02, JLabel jLabel_Filo03, JLabel jLabel_Filo04, JLabel jLabel_Filo05, JLabel jLabel_Filo06, JLabel jLabel_Filo07, JLabel jLabel_Filo08, JLabel jLabel_Filo09, JLabel jLabel_Filo10, 
            JLabel jLabel_Ten01, JLabel jLabel_Ten02, JLabel jLabel_Ten03, JLabel jLabel_Ten04, JLabel jLabel_Ten05, JLabel jLabel_Ten06, JLabel jLabel_Ten07, JLabel jLabel_Ten08, JLabel jLabel_Ten09, JLabel jLabel_Ten10,
            JTextArea jTextArea_Log,
            //JTextField jTextField_Cont01, JTextField jTextField_Cont02, JTextField jTextField_Cont03, JTextField jTextField_Cont04, JTextField jTextField_Cont05,
            String NoFilosofos) {

        
        jLabel_F = new JLabel[Integer.parseInt(NoFilosofos)];
        jLabel_T = new JLabel[Integer.parseInt(NoFilosofos)];
        jTextField_C = new JTextField[Integer.parseInt(NoFilosofos)];
        filoCount = new int[Integer.parseInt(NoFilosofos)];
   
            
        if(NoFilosofos.equals("1"))
        {
            this.jLabel_F[0] = jLabel_Filo01;
            this.jLabel_T[0] = jLabel_Ten01;
            Clase10Control.filoCount[0] = 0;
        }
        else if(NoFilosofos.equals("2"))
        {
            this.jLabel_F[0] = jLabel_Filo01;
            this.jLabel_F[1] = jLabel_Filo02;
            this.jLabel_T[0] = jLabel_Ten01;
            this.jLabel_T[1] = jLabel_Ten02;
            Clase10Control.filoCount[0] = 0;
            Clase10Control.filoCount[1] = 0;
        }
        else if(NoFilosofos.equals("3"))
        {
            this.jLabel_F[0] = jLabel_Filo01;
            this.jLabel_F[1] = jLabel_Filo02;
            this.jLabel_F[2] = jLabel_Filo03;
            this.jLabel_T[0] = jLabel_Ten01;
            this.jLabel_T[1] = jLabel_Ten02;
            this.jLabel_T[2] = jLabel_Ten03;
            Clase10Control.filoCount[0] = 0;
            Clase10Control.filoCount[1] = 0;
            Clase10Control.filoCount[2] = 0;
        }
        else if(NoFilosofos.equals("4"))
        {
            this.jLabel_F[0] = jLabel_Filo01;
            this.jLabel_F[1] = jLabel_Filo02;
            this.jLabel_F[2] = jLabel_Filo03;
            this.jLabel_F[3] = jLabel_Filo04;
            this.jLabel_T[0] = jLabel_Ten01;
            this.jLabel_T[1] = jLabel_Ten02;
            this.jLabel_T[2] = jLabel_Ten03;
            this.jLabel_T[3] = jLabel_Ten04;
            Clase10Control.filoCount[0] = 0;
            Clase10Control.filoCount[1] = 0;
            Clase10Control.filoCount[2] = 0;
            Clase10Control.filoCount[3] = 0;
        }
        else if(NoFilosofos.equals("5"))
        {
            this.jLabel_F[0] = jLabel_Filo01;
            this.jLabel_F[1] = jLabel_Filo02;
            this.jLabel_F[2] = jLabel_Filo03;
            this.jLabel_F[3] = jLabel_Filo04;
            this.jLabel_F[4] = jLabel_Filo05;
            this.jLabel_T[0] = jLabel_Ten01;
            this.jLabel_T[1] = jLabel_Ten02;
            this.jLabel_T[2] = jLabel_Ten03;
            this.jLabel_T[3] = jLabel_Ten04;
            this.jLabel_T[4] = jLabel_Ten05;
            Clase10Control.filoCount[0] = 0;
            Clase10Control.filoCount[1] = 0;
            Clase10Control.filoCount[2] = 0;
            Clase10Control.filoCount[3] = 0;
            Clase10Control.filoCount[4] = 0;
        }
        else if(NoFilosofos.equals("6"))
        {       
            this.jLabel_F[0] = jLabel_Filo01;
            this.jLabel_F[1] = jLabel_Filo02;
            this.jLabel_F[2] = jLabel_Filo03;
            this.jLabel_F[3] = jLabel_Filo04;
            this.jLabel_F[4] = jLabel_Filo05;
            this.jLabel_F[5] = jLabel_Filo06;
            
            this.jLabel_T[0] = jLabel_Ten01;
            this.jLabel_T[1] = jLabel_Ten02;
            this.jLabel_T[2] = jLabel_Ten03;
            this.jLabel_T[3] = jLabel_Ten04;
            this.jLabel_T[4] = jLabel_Ten05;
            this.jLabel_T[5] = jLabel_Ten06;
            
            Clase10Control.filoCount[0] = 0;
            Clase10Control.filoCount[1] = 0;
            Clase10Control.filoCount[2] = 0;
            Clase10Control.filoCount[3] = 0;
            Clase10Control.filoCount[4] = 0;
            Clase10Control.filoCount[5] = 0;
        }
        else if(NoFilosofos.equals("7"))
        {       
            this.jLabel_F[0] = jLabel_Filo01;
            this.jLabel_F[1] = jLabel_Filo02;
            this.jLabel_F[2] = jLabel_Filo03;
            this.jLabel_F[3] = jLabel_Filo04;
            this.jLabel_F[4] = jLabel_Filo05;
            this.jLabel_F[5] = jLabel_Filo06;
            this.jLabel_F[6] = jLabel_Filo07;
            
            this.jLabel_T[0] = jLabel_Ten01;
            this.jLabel_T[1] = jLabel_Ten02;
            this.jLabel_T[2] = jLabel_Ten03;
            this.jLabel_T[3] = jLabel_Ten04;
            this.jLabel_T[4] = jLabel_Ten05;
            this.jLabel_T[5] = jLabel_Ten06;
            this.jLabel_T[6] = jLabel_Ten07;
            
            Clase10Control.filoCount[0] = 0;
            Clase10Control.filoCount[1] = 0;
            Clase10Control.filoCount[2] = 0;
            Clase10Control.filoCount[3] = 0;
            Clase10Control.filoCount[4] = 0;
            Clase10Control.filoCount[5] = 0;
            Clase10Control.filoCount[6] = 0;
        }
        else if(NoFilosofos.equals("8"))
        {       
            this.jLabel_F[0] = jLabel_Filo01;
            this.jLabel_F[1] = jLabel_Filo02;
            this.jLabel_F[2] = jLabel_Filo03;
            this.jLabel_F[3] = jLabel_Filo04;
            this.jLabel_F[4] = jLabel_Filo05;
            this.jLabel_F[5] = jLabel_Filo06;
            this.jLabel_F[6] = jLabel_Filo07;
            this.jLabel_F[7] = jLabel_Filo08;
            
            this.jLabel_T[0] = jLabel_Ten01;
            this.jLabel_T[1] = jLabel_Ten02;
            this.jLabel_T[2] = jLabel_Ten03;
            this.jLabel_T[3] = jLabel_Ten04;
            this.jLabel_T[4] = jLabel_Ten05;
            this.jLabel_T[5] = jLabel_Ten06;
            this.jLabel_T[6] = jLabel_Ten07;
            this.jLabel_T[7] = jLabel_Ten08;
            
            Clase10Control.filoCount[0] = 0;
            Clase10Control.filoCount[1] = 0;
            Clase10Control.filoCount[2] = 0;
            Clase10Control.filoCount[3] = 0;
            Clase10Control.filoCount[4] = 0;
            Clase10Control.filoCount[5] = 0;
            Clase10Control.filoCount[6] = 0;
            Clase10Control.filoCount[7] = 0;
        }
        else if(NoFilosofos.equals("9"))
        {       
            this.jLabel_F[0] = jLabel_Filo01;
            this.jLabel_F[1] = jLabel_Filo02;
            this.jLabel_F[2] = jLabel_Filo03;
            this.jLabel_F[3] = jLabel_Filo04;
            this.jLabel_F[4] = jLabel_Filo05;
            this.jLabel_F[5] = jLabel_Filo06;
            this.jLabel_F[6] = jLabel_Filo07;
            this.jLabel_F[7] = jLabel_Filo08;
            this.jLabel_F[8] = jLabel_Filo09;
            
            this.jLabel_T[0] = jLabel_Ten01;
            this.jLabel_T[1] = jLabel_Ten02;
            this.jLabel_T[2] = jLabel_Ten03;
            this.jLabel_T[3] = jLabel_Ten04;
            this.jLabel_T[4] = jLabel_Ten05;
            this.jLabel_T[5] = jLabel_Ten06;
            this.jLabel_T[6] = jLabel_Ten07;
            this.jLabel_T[7] = jLabel_Ten08;
            this.jLabel_T[8] = jLabel_Ten09;
            
            Clase10Control.filoCount[0] = 0;
            Clase10Control.filoCount[1] = 0;
            Clase10Control.filoCount[2] = 0;
            Clase10Control.filoCount[3] = 0;
            Clase10Control.filoCount[4] = 0;
            Clase10Control.filoCount[5] = 0;
            Clase10Control.filoCount[6] = 0;
            Clase10Control.filoCount[7] = 0;
            Clase10Control.filoCount[8] = 0;
        }
        else if(NoFilosofos.equals("10"))
        {       
            this.jLabel_F[0] = jLabel_Filo01;
            this.jLabel_F[1] = jLabel_Filo02;
            this.jLabel_F[2] = jLabel_Filo03;
            this.jLabel_F[3] = jLabel_Filo04;
            this.jLabel_F[4] = jLabel_Filo05;
            this.jLabel_F[5] = jLabel_Filo06;
            this.jLabel_F[6] = jLabel_Filo07;
            this.jLabel_F[7] = jLabel_Filo08;
            this.jLabel_F[8] = jLabel_Filo09;
            this.jLabel_F[9] = jLabel_Filo10;
            
            this.jLabel_T[0] = jLabel_Ten01;
            this.jLabel_T[1] = jLabel_Ten02;
            this.jLabel_T[2] = jLabel_Ten03;
            this.jLabel_T[3] = jLabel_Ten04;
            this.jLabel_T[4] = jLabel_Ten05;
            this.jLabel_T[5] = jLabel_Ten06;
            this.jLabel_T[6] = jLabel_Ten07;
            this.jLabel_T[7] = jLabel_Ten08;
            this.jLabel_T[8] = jLabel_Ten09;
            this.jLabel_T[9] = jLabel_Ten10;
            
            Clase10Control.filoCount[0] = 0;
            Clase10Control.filoCount[1] = 0;
            Clase10Control.filoCount[2] = 0;
            Clase10Control.filoCount[3] = 0;
            Clase10Control.filoCount[4] = 0;
            Clase10Control.filoCount[5] = 0;
            Clase10Control.filoCount[6] = 0;
            Clase10Control.filoCount[7] = 0;
            Clase10Control.filoCount[8] = 0;
            Clase10Control.filoCount[9] = 0;
        }
        
        this.jTextArea_Log = jTextArea_Log;

        this.NoFilosofos = NoFilosofos;
        
        /*for (int i : filoCount){
            Clase10Control.filoCount[i] = 0;
        }*/

    }

    // Getters: Se establecen los Getters para que puedan ser llamados desde el programa
    public JLabel[] getjLabel_F() {
        return jLabel_F;
    }
    
    public JLabel[] getjLabel_T() {
        return jLabel_T;
    }

    public JTextField[] getjTextField_C() {
        return jTextField_C;
    }

    
    public static JTextArea getjTextArea_Log() {
        return jTextArea_Log;
    }
    
    public String getNoFilosofos() {
        return NoFilosofos;
    }

    // Único Setters
    public static void setjTextArea_Info(String mensaje) {
        Clase10Control.jTextArea_Log.append(mensaje + "\n");
        Clase10Control.jTextArea_Log.setCaretPosition(Clase10Control.jTextArea_Log.getDocument().getLength()); 
    }
    
}
