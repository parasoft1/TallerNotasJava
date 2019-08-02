package main;

import static entidades.Mensajes.*;
import entidades.empleados.NotaEstudiante;

import javax.swing.*;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Main {

    public static void main(String[] args){

        DecimalFormatSymbols simbolo=new DecimalFormatSymbols();

        simbolo.setDecimalSeparator('.');

        DecimalFormat formateador=new DecimalFormat("#.##",simbolo);

        NotaEstudiante notaEstudiante = new NotaEstudiante();

        String nota1= JOptionPane.showInputDialog(null, MENSAJE_NOTA_SEGUIMIENTO.getMensajes());
        String nota2= JOptionPane.showInputDialog(null, MENSAJE_NOTA_PARCIAL.getMensajes());
        String nota3= JOptionPane.showInputDialog(null, MENSAJE_NOTA_FINAL.getMensajes());


        notaEstudiante.setExamenFinal(Double.parseDouble(nota1));
        notaEstudiante.setNotaParcial(Double.parseDouble(nota2));
        notaEstudiante.setNotaSeguimiento(Double.parseDouble(nota3));
        String valor= formateador.format(notaEstudiante.calcularSalario());
        Double val = Double.parseDouble(valor);
        notaEstudiante.setNotaSeguimiento(val);


        if(val>=4.0 && val<=5.0){
            JOptionPane.showMessageDialog(null,MENSAJE_NOTA.getMensajes() + val + "\n" + MENSAJE_PETICION_EXE.getMensajes());
        }
        else  if(val>=3.0 && val<=3.9){
            JOptionPane.showMessageDialog(null, MENSAJE_NOTA.getMensajes() + val + "\n" + MENSAJE_PETICION_BIEN.getMensajes());
        }

        else  if(val>=2.0 && val<=2.9){
            JOptionPane.showMessageDialog(null, MENSAJE_NOTA.getMensajes() + val + "\n" + MENSAJE_PETICION_MAS.getMensajes());
        }

        else  if(val>=1.0 && val<=1.9){
            JOptionPane.showMessageDialog(null, MENSAJE_NOTA.getMensajes() + val+ "\n" + MENSAJE_PETICION_MIN.getMensajes());
        }

        else  if(val>=0.0 && val<=0.9){
            JOptionPane.showMessageDialog(null, MENSAJE_NOTA.getMensajes() + val + "\n" + MENSAJE_PETICION_DED.getMensajes());
        }


    }


}
