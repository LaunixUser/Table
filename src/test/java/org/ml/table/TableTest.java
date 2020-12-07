/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ml.table;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;

/**
 *
 * @author osboxes
 */
public class TableTest {

    public TableTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of isEmpty method, of class Table.
     */
    @org.junit.jupiter.api.Test
    public void testIsEmpty() {

        Table instance = new Table();
        boolean expResult = false;
        boolean result = instance.isEmpty();

        System.out.println("Test1");

        assertEquals(true, result);

        System.out.println("Test2");
        instance.setCell(new Cell(), 1, 2);
        assertEquals(false, instance.isEmpty());

    }

    /**
     * Test of addTag method, of class Table.
     */
//    @org.junit.jupiter.api.Test
//    public void testAddTag_4args() {
//        System.out.println("addTag");
//        Table.Direction tagLocation = null;
//        int logicalIndex = 0;
//        String tagName = "";
//        String tagValue = "";
//        Table instance = new Table();
//        instance.addTag(tagLocation, logicalIndex, tagName, tagValue);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of addTag method, of class Table.
//     */
//    @org.junit.jupiter.api.Test
//    public void testAddTag_3args() {
//        System.out.println("addTag");
//        Table.Direction tagLocation = null;
//        int logicalIndex = 0;
//        String tagName = "";
//        Table instance = new Table();
//        instance.addTag(tagLocation, logicalIndex, tagName);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of hasTag method, of class Table.
//     */
//    @org.junit.jupiter.api.Test
//    public void testHasTag() {
//        System.out.println("hasTag");
//        Table.Direction tagLocation = null;
//        int logicalIndex = 0;
//        String tagName = "";
//        Table instance = new Table();
//        boolean expResult = false;
//        boolean result = instance.hasTag(tagLocation, logicalIndex, tagName);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getTag method, of class Table.
//     */
//    @org.junit.jupiter.api.Test
//    public void testGetTag() {
//        System.out.println("getTag");
//        Table.Direction tagLocation = null;
//        int logicalIndex = 0;
//        String tagName = "";
//        Table instance = new Table();
//        String expResult = "";
//        String result = instance.getTag(tagLocation, logicalIndex, tagName);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of coalesce method, of class Table.
//     */
//    @org.junit.jupiter.api.Test
//    public void testCoalesce() {
//        System.out.println("coalesce");
//        InternalLocation internalLocation = null;
//        Table instance = new Table();
//        boolean expResult = false;
//        boolean result = instance.coalesce(internalLocation);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getBoundaryCondition method, of class Table.
//     */
//    @org.junit.jupiter.api.Test
//    public void testGetBoundaryCondition() {
//        System.out.println("getBoundaryCondition");
//        IBoundaryLocation boundaryLocation = null;
//        Table instance = new Table();
//        BoundaryCondition expResult = null;
//        BoundaryCondition result = instance.getBoundaryCondition(boundaryLocation);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of addColumns method, of class Table.
//     */
//    @org.junit.jupiter.api.Test
//    public void testAddColumns() {
//        System.out.println("addColumns");
//        ColumnLocation location = null;
//        int count = 0;
//        Table instance = new Table();
//        instance.addColumns(location, count);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of addColumn method, of class Table.
//     */
//    @org.junit.jupiter.api.Test
//    public void testAddColumn() {
//        System.out.println("addColumn");
//        ColumnLocation location = null;
//        Table instance = new Table();
//        instance.addColumn(location);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of addRow method, of class Table.
//     */
//    @org.junit.jupiter.api.Test
//    public void testAddRow() {
//        System.out.println("addRow");
//        RowLocation location = null;
//        Table instance = new Table();
//        instance.addRow(location);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of addRows method, of class Table.
//     */
//    @org.junit.jupiter.api.Test
//    public void testAddRows() {
//        System.out.println("addRows");
//        RowLocation location = null;
//        int count = 0;
//        Table instance = new Table();
//        instance.addRows(location, count);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    /**
     * Test of compact method, of class Table.
     */
//    @org.junit.jupiter.api.Test
//    public void testCompact_0args() {
//        System.out.println("compact");
//        Table instance = new Table();
//        boolean expResult = false;
//        boolean result = instance.compact();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of compact method, of class Table.
//     */
//    @org.junit.jupiter.api.Test
//    public void testCompact_ILocationArr() {
//        System.out.println("compact");
//        ILocation[] locations = null;
//        Table instance = new Table();
//        boolean expResult = false;
//        boolean result = instance.compact(locations);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of compact method, of class Table.
//     */
//    @org.junit.jupiter.api.Test
//    public void testCompact_ColumnLocation() {
//        System.out.println("compact");
//        ColumnLocation columnLocation = null;
//        Table instance = new Table();
//        boolean expResult = false;
//        boolean result = instance.compact(columnLocation);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of compact method, of class Table.
//     */
//    @org.junit.jupiter.api.Test
//    public void testCompact_RowLocation() {
//        System.out.println("compact");
//        RowLocation rowLocation = null;
//        Table instance = new Table();
//        boolean expResult = false;
//        boolean result = instance.compact(rowLocation);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of compact method, of class Table.
//     */
//    @org.junit.jupiter.api.Test
//    public void testCompact_InternalLocation() {
//        System.out.println("compact");
//        InternalLocation internalLocation = null;
//        Table instance = new Table();
//        boolean expResult = false;
//        boolean result = instance.compact(internalLocation);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setClipping method, of class Table.
//     */
//    @org.junit.jupiter.api.Test
//    public void testSetClipping() {
//        System.out.println("setClipping");
//        Table instance = new Table();
//        instance.setClipping();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setGrow method, of class Table.
//     */
//    @org.junit.jupiter.api.Test
//    public void testSetGrow() {
//        System.out.println("setGrow");
//        Table instance = new Table();
//        instance.setGrow();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setFixed method, of class Table.
//     */
//    @org.junit.jupiter.api.Test
//    public void testSetFixed() {
//        System.out.println("setFixed");
//        Table instance = new Table();
//        instance.setFixed();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getRow0 method, of class Table.
//     */
//    @org.junit.jupiter.api.Test
//    public void testGetRow0() {
//        System.out.println("getRow0");
//        Table instance = new Table();
//        int expResult = 0;
//        int result = instance.getRow0();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getCol0 method, of class Table.
//     */
//    @org.junit.jupiter.api.Test
//    public void testGetCol0() {
//        System.out.println("getCol0");
//        Table instance = new Table();
//        int expResult = 0;
//        int result = instance.getCol0();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getRowNumber method, of class Table.
//     */
//    @org.junit.jupiter.api.Test
//    public void testGetRowNumber() {
//        System.out.println("getRowNumber");
//        Table instance = new Table();
//        int expResult = 0;
//        int result = instance.getRowNumber();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getColNumber method, of class Table.
//     */
//    @org.junit.jupiter.api.Test
//    public void testGetColNumber() {
//        System.out.println("getColNumber");
//        Table instance = new Table();
//        int expResult = 0;
//        int result = instance.getColNumber();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getCell method, of class Table.
//     */
//    @org.junit.jupiter.api.Test
//    public void testGetCell() {
//        System.out.println("getCell");
//        int row = 0;
//        int col = 0;
//        Table instance = new Table();
//        Cell expResult = null;
//        Cell result = instance.getCell(row, col);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of isVisible method, of class Table.
//     */
//    @org.junit.jupiter.api.Test
//    public void testIsVisible() {
//        System.out.println("isVisible");
//        int row = 0;
//        int col = 0;
//        Table instance = new Table();
//        boolean expResult = false;
//        boolean result = instance.isVisible(row, col);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of isDefaultCell method, of class Table.
//     */
//    @org.junit.jupiter.api.Test
//    public void testIsDefaultCell() {
//        System.out.println("isDefaultCell");
//        int row = 0;
//        int col = 0;
//        Table instance = new Table();
//        boolean expResult = false;
//        boolean result = instance.isDefaultCell(row, col);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setCell method, of class Table.
//     */
//    @org.junit.jupiter.api.Test
//    public void testSetCell() {
//        System.out.println("setCell");
//        Cell cell = null;
//        int row = 0;
//        int col = 0;
//        Table instance = new Table();
//        SetResult expResult = null;
//        SetResult result = instance.setCell(cell, row, col);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of addTable method, of class Table.
//     */
//    @org.junit.jupiter.api.Test
//    public void testAddTable() {
//        System.out.println("addTable");
//        Table table = null;
//        int row0 = 0;
//        int col0 = 0;
//        Table instance = new Table();
//        instance.addTable(table, row0, col0);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of canSetCell method, of class Table.
//     */
//    @org.junit.jupiter.api.Test
//    public void testCanSetCell() {
//        System.out.println("canSetCell");
//        Cell cell = null;
//        int row = 0;
//        int col = 0;
//        Table instance = new Table();
//        Table.CheckResult expResult = null;
//        Table.CheckResult result = instance.canSetCell(cell, row, col);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of dump method, of class Table.
//     */
//    @org.junit.jupiter.api.Test
//    public void testDump_String() throws Exception {
//        System.out.println("dump");
//        String fileName = "";
//        Table instance = new Table();
//        instance.dump(fileName);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of dump method, of class Table.
//     */
//    @org.junit.jupiter.api.Test
//    public void testDump_0args() throws Exception {
//        System.out.println("dump");
//        Table instance = new Table();
//        instance.dump();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of dump method, of class Table.
//     */
//    @org.junit.jupiter.api.Test
//    public void testDump_Writer() throws Exception {
//        System.out.println("dump");
//        Writer writer = null;
//        Table instance = new Table();
//        instance.dump(writer);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getRowEnd method, of class Table.
//     */
//    @org.junit.jupiter.api.Test
//    public void testGetRowEnd() {
//        System.out.println("getRowEnd");
//        Table instance = new Table();
//        int expResult = 0;
//        int result = instance.getRowEnd();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getColEnd method, of class Table.
//     */
//    @org.junit.jupiter.api.Test
//    public void testGetColEnd() {
//        System.out.println("getColEnd");
//        Table instance = new Table();
//        int expResult = 0;
//        int result = instance.getColEnd();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setBoundaryCondition method, of class Table.
//     */
//    @org.junit.jupiter.api.Test
//    public void testSetBoundaryCondition() {
//        System.out.println("setBoundaryCondition");
//        IBoundaryLocation boundaryLocation = null;
//        BoundaryCondition boundaryCondition = null;
//        Table instance = new Table();
//        instance.setBoundaryCondition(boundaryLocation, boundaryCondition);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of addRenderer method, of class Table.
//     */
//    @org.junit.jupiter.api.Test
//    public void testAddRenderer() {
//        System.out.println("addRenderer");
//        RenderingContext renderingContext = null;
//        IRenderer renderer = null;
//        Table instance = new Table();
//        instance.addRenderer(renderingContext, renderer);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getRenderer method, of class Table.
//     */
//    @org.junit.jupiter.api.Test
//    public void testGetRenderer() {
//        System.out.println("getRenderer");
//        RenderingContext renderingContext = null;
//        Table instance = new Table();
//        IRenderer expResult = null;
//        IRenderer result = instance.getRenderer(renderingContext);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of hasRenderer method, of class Table.
//     */
//    @org.junit.jupiter.api.Test
//    public void testHasRenderer() {
//        System.out.println("hasRenderer");
//        RenderingContext renderingContext = null;
//        Table instance = new Table();
//        boolean expResult = false;
//        boolean result = instance.hasRenderer(renderingContext);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
}
