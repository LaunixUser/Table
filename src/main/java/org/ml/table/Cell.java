/*
 * The MIT License
 *
 * Copyright 2019 Dr. Matthias Laux.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.ml.table;

import java.util.HashMap;
import java.util.Map;

import org.ml.tools.PropertyManager;

/**
 * This class represents cells in the table. Cells can span more than one row
 * and column. Instances of this class are also used to hold all data pertaining
 * to a cell.
 * <p>
 * Due to inheritance from PropertyManager, cells can contain any number of
 * properties. This can come in quite handy as for example styling / rendering
 * information can be provided
 */
public class Cell extends PropertyManager {

    private final Map<String, Object> content = new HashMap<>();
    private Object contentSingle = null;
    private String type = null;
    private int rowSpan = 1;
    private int colSpan = 1;

    /**
     * Constructor for a simple cell with 1 row and 1 column
     */
    public Cell() {
        this(1, 1);
    }

    /**
     * Constructor for a cell.
     *
     * @param rowSpan The number of rows that this cell spans
     * @param colSpan The number of columns that this cell spans
     */
    public Cell(int rowSpan, int colSpan) {
        if (rowSpan < 1) {
            throw new IllegalArgumentException("rowSpan must be larger than 0");
        }
        if (colSpan < 1) {
            throw new IllegalArgumentException("colSpan must be larger than 0");
        }
        setColSpan(colSpan);
        setRowSpan(rowSpan);
        setAvoidOverwrites(false);
    }

    /**
     * Helper wrapper to allow for chained invocations
     *
     * @param key
     * @param value
     * @return
     */
    public Cell setProp(String key, String value) {
        setProperty(key, value);
        return this;
    }

    /**
     * @param key
     * @param e
     * @return
     */
    public Cell setProp(String key, Enum e) {
        setProperty(key, e.toString());
        return this;
    }

    /**
     * Retrieve the content elements defined for this cell.
     *
     * @return The content element map for this cell
     */
    public Map<String, Object> getContents() {
        return content;
    }

    /**
     * Retrieve the type defined for this cell.
     *
     * @return The type for this cell
     */
    public String getType() {
        return type;
    }

    /**
     * Retrieve the number of rows that this cell spans.
     *
     * @return The number of rows that this cell spans
     */
    public int getRowSpan() {
        return rowSpan;
    }

    /**
     * Retrieve the number of columns that this cell spans.
     *
     * @return The number of columns that this cell spans
     */
    public int getColSpan() {
        return colSpan;
    }

    /**
     * Set type for this cell. Types are more of a hint to e. g. renderers that
     * need to process the cell contents. Technically, any renderer can of
     * course look at the objects stored as content and their types and use
     * these to apply the desired rendering operation. It can be easier though
     * if a hint is given as to what the content is supposed to represent. For
     * example, a string object stored as content could represent a URL or an
     * Email address.
     * <p>
     * There can be only one type for a given cell. In more complex scenarios
     * (where we have multiple objects stored as content) the keys for the
     * content or property values may need to convey further information as to
     * what to do with the content.
     *
     * @param type The type to set for this cell
     * @return
     */
    public Cell setType(String type) {
        if (type == null) {
            throw new IllegalArgumentException("type may not be null");
        }
        this.type = type;
        return this;
    }

    /**
     * Check whether a given type is set for this cell.
     *
     * @param type The type to check for in this cell
     * @return A boolean indicating whether the given type has been set for this
     * cell
     */
    public boolean isOfType(String type) {
        if (type == null) {
            throw new IllegalArgumentException("type may not be null");
        }
        if (this.type != null) {
            return this.type.equals(type);
        } else {
            return false;
        }
    }

    /**
     * Retrieve the content object associated with the given key.
     *
     * @param key The key identifying the content object
     * @return The content object associated with the given key
     */
    public Object getContent(String key) {
        if (key == null) {
            throw new IllegalArgumentException("key may not be null");
        }
        return content.get(key);
    }

    /**
     * @return
     */
    public Object getContent() {
        return contentSingle;
    }

    /**
     * Set a content object. Content objects can be anything and are used to
     * attach data to a cell.
     *
     * @param key   The key by which this content object is identified
     * @param value The actual content object
     * @return
     */
    public Cell setContent(String key, Object value) {
        if (key == null) {
            throw new IllegalArgumentException("key may not be null");
        }
        if (value == null) {
            throw new IllegalArgumentException("value may not be null");
        }
        content.put(key, value);
        return this;
    }

    /**
     * @param value
     * @return
     */
    public Cell setContent(Object value) {
        if (value == null) {
            throw new NullPointerException("value may not be null");
        }
        this.contentSingle = value;
        return this;
    }

    /**
     * Convenience method if enums are used as keys
     *
     * @param key
     * @param value
     * @return
     */
    public Cell setContent(Enum key, Object value) {
        if (key == null) {
            throw new NullPointerException("key may not be null");
        }
        setContent(key.toString(), value);
        return this;
    }

    /**
     * @param key
     * @return
     */
    public boolean hasContent(String key) {
        if (key == null) {
            throw new IllegalArgumentException("key may not be null");
        }
        return content.containsKey(key);
    }

    /**
     * Set the number of rows that this cell spans. The original value set in
     * the constructor may change when cells are clipped during insertion into
     * the table.
     *
     * @param rowSpan The number of rows that this cell spans
     * @see BoundaryCondition
     */
    void setRowSpan(int rowSpan) {
        if (rowSpan < 1) {
            throw new IllegalArgumentException("rowSpan must be greater than 0");
        }
        this.rowSpan = rowSpan;
    }

    /**
     * Set the number of columns that this cell spans. The original value set in
     * the constructor may change when cells are clipped during insertion into
     * the table.
     *
     * @param colSpan The number of columns that this cell spans
     * @see BoundaryCondition
     */
    void setColSpan(int colSpan) {
        if (colSpan < 1) {
            throw new IllegalArgumentException("colSpan must be greater than 0");
        }
        this.colSpan = colSpan;
    }

    /**
     * The overridden {@link Object#toString()} method. This is primarily for
     * debugging purposes.
     *
     * @return A string representation of the instance with all relevant data
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cell: rowSpan = ");
        sb.append(rowSpan);
        sb.append(" / colSpan = ");
        sb.append(colSpan);
        sb.append(" / type = ");
        sb.append(type);
        sb.append(" / ");
        for (String key : content.keySet()) {
            sb.append(key);
            sb.append(" : ");
            sb.append(content.get(key));
            sb.append("\n");
        }
        return sb.toString();
    }

}
