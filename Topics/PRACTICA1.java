

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author gurren-lagann
 */
public class PRACTICA1 extends JFrame implements ActionListener{
        private JLabel titulo;
        private JLabel edadE;
        private JTextField edadB;
        private JLabel imcE;
        private JLabel est;
        private JTextField estB;
        private JLabel peso;
        private JTextField pesoB;
        private JButton calcularIMC;
        private JLabel IMC;
        private JLabel arrow;
        private JLabel arrow2;
        private JLabel estadoIMC;
        private JLabel calCintura;
        private JLabel cinturaE;
        private JTextField cinturaB;
        private JLabel caderaE;
        private JTextField caderaB;
        private JLabel sexo;
        private JRadioButton hombre;
        private JRadioButton mujer;
        private JButton calcularICC;
        private JLabel riesgoICC;
        private JLabel ICC;
        private JLabel estadoICC;
        private JButton borrar;
        private ButtonGroup sexos;
        private JLabel img;
       
        
                
        public PRACTICA1(){
            setTitle("IMC-ICC");
            setSize(340,550);
            setLayout(new FlowLayout());
            String PATH = "IMG/imagen.png";
            URL url = this.getClass().getResource(PATH);            
            ImageIcon icon = new ImageIcon(url);
            
            titulo = new JLabel("INDICADORES BASICOS DE RIESGOS A LA SALUD");
            img = new JLabel(icon);
            edadE = new JLabel("Proporciona tu edad(>19): ");
            edadB = new JTextField(4);
            imcE = new JLabel("CALCULO DEL INDICE DE MASA CORPORAL (IMC)");
            est = new JLabel("Estatura(cms): ");
            estB = new JTextField(4);
            peso = new JLabel("Peso (kgs): ");
            pesoB = new JTextField(4);
            calcularIMC = new JButton("Calcular IMC");
            IMC = new JLabel("0.00");
            arrow = new JLabel("->");
            arrow2 = new JLabel("->");
            estadoIMC = new JLabel("DESCONOCIDO");
            calCintura = new JLabel("CALCULO DEL INDICE DE CINTURA - CADERA (I-C-C)");
            cinturaE = new JLabel("Cintura(cms): ");
            cinturaB = new JTextField(4);
            caderaE = new JLabel("Cadera(cms): ");
            caderaB = new JTextField(4);
            sexo = new JLabel("Sexo: ");
            sexos = new ButtonGroup();
            hombre = new JRadioButton("Hombre");
            mujer = new JRadioButton("Mujer");
            sexos.add(hombre);
            sexos.add(mujer);
            calcularICC = new JButton("Calcular ICC");
            ICC = new JLabel("0.00");
            riesgoICC = new JLabel("Riesgo cardiovascular: ");
            estadoICC = new JLabel("DESCONOCIDO");
            borrar = new JButton("Borrar Datos");
            
            
            add(titulo);
            add(img);
            add(edadE);
            add(edadB);
            add(imcE);
            add(est);
            add(estB);
            add(peso);
            add(pesoB); 
            add(calcularIMC);
            add(IMC);
            add(arrow2);
            add(estadoIMC);
            add(calCintura);
            add(cinturaE);
            add(cinturaB);
            add(caderaE);
            add(caderaB);
            add(sexo);
            sexos.add(hombre);
            sexos.add(mujer);
            add(hombre);
            add(mujer);
            add(calcularICC);
            add(ICC);
            add(arrow);
            add(riesgoICC);
            add(estadoICC);
            add(borrar);
            
            calcularIMC.addActionListener(this);
            hombre.setActionCommand("hombre");
            mujer.setActionCommand("mujer");
            calcularICC.addActionListener(this);
            hombre.addActionListener(this);
            mujer.addActionListener(this);
            borrar.addActionListener(this);
            
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        }

    @Override
    public void actionPerformed(ActionEvent v) {
        Object productor = v.getSource();
        
        
        if(productor==calcularIMC){
            try{
                int edad = Integer.parseInt(edadB.getText());
                double estatura = Double.parseDouble(estB.getText())/100;
                double peso = Double.parseDouble(pesoB.getText());        
                
                if(edad<=19){
                    JOptionPane.showMessageDialog(this,"Tienes que tener más de 19 años, por favor, intente de nuevo","ERROR",JOptionPane.ERROR_MESSAGE);
                    edadB.setText("");
                }else{
                    double rIMC = peso/(estatura*estatura);
                    IMC.setText(String.valueOf(rIMC).format("%.2f",rIMC));
                   // double cIMC = Math.round(rIMC * 100.0) / 100.0;
                    //System.out.println(cIMC);
                    
                    if(rIMC<18.5){
                        estadoIMC.setText("PESO BAJO");
                    }else if(rIMC>=18.50 && rIMC<=24.99){
                        estadoIMC.setText("PESO NORMAL");
                    }else if(rIMC>=25.00 && rIMC<=29.99){
                        estadoIMC.setText("SOBREPESO");
                    }else if(rIMC>=30.00 && rIMC<=34.99){
                        estadoIMC.setText("OBESIDAD 1");
                    }else if(rIMC>=35.00 && rIMC<=40.00){
                        estadoIMC.setText("OBESIDA 2");
                    }else{
                        estadoIMC.setText("ERROR");
                        JOptionPane.showMessageDialog(this,"Verifica tus datos","ERROR",JOptionPane.ERROR_MESSAGE); 

                    }
                        
                }
                
            }catch(NumberFormatException e){
              JOptionPane.showMessageDialog(this,"Ingresa solo NUMEROS, por favor, intente de nuevo","ERROR",JOptionPane.ERROR_MESSAGE); 
              edadB.setText("");
              estB.setText("");
              pesoB.setText("");
            }
        }//fin IF CALCULAR IMC 
        
        
        else if(productor==calcularICC){
            try{
                int cintura = Integer.parseInt(cinturaB.getText());
                int cadera = Integer.parseInt(caderaB.getText());
                double rICC = (double) cintura / (double) cadera;
                ICC.setText(String.valueOf(rICC).format("%.2f",rICC));
                 
                if(sexos.getSelection().getActionCommand().equals("hombre")){
                    if(rICC<0.95){
                        estadoICC.setText("BAJO");
                    }else if(rICC>=0.96 && rICC<1){
                        estadoICC.setText("MEDIO");
                    }else if(rICC>=1){
                        estadoICC.setText("ALTO");
                    }else{
                        estadoIMC.setText("ERROR");
                        JOptionPane.showMessageDialog(this,"Verifica tus datos","ERROR",JOptionPane.ERROR_MESSAGE); 

                    } 
                 //Hombres
                }else{
                    
                    if(rICC<0.80){
                        estadoICC.setText("BAJO");
                    }else if(rICC>=0.81 && rICC<=0.84){
                        estadoICC.setText("MEDIO");
                    }else if(rICC>=0.85){
                        estadoICC.setText("ALTO");
                    }else{
                        estadoIMC.setText("ERROR");
                        JOptionPane.showMessageDialog(this,"Verifica tus datos","ERROR",JOptionPane.ERROR_MESSAGE); 

                    } 
                    
                    //MUJERES
                }
                
                
            }catch(NumberFormatException e){
              JOptionPane.showMessageDialog(this,"Ingresa solo NUMEROS, por favor, intente de nuevo","ERROR",JOptionPane.ERROR_MESSAGE); 

            }
        }//fin IF CALCULAR ICC
        
        else if(productor==borrar){
            edadB.setText("");
            estB.setText("");
            pesoB.setText("");
            cinturaB.setText("");
            caderaB.setText("");
            sexos.clearSelection();
            IMC.setText("0.00");
            estadoIMC.setText("DESCONOCIDO");
            ICC.setText("0.00");
            estadoICC.setText("DESCONOCIDO");
        }

    }
    
}
