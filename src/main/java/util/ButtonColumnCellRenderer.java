/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import static javax.swing.SwingConstants.CENTER;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableColumnModel;

/**
 *
 * @author USER
 */
public class ButtonColumnCellRenderer extends DefaultTableCellRenderer {

    private String buttonType;
    
    public ButtonColumnCellRenderer(String buttonType) {
        this.buttonType = buttonType;
        
    }

    public String getButtonType() {
        return buttonType;
    }

    public void setButtonType(String buttonType) {
        this.buttonType = buttonType;
    }

    public Component getTableCellRendererComponent(JTable table,
            Object Value,
            boolean isSelected,
            boolean hasFocus,
            int row,
            int col) {

        JLabel label = (JLabel) super.getTableCellRendererComponent(table,
                Value,
                isSelected,
                hasFocus,
                row, col);
        label.setHorizontalAlignment(CENTER);
        label.setIcon(new javax.swing.ImageIcon(getClass().
                getResource("/" + buttonType + ".png")));

        return label;

    }
}
