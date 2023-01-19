package editor.de.textos;

import java.awt.Color;
import java.awt.FileDialog;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author Said Isaac León Lara 3AVPRO
 */
public class Formulario extends javax.swing.JFrame {


    public Formulario() {
        initComponents();
        color();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaTexto = new javax.swing.JTextArea();
        jButtonGuardar = new javax.swing.JButton();
        jButtonCargar = new javax.swing.JButton();
        jButtonCrear = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        color = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        colorTexto = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextAreaTexto.setColumns(20);
        jTextAreaTexto.setRows(5);
        jScrollPane1.setViewportView(jTextAreaTexto);

        jButtonGuardar.setBackground(new java.awt.Color(204, 255, 204));
        jButtonGuardar.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        jButtonCargar.setBackground(new java.awt.Color(255, 204, 153));
        jButtonCargar.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jButtonCargar.setText("Cargar Archivo");
        jButtonCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCargarActionPerformed(evt);
            }
        });

        jButtonCrear.setBackground(new java.awt.Color(153, 153, 255));
        jButtonCrear.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jButtonCrear.setText("Crear Nuevo");
        jButtonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearActionPerformed(evt);
            }
        });

        jButtonSalir.setBackground(new java.awt.Color(255, 102, 102));
        jButtonSalir.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel1.setText("Editor de Achivos de Texto");

        color.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Blanco", "Azul", "Amarillo", "Rojo", "Gris", "Verde", "Negro" }));
        color.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel2.setText("Color del Fondo");

        colorTexto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Blanco", "Azul", "Amarillo", "Rojo", "Gris ", "Verde", "Negro" }));
        colorTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorTextoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel3.setText("Color del Texto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 709, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jButtonGuardar)
                        .addGap(86, 86, 86)
                        .addComponent(jButtonCargar)
                        .addGap(98, 98, 98)
                        .addComponent(jButtonCrear)
                        .addGap(99, 99, 99)
                        .addComponent(jButtonSalir))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addComponent(jLabel1)))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel2)
                .addGap(47, 47, 47)
                .addComponent(color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(75, 75, 75)
                .addComponent(colorTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGuardar)
                    .addComponent(jButtonCargar)
                    .addComponent(jButtonCrear)
                    .addComponent(jButtonSalir))
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(colorTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {                                               
         guardar();//usando el metodo guardar
    }                                              

    private void jButtonCargarActionPerformed(java.awt.event.ActionEvent evt) {                                              
        abreArchivo();//el boton cargar usa dos metodos
        preparaDatos();
    }                                             

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {                                             
        System.exit(0);//salida del sistema 
    }                                            

    private void jButtonCrearActionPerformed(java.awt.event.ActionEvent evt) {                                             
      crear();//usa el metodo crear
    }                                            

    private void colorActionPerformed(java.awt.event.ActionEvent evt) {                                      
        color();//cambia el color del fondo
    }                                     

    private void colorTextoActionPerformed(java.awt.event.ActionEvent evt) {                                           
        colorTexto();//cambia el color del texto
    }                                          

   
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario().setVisible(true);
            }
        });
    }

     public void preparaDatos(){
        
       FileReader leer;
       String cadena;
       String cadenaSalida="";
       miArchivo = new File(nombreArchivo);
        try {
            leer = new FileReader(miArchivo);
            BufferedReader almacenamiento = new BufferedReader(leer);
            cadena ="";
            while(cadena!=null){
                try {
                    cadena=almacenamiento.readLine();
                    if(cadena!=null){
                        cadenaSalida=cadenaSalida+cadena+"\n";
                    }
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Error "+ex);
                }
            }
           try {
               almacenamiento.close();
               leer.close();
           } catch (IOException ex) {
               JOptionPane.showMessageDialog(null, "Error "+ex);
           }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "no se encontro el archivo "+ex);
        }
        jTextAreaTexto.setText(cadenaSalida);
    }
    
    
    
    
    public void guardar(){
        PrintWriter escribir;
       
            try {
  
                escribir = new PrintWriter(miArchivo,"utf-8");
                escribir.println(jTextAreaTexto.getText());
                escribir.close();
            } catch (Exception ex) {
              JOptionPane.showMessageDialog(null, "Error "+ex);  
            } 
           
    }
    
    public void abreArchivo(){
        FileDialog dialogoArchivo= new FileDialog(this, "lista de archivos", FileDialog.LOAD);
        dialogoArchivo.setVisible(true);
        if(dialogoArchivo.getFile()!=null){
            String directorio= dialogoArchivo.getDirectory();
            String archivo= dialogoArchivo.getFile();
            System.out.println(directorio+archivo);
            nombreArchivo=directorio+archivo;
        }else
            System.exit(0);
    }
     
    public void crear(){
        String nombreArchivo=JOptionPane.showInputDialog(null, "Escribe el nombre de tu archivo");
        miArchivo = new File(nombreArchivo + " .txt");
        if (!miArchivo.exists()){
            try {
                  miArchivo.createNewFile();
                   jTextAreaTexto.setText("");
            } catch (Exception e) {
            }
        }
        else {
            System.out.println("El archivo ya existe");
           
        }
    }
    
        public void color(){
             String eleccion = (String)color.getSelectedItem();
                if(eleccion.equals("Blanco")){
                    jTextAreaTexto.setBackground(Color.WHITE);
                }
                else if (eleccion.equals("Azul")){
                    jTextAreaTexto.setBackground(Color.BLUE);
                }
                else if (eleccion.equals("Amarillo")){
                    jTextAreaTexto.setBackground(Color.yellow);
                }
                else if (eleccion.equals("Rojo")){
                    jTextAreaTexto.setBackground(Color.RED);
                }
                else if (eleccion.equals("Gris")){
                    jTextAreaTexto.setBackground(Color.gray);
                }
                 else if (eleccion.equals("Verde")){
                    jTextAreaTexto.setBackground(Color.GREEN);
                }
                 else if (eleccion.equals("Negro")){
                    jTextAreaTexto.setBackground(Color.BLACK);
                        }
        }
        
        public void colorTexto(){
           
             String eleccion = (String)colorTexto.getSelectedItem();
             if(eleccion.equals("Blanco")){
               jTextAreaTexto.setForeground(Color.WHITE);
             }
            else if (eleccion.equals("Azul")){
                jTextAreaTexto.setForeground(Color.BLUE);
                        }
             else if (eleccion.equals("Amarillo")){
                jTextAreaTexto.setForeground(Color.YELLOW);
                        }
             else if (eleccion.equals("Rojo")){
                jTextAreaTexto.setForeground(Color.RED);
                        }
             else if (eleccion.equals("Gris")){
                jTextAreaTexto.setForeground(Color.GRAY);
                        }
             else if (eleccion.equals("Verde")){
                jTextAreaTexto.setForeground(Color.GREEN);
                        }
             else if (eleccion.equals("Negro")){
                jTextAreaTexto.setForeground(Color.BLACK);
                        }
        }
        

        //variables globales
    File miArchivo;
    String nombreArchivo="";
    // Variables declaration - do not modify                     
    private javax.swing.JComboBox<String> color;
    private javax.swing.JComboBox<String> colorTexto;
    private javax.swing.JButton jButtonCargar;
    private javax.swing.JButton jButtonCrear;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaTexto;
    // End of variables declaration                   
}
