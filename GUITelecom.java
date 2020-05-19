import java.awt.GridLayout;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
/**
 *
 * @author Yair Reyes
 */
public class GUI extends javax.swing.JFrame {

    private DefaultTableModel modelo;
    private boolean plotOK;
    private JFreeChart g;
    
    public GUI() {
        initComponents();
        plotOK = false;
    }
    
    public void restartApplication(){
        plotOK = false;
        nIni.setText("");
        nFin.setText("");
        nValores.setText("");
        try{
        modelo.setRowCount(0);
        }catch(Exception e){
            
        }
        panelG.removeAll();
        panelG.repaint();
    } 
    
    public String convertirBinario(int n){
        if(n>0){
            return String.format("%8s", Integer.toBinaryString(n)).replace(' ', '0');
        }
        return "1" + String.format("%7s", Integer.toBinaryString(n*-1)).replace(' ', '0');
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nIni = new javax.swing.JTextField();
        nFin = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nValores = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        panelG = new javax.swing.JPanel(new GridLayout());
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("REYES HERNANDEZ YAIR HAZAEL");
        setResizable(false);
        setSize(new java.awt.Dimension(858, 550));

        jLabel1.setText("INGRESA EL RANGO ");

        nIni.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nIni.setMaximumSize(new java.awt.Dimension(15, 23));
        nIni.setName(""); // NOI18N
        nIni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nIniActionPerformed(evt);
            }
        });
        nIni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nIniKeyTyped(evt);
            }
        });

        nFin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nFin.setMaximumSize(new java.awt.Dimension(15, 23));
        nFin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nFinKeyTyped(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("INICIO");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("FIN");

        jLabel4.setText("CANTIDAD DE VALORES");

        nValores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nValoresActionPerformed(evt);
            }
        });
        nValores.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nValoresKeyTyped(evt);
            }
        });

        jScrollPane1.setViewportView(table);

        jButton1.setText("GENERAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("INGRESAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelGLayout = new javax.swing.GroupLayout(panelG);
        panelG.setLayout(panelGLayout);
        panelGLayout.setHorizontalGroup(
            panelGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 745, Short.MAX_VALUE)
        );
        panelGLayout.setVerticalGroup(
            panelGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 325, Short.MAX_VALUE)
        );

        jButton3.setText("NUEVO");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 745, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                                    .addComponent(nIni, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                                    .addComponent(nFin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jButton3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(nValores, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)))
                        .addGap(34, 34, 34)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nValores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nFin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(nIni, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                    

    private void nIniActionPerformed(java.awt.event.ActionEvent evt) {                                     
    }                                    

    private void nValoresActionPerformed(java.awt.event.ActionEvent evt) {                                         
    }                                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        //GENERAR ALEATORIOS
        if(!plotOK){
            if(!nValores.getText().trim().isEmpty() && Integer.parseInt(nValores.getText())>0 && !nFin.getText().trim().isEmpty() && !nIni.getText().trim().isEmpty()){
                int nVal = Integer.parseInt(nValores.getText());
                int vI = Integer.parseInt(nIni.getText());
                int vF = Integer.parseInt(nFin.getText());

                modelo = new DefaultTableModel(0,nVal);
                table.setModel(modelo);
                table.getTableHeader().setUI(null);
                table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
                table.setPreferredScrollableViewportSize(Toolkit.getDefaultToolkit().getScreenSize());
                DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
                centerRenderer.setHorizontalAlignment( JLabel.CENTER );
                table.setDefaultRenderer(Object.class, centerRenderer);

                 //table content
                String[] car = new String[nVal];
                String[] bin = new String[nVal];
                int[] cad = new int[nVal];
                String cadBits = "";
                //numeros aleatorios
                int rango = vF - vI + 1;
                for(int i=0;i<nVal;i++){
                    cad[i] = (int)(Math.random() * rango) + vI;
                }

                for(int i=0;i<nVal;i++){
                    car[i] = Integer.toString(cad[i]);
                    bin[i] = convertirBinario(cad[i]);
                }

                modelo.addRow(car);
                modelo.addRow(bin);

                for(int j=0;j<nVal;j++){
                    cadBits += bin[j];
                }
                int j = 0;

                //plot
                XYSeries cadBitsMod = new XYSeries("");
                XYSeriesCollection dA = new XYSeriesCollection();  
                boolean aUno = false;
                for (int i = 0; i < cadBits.length(); i++){
                        if (cadBits.charAt(i) == '1'){
                            if(!aUno){ // no 1 anterior
                                cadBitsMod.add(j, 1);
                                cadBitsMod.add(++j, 1);
                            }else{
                                cadBitsMod.add(j, -1);
                                cadBitsMod.add(++j, -1);
                            }
                          aUno = !aUno;
                        }else{
                            cadBitsMod.add(j, 0);
                            cadBitsMod.add(++j, 0);
                        }
                }

                dA.addSeries(cadBitsMod);
                g = ChartFactory.createXYLineChart("", "", "", dA, PlotOrientation.VERTICAL, true, false, false);    
                ChartPanel gPanel = new ChartPanel(g);
                panelG.setLayout(new GridLayout());
                panelG.add(gPanel);
                panelG.validate();
                panelG.repaint();
                plotOK = true;
            }else{
                JOptionPane.showMessageDialog(null,"Verifica que los campos no esten vacios y tengan valores validos... ","Error",JOptionPane.ERROR_MESSAGE);
            }
        }else{
                JOptionPane.showMessageDialog(null,"Da click en el boton 'NUEVO' para limpiar e ingresar nuevos valores...","Error",JOptionPane.ERROR_MESSAGE);
        }
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if(!plotOK){
            if(!nValores.getText().trim().isEmpty() && Integer.parseInt(nValores.getText())>0 && !nFin.getText().trim().isEmpty() && !nIni.getText().trim().isEmpty()){
                int nVal = Integer.parseInt(nValores.getText());
                int vI = Integer.parseInt(nIni.getText());
                int vF = Integer.parseInt(nFin.getText());
                modelo = new DefaultTableModel(0,nVal);
                table.setModel(modelo);
                table.getTableHeader().setUI(null);
                table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
                table.setPreferredScrollableViewportSize(Toolkit.getDefaultToolkit().getScreenSize());
                DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
                centerRenderer.setHorizontalAlignment( JLabel.CENTER );
                table.setDefaultRenderer(Object.class, centerRenderer);

                 //table content
                String[] car = new String[nVal];
                String[] bin = new String[nVal];
                int[] cad = new int[nVal];
                int aux = 0;
                boolean ok = false;
                int z = 0;

                while(z<nVal){
                    aux = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el elemento " + (z + 1) + ": "));
                    if(aux>=vI && aux<=vF){
                        cad[z++] = aux;
                    }else{
                        JOptionPane.showMessageDialog(null,"El valor ingresado tiene que estar dentro del rango que especificaste...","Error",JOptionPane.ERROR_MESSAGE);
                    }
                }
            
                for(int i=0;i<nVal;i++){
                    car[i] = Integer.toString(cad[i]);
                    bin[i] = convertirBinario(cad[i]);
                }
                modelo.addRow(car);
                modelo.addRow(bin);        

                String cadBits = "";
                for(int j=0;j<nVal;j++){
                    cadBits += bin[j];
                }
                int j = 0;

                //plot
                XYSeries cadBitsMod = new XYSeries("");
                XYSeriesCollection dA = new XYSeriesCollection();  
                boolean aUno = false;
                for (int i = 0; i < cadBits.length(); i++){
                        if (cadBits.charAt(i) == '1'){
                            if(!aUno){
                                cadBitsMod.add(j, 1);
                                cadBitsMod.add(++j, 1);
                            }else{
                                cadBitsMod.add(j, -1);
                                cadBitsMod.add(++j, -1);
                            }
                          aUno = !aUno;
                        }else{
                            cadBitsMod.add(j, 0);
                            cadBitsMod.add(++j, 0);
                        }
                }

                dA.addSeries(cadBitsMod);
                g = ChartFactory.createXYLineChart("", "", "", dA, PlotOrientation.VERTICAL, true, false, false);
                ChartPanel gPanel = new ChartPanel(g);
                panelG.setLayout(new GridLayout());
                panelG.add(gPanel);
                panelG.validate();
                panelG.repaint();
                plotOK = true;
            }else{
                JOptionPane.showMessageDialog(null,"Verifica que el campo tenga valores validos y no este vacio...","Error",JOptionPane.ERROR_MESSAGE);
            }
        }else{
                JOptionPane.showMessageDialog(null,"Da click en el boton 'NUEVO' para limpiar e ingresar nuevos valores...","Error",JOptionPane.ERROR_MESSAGE);
        }
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        restartApplication();
    }                                      
    
    private void nIniKeyTyped(java.awt.event.KeyEvent e) {                                
        char c = e.getKeyChar();
        if(!Character.isDigit(c)) {
            e.consume(); 
        }
    } 

    private void nFinKeyTyped(java.awt.event.KeyEvent e) {                              
        char c = e.getKeyChar();
        if(!Character.isDigit(c)) {
            e.consume();  
        }
    }  

    private void nValoresKeyTyped(java.awt.event.KeyEvent e) {                                  
        char c = e.getKeyChar();
        if(!Character.isDigit(c)) {
            e.consume();  
        }
    }    

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nFin;
    private javax.swing.JTextField nIni;
    private javax.swing.JTextField nValores;
    private javax.swing.JPanel panelG;
    private javax.swing.JTable table;
    // End of variables declaration                   
}
