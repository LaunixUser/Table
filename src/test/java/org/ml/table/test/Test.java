/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ml.table.test;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.ml.table.Cell;
import org.ml.table.Table;
import org.ml.table.output.impl.ExcelWriter;

/**
 *
 * @author osboxes
 */
public class Test {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        Table table = new Table();
        table.setCell(new Cell(2,3).setContent("name"), 0, 0);
        table.setCell(new Cell(3,5).setContent("address"), 2, 1);
        
        
        String fileName = "test.xlsx";
        ExcelWriter excelWriter = new ExcelWriter();
        try {
            excelWriter.write(table, fileName);
        } catch (Exception ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
