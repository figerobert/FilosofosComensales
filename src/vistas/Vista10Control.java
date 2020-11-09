
package vistas;

import filosofos.Filosofo;
import java.awt.Color;
import static java.lang.Thread.sleep;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import logica.Principal;

/**
 * Esta clase contiene la interface gráfica de la aplicación
 * Hereda de {@link Vista00Generica}
 * Contiene todos los elementos gráficos del programa y los botones
 * que ejecutan el programa.
 * 
 * @author José Francisco Sánchez Portillo
 */
public class Vista10Control extends Vista00Generica {

    /**
     * Creates new form Vista10Control
     */
    public Vista10Control() {
        super("La Cena de los Filósofos", "icono.png");
        initComponents();
        
        //Numero de filosofos
        this.jTxtNoFilosofos.setText("");
        this.jTxtNoFilosofos.requestFocus();
        
        //Botón Finalizar:
        this.jButton_Finalizar.setEnabled(false);
        
        // Campo de Log y de Info:
        this.jTextArea_Log.setText(
                 "\n\n UNIVERSIDAD MARIANO GALVEZ DE GUATEMALA"
                + "\n Facultad de Ingenieria en sistemas e Información"
                + "\n Desarollado por Carlos Roberto Macario Ramirez"
                + "\n Carnet: 0910-10-13238"
                + "\n\n\n Pulsa en Iniciar o si quieres antes puedes Crear un log\n\n\n");
    
         
        
        // Filósofos Configuración inicial:
        this.jLabel_Filo01.setOpaque(true);
        this.jLabel_Filo01.setBackground(Color.WHITE);
        this.jLabel_Filo02.setOpaque(true);
        this.jLabel_Filo02.setBackground(Color.WHITE);
        this.jLabel_Filo03.setOpaque(true);
        this.jLabel_Filo03.setBackground(Color.WHITE);
        this.jLabel_Filo04.setOpaque(true);
        this.jLabel_Filo04.setBackground(Color.WHITE);
        this.jLabel_Filo05.setOpaque(true);
        this.jLabel_Filo05.setBackground(Color.WHITE);
        this.jLabel_Filo06.setOpaque(true);
        this.jLabel_Filo06.setBackground(Color.WHITE);
        this.jLabel_Filo07.setOpaque(true);
        this.jLabel_Filo07.setBackground(Color.WHITE);
        this.jLabel_Filo08.setOpaque(true);
        this.jLabel_Filo08.setBackground(Color.WHITE);
        this.jLabel_Filo09.setOpaque(true);
        this.jLabel_Filo09.setBackground(Color.WHITE);
        this.jLabel_Filo10.setOpaque(true);
        this.jLabel_Filo10.setBackground(Color.WHITE);
        
        // Tenedores Configuración inicial:
        this.jLabel_Ten01.setText("  1  ");
        this.jLabel_Ten01.setOpaque(true);
        this.jLabel_Ten01.setBackground(Color.LIGHT_GRAY);
        this.jLabel_Ten01.setForeground(Color.WHITE);
        
        this.jLabel_Ten02.setText("  2  ");
        this.jLabel_Ten02.setOpaque(true);
        this.jLabel_Ten02.setBackground(Color.LIGHT_GRAY);
        this.jLabel_Ten02.setForeground(Color.WHITE);
        
        this.jLabel_Ten03.setText("  3  ");
        this.jLabel_Ten03.setOpaque(true);
        this.jLabel_Ten03.setBackground(Color.LIGHT_GRAY);
        this.jLabel_Ten03.setForeground(Color.WHITE);
        
        this.jLabel_Ten04.setText("  4  ");
        this.jLabel_Ten04.setOpaque(true);
        this.jLabel_Ten04.setBackground(Color.LIGHT_GRAY);
        this.jLabel_Ten04.setForeground(Color.WHITE);
        
        this.jLabel_Ten05.setText("  5  ");
        this.jLabel_Ten05.setOpaque(true);
        this.jLabel_Ten05.setBackground(Color.LIGHT_GRAY);
        this.jLabel_Ten05.setForeground(Color.WHITE);
        
        this.jLabel_Ten06.setText("  6  ");
        this.jLabel_Ten06.setOpaque(true);
        this.jLabel_Ten06.setBackground(Color.LIGHT_GRAY);
        this.jLabel_Ten06.setForeground(Color.WHITE);
        
        this.jLabel_Ten07.setText("  7  ");
        this.jLabel_Ten07.setOpaque(true);
        this.jLabel_Ten07.setBackground(Color.LIGHT_GRAY);
        this.jLabel_Ten07.setForeground(Color.WHITE);
        
        this.jLabel_Ten08.setText("  8  ");
        this.jLabel_Ten08.setOpaque(true);
        this.jLabel_Ten08.setBackground(Color.LIGHT_GRAY);
        this.jLabel_Ten08.setForeground(Color.WHITE);
        
        this.jLabel_Ten09.setText("  9  ");
        this.jLabel_Ten09.setOpaque(true);
        this.jLabel_Ten09.setBackground(Color.LIGHT_GRAY);
        this.jLabel_Ten09.setForeground(Color.WHITE);
        
        this.jLabel_Ten10.setText("  10  ");
        this.jLabel_Ten10.setOpaque(true);
        this.jLabel_Ten10.setBackground(Color.LIGHT_GRAY);
        this.jLabel_Ten10.setForeground(Color.WHITE);
        
        // Leyenda de colores:
        this.jLabel_est01.setText("    ");
        this.jLabel_est01.setOpaque(true);
        this.jLabel_est01.setBackground(Color.PINK);
        
        this.jLabel_est02.setText("    ");
        this.jLabel_est02.setOpaque(true);
        this.jLabel_est02.setBackground(Color.CYAN);
        
        this.jLabel_est03.setText("    ");
        this.jLabel_est03.setOpaque(true);
        this.jLabel_est03.setBackground(Color.ORANGE);
        
        this.jLabel_est04.setText("    ");
        this.jLabel_est04.setOpaque(true);
        this.jLabel_est04.setBackground(Color.WHITE);
        
        this.jLabel_est05.setText("    ");
        this.jLabel_est05.setOpaque(true);
        this.jLabel_est05.setBackground(Color.BLUE);
        
        this.jLabel_est06.setText("    ");
        this.jLabel_est06.setOpaque(true);
        this.jLabel_est06.setBackground(Color.LIGHT_GRAY);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel_Filo01 = new javax.swing.JLabel();
        jLabel_Filo02 = new javax.swing.JLabel();
        jLabel_Filo03 = new javax.swing.JLabel();
        jLabel_Filo04 = new javax.swing.JLabel();
        jLabel_Filo05 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel_est01 = new javax.swing.JLabel();
        jLabel_est02 = new javax.swing.JLabel();
        jLabel_est03 = new javax.swing.JLabel();
        jLabel_est05 = new javax.swing.JLabel();
        jLabel_est06 = new javax.swing.JLabel();
        jLabel_est04 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jlblNoFilosofos = new javax.swing.JLabel();
        jTxtNoFilosofos = new javax.swing.JTextField();
        jLabel_Ten01 = new javax.swing.JLabel();
        jLabel_Ten02 = new javax.swing.JLabel();
        jLabel_Ten03 = new javax.swing.JLabel();
        jLabel_Ten04 = new javax.swing.JLabel();
        jLabel_Ten05 = new javax.swing.JLabel();
        jLabel_Ten06 = new javax.swing.JLabel();
        jLabel_Filo06 = new javax.swing.JLabel();
        jLabel_Ten07 = new javax.swing.JLabel();
        jLabel_Filo07 = new javax.swing.JLabel();
        jLabel_Ten08 = new javax.swing.JLabel();
        jLabel_Filo08 = new javax.swing.JLabel();
        jLabel_Ten09 = new javax.swing.JLabel();
        jLabel_Filo09 = new javax.swing.JLabel();
        jLabel_Ten10 = new javax.swing.JLabel();
        jLabel_Filo10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton_Iniciar = new javax.swing.JButton();
        jButton_Finalizar = new javax.swing.JButton();
        jCheckBox_Log = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jButton_Reset = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_Log = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 700));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(" La Cena de los Filósofos "));

        jLabel_Filo01.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_Filo01.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Filo01.setText("Filósofo 01");

        jLabel_Filo02.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_Filo02.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Filo02.setText("Filósofo 02");

        jLabel_Filo03.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_Filo03.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Filo03.setText("Filósofo 03");

        jLabel_Filo04.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_Filo04.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Filo04.setText("Filósofo 04");

        jLabel_Filo05.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_Filo05.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Filo05.setText("Filósofo 05");

        jLabel_est01.setText("jLabel1");

        jLabel_est02.setText("jLabel1");

        jLabel_est03.setText("jLabel1");

        jLabel_est05.setText("jLabel1");

        jLabel_est06.setText("jLabel1");

        jLabel_est04.setText("jLabel1");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 2, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_est01, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel_est02, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_est03)
                            .addComponent(jLabel_est05)
                            .addComponent(jLabel_est06)
                            .addComponent(jLabel_est04))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_est01, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_est02, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_est03, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_est04, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jLabel_est05, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_est06, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel6.setText("Filósofo entra a comer");

        jLabel7.setText("Filósofo tiene un tenedor");

        jLabel8.setText("Filósofo está comiendo");

        jLabel9.setText("Tenedor ocupado");

        jLabel10.setText("Tenedor libre");

        jLabel12.setText("Filósofo está pensando");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Código de colores:");

        jlblNoFilosofos.setText("No. Filosofos");

        jTxtNoFilosofos.setName(""); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jlblNoFilosofos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtNoFilosofos, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtNoFilosofos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblNoFilosofos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        jLabel_Ten01.setText("jLabel1");

        jLabel_Ten02.setText("jLabel2");

        jLabel_Ten03.setText("jLabel3");

        jLabel_Ten04.setText("jLabel4");

        jLabel_Ten05.setText("jLabel5");

        jLabel_Ten06.setText("jLabel6");

        jLabel_Filo06.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_Filo06.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Filo06.setText("Filósofo 06");

        jLabel_Ten07.setText("jLabel7");

        jLabel_Filo07.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_Filo07.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Filo07.setText("Filósofo 07");

        jLabel_Ten08.setText("jLabel8");

        jLabel_Filo08.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_Filo08.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Filo08.setText("Filósofo 08");

        jLabel_Ten09.setText("jLabel9");

        jLabel_Filo09.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_Filo09.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Filo09.setText("Filósofo 09");

        jLabel_Ten10.setText("jLabel10");

        jLabel_Filo10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_Filo10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Filo10.setText("Filósofo 06");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(157, 157, 157)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_Filo02, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_Ten02)
                                    .addComponent(jLabel_Ten03)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel_Filo06, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_Filo01, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel_Ten07)
                            .addComponent(jLabel_Filo07, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Ten08)
                            .addComponent(jLabel_Filo08, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Ten09)
                            .addComponent(jLabel_Filo09, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Ten10)
                            .addComponent(jLabel_Filo10, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Ten01))
                        .addGap(120, 120, 120)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_Filo03, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Ten04)
                            .addComponent(jLabel_Filo04, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Ten05)
                            .addComponent(jLabel_Filo05, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Ten06))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_Ten01)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_Filo10))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel_Ten02)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_Filo02)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_Ten03)
                            .addComponent(jLabel_Ten10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_Filo03)
                            .addComponent(jLabel_Filo09))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_Ten04)
                            .addComponent(jLabel_Ten09))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_Filo04)
                            .addComponent(jLabel_Filo08))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_Ten05)
                            .addComponent(jLabel_Ten08)))
                    .addComponent(jLabel_Filo01))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Filo05, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Filo07))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Ten06)
                    .addComponent(jLabel_Ten07))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_Filo06)
                .addGap(29, 29, 29))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(" Controles "));

        jButton_Iniciar.setText("Iniciar");
        jButton_Iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_IniciarActionPerformed(evt);
            }
        });

        jButton_Finalizar.setText("Pausar");
        jButton_Finalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_FinalizarActionPerformed(evt);
            }
        });

        jCheckBox_Log.setText("Crear un  log");
        jCheckBox_Log.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox_LogItemStateChanged(evt);
            }
        });

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton_Reset.setText("Reset");
        jButton_Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox_Log)
                .addGap(86, 86, 86)
                .addComponent(jButton_Iniciar)
                .addGap(18, 18, 18)
                .addComponent(jButton_Finalizar)
                .addGap(66, 66, 66)
                .addComponent(jButton_Reset)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Iniciar)
                    .addComponent(jButton_Finalizar)
                    .addComponent(jCheckBox_Log)
                    .addComponent(jButton_Reset)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(" Log "));

        jTextArea_Log.setColumns(20);
        jTextArea_Log.setRows(5);
        jScrollPane1.setViewportView(jTextArea_Log);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Dispara la ejecución del programa
     * @param evt Recibe el evento de hacer click sobre el botón
     */
    private void jButton_IniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_IniciarActionPerformed
        String NoFilosofos;
        NoFilosofos = this.jTxtNoFilosofos.getText();
        
        if(NoFilosofos.equals(""))
            JOptionPane.showMessageDialog(null, "Debe ingresar No. Filosofos");
        else if(Integer.parseInt(NoFilosofos) > 10)
            JOptionPane.showMessageDialog(null, "Solo se permiten 10 filosofos");
        else if(Integer.parseInt(NoFilosofos) < 2)
            JOptionPane.showMessageDialog(null, "Minimo de filososfos permitidos 2");
        else
        {
            Filosofo.finalizado = false; // Para poder pausar o reiniciar.
        
            // Para que no cree un Log si el Checkbox no está selecionado:
            if (!jCheckBox_Log.isSelected()) jTextArea_Log = null;
        
        
            // Clase que contiene todos los objetos de la interface y que sera pasada por parámetro a la clase principal
            Clase10Control clase10Control = new Clase10Control(jLabel_Filo01, jLabel_Filo02, jLabel_Filo03, jLabel_Filo04, jLabel_Filo05, jLabel_Filo06, jLabel_Filo07, jLabel_Filo08, jLabel_Filo09, jLabel_Filo10,            
                jLabel_Ten01, jLabel_Ten02, jLabel_Ten03, jLabel_Ten04, jLabel_Ten05, jLabel_Ten06, jLabel_Ten07, jLabel_Ten08, jLabel_Ten09, jLabel_Ten10,
                jTextArea_Log, 
                //jTextField_Cont01, jTextField_Cont02, jTextField_Cont03, jTextField_Cont04, jTextField_Cont05,    
                NoFilosofos); 
        
   
            // Clase Principal con la lógica del programa:
            // Recibe por parámetro la clase Clase10Control que contiene todos los elemntos de la interface
            Principal principal = new Principal(clase10Control);
        
            this.jButton_Finalizar.setEnabled(true);
            this.jButton_Iniciar.setEnabled(false);
            this.jCheckBox_Log.setEnabled(false);
        }
    }//GEN-LAST:event_jButton_IniciarActionPerformed
    /**
     * Dispara la pausa de la ejecución
     * @param evt Recibe el evento de hacer click sobre el botón
     */
    private void jButton_FinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_FinalizarActionPerformed
        Filosofo.finalizado = true;
        try {
            sleep(5000);
        } catch (InterruptedException ex) {
            System.out.println("Error. Descripción: " + ex.toString());
        }
        this.jButton_Iniciar.setEnabled(true);
        this.jButton_Finalizar.setEnabled(false);
    }//GEN-LAST:event_jButton_FinalizarActionPerformed

    private void jCheckBox_LogItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox_LogItemStateChanged
        if (jCheckBox_Log.isSelected()) {
            this.jTextArea_Log.setText("");
            this.jTextArea_Log.append("\n\nAtención:"
                    + "\n Acabas de seleccionar crear un log en esta pantalla. "
                    + "\n Se escribiara cada uno de los proceso realizado por cada comensal"
                    + "\n\n Pulsa en Iniciar\n\n\n");
            this.jTextArea_Log.setCaretPosition(this.jTextArea_Log.getDocument().getLength());
        }
        if (!jCheckBox_Log.isSelected()) {
            this.jTextArea_Log.setText("");
            this.jTextArea_Log.append("\n\n Atención:"
                    + "\n Acabas de deseleccionar crear un log en esta pantalla. "
                    + "\n No podras visualizar cada uno de los procesos realizados por cada comenzal"
                    + "\n\n Pulsa en Iniciar");
            this.jTextArea_Log.setCaretPosition(this.jTextArea_Log.getDocument().getLength());
        }
    }//GEN-LAST:event_jCheckBox_LogItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton_ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ResetActionPerformed
        Filosofo.finalizado = true;
        try {
            sleep(2000);
        } catch (InterruptedException ex) {
            System.out.println("Error. Descripción: " + ex.toString());
        }
        this.dispose();
        JFrame v10control=new Vista10Control();
    }//GEN-LAST:event_jButton_ResetActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_Finalizar;
    private javax.swing.JButton jButton_Iniciar;
    private javax.swing.JButton jButton_Reset;
    private javax.swing.JCheckBox jCheckBox_Log;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_Filo01;
    private javax.swing.JLabel jLabel_Filo02;
    private javax.swing.JLabel jLabel_Filo03;
    private javax.swing.JLabel jLabel_Filo04;
    private javax.swing.JLabel jLabel_Filo05;
    private javax.swing.JLabel jLabel_Filo06;
    private javax.swing.JLabel jLabel_Filo07;
    private javax.swing.JLabel jLabel_Filo08;
    private javax.swing.JLabel jLabel_Filo09;
    private javax.swing.JLabel jLabel_Filo10;
    private javax.swing.JLabel jLabel_Ten01;
    private javax.swing.JLabel jLabel_Ten02;
    private javax.swing.JLabel jLabel_Ten03;
    private javax.swing.JLabel jLabel_Ten04;
    private javax.swing.JLabel jLabel_Ten05;
    private javax.swing.JLabel jLabel_Ten06;
    private javax.swing.JLabel jLabel_Ten07;
    private javax.swing.JLabel jLabel_Ten08;
    private javax.swing.JLabel jLabel_Ten09;
    private javax.swing.JLabel jLabel_Ten10;
    private javax.swing.JLabel jLabel_est01;
    private javax.swing.JLabel jLabel_est02;
    private javax.swing.JLabel jLabel_est03;
    private javax.swing.JLabel jLabel_est04;
    private javax.swing.JLabel jLabel_est05;
    private javax.swing.JLabel jLabel_est06;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea_Log;
    private javax.swing.JTextField jTxtNoFilosofos;
    private javax.swing.JLabel jlblNoFilosofos;
    // End of variables declaration//GEN-END:variables
}
