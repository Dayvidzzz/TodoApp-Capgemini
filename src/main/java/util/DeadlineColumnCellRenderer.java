/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author USER
 */
public class DeadlineColumnCellRenderer extends DefaultTableCellRenderer {
    
 @Override 
 public Component getTableCellRendererComponent (JTable table,
         Object Value,
         boolean isSelected,
         boolean hasFocus,
         int row,
         int col ) {
     
     JLabel label = (JLabel) super.getTableCellRendererComponent
        (table, Value, isSelected, hasFocus, row, col);
     
     
  
     label.setHorizontalAlignment(CENTER);
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     return null;
     
     
 }
    
    
    

}
