/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interficies;

import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
/**
 *
 * @author Carlos
 */
public class RenderReservas extends JLabel implements ListCellRenderer {
    static ImageIcon logoCheck = new ImageIcon("check.png");
    static ImageIcon logoNoCheck = new ImageIcon("noCheck.png");
    @Override
    public Component getListCellRendererComponent(JList jlist, Object e, int i,
            boolean isSelected, boolean cellHasFocus) {
        
        JLabel renderer = (JLabel) e;
        renderer.setBackground(isSelected ? jlist.getSelectionBackground()  : jlist.getBackground());
        return renderer;
      
        /*
        String valor = e.toString();
        setText(valor);
        if (valor.contains("No Realitzat")){
            setIcon(logoNoCheck);
        } else setIcon(logoCheck);
        if (isSelected){
            setBackground(jlist.getSelectionBackground());
            setForeground(jlist.getSelectionForeground());
        } else {
            setBackground(jlist.getBackground());
            setForeground(jlist.getForeground());
        }
        setOpaque(true);
        setFont(jlist.getFont());
        return this; */
        
    }
    
}
