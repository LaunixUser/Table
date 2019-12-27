package org.ml.table;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * This class represents cells in the table. Cells can span more than one row
 * and column. Instances of this class are also used to hold all data pertaining
 * to a cell.
 * <p>
 * Due to inheritance from PropertyManager, cells can contain any number of
 * properties. This can come in quite handy as for example styling / rendering
 * information can be provided
 */
public class Cell {

    private final Map<String, Object> content = new HashMap<>();
    private Object contentSingle = null;
    private Set<String> types = new HashSet<>();
    private Set<String> styles = new HashSet<>();
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
        this.colSpan = colSpan;
        this.rowSpan = rowSpan;
    }

    /**
     *
     * @param style
     * @return
     */
    public boolean isOfStyle(String style) {
        if (style == null) {
            throw new NullPointerException("style may not be null");
        }
        return styles.contains(style);
    }

    /**
     * @param style
     * @return
     */
    public Cell addStyle(Enum style) {
        if (style == null) {
            throw new NullPointerException("style may not be null");
        }
        styles.add(style.toString());
        return this;
    }

    /**
     *
     * @param style
     * @return
     */
    public Cell addStyle(String style) {
        if (style == null) {
            throw new NullPointerException("style may not be null");
        }
        styles.add(style);
        return this;
    }

    /**
     *
     * @return
     */
    public Set<String> getStyles() {
        return styles;
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
     * Set a type for this cell. Types are more of a hint to e. g. renderers
     * that need to process the cell contents. Technically, any renderer can of
     * course look at the objects stored as content and their types and use
     * these to apply the desired rendering operation. It can be easier though
     * if a hint is given as to what the content is supposed to represent. For
     * example, a string object stored as content could represent a URL or an
     * Email address.
     * <p>
     * There can be multiple types added here which are stored in a Set
     *
     * @param type The type to set for this cell
     * @return
     */
    public Cell addType(String type) {
        if (type == null) {
            throw new IllegalArgumentException("type may not be null");
        }
        types.add(type);
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
        return types.contains(type);
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
     * Retrieve the anonymous content - an object which si not associated with a
     * key
     *
     * @return
     */
    public Object getContent() {
        return contentSingle;
    }

    /**
     * Set a content object. Content objects can be anything and are used to
     * attach data to a cell.
     *
     * @param key The key by which this content object is identified
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
     * Set the anonymous content object - this is not identified by a key. This
     * is for simple use cases where we need only a text or a number, for
     * example
     *
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
        sb.append(" / type(s) = ");
        for (String type : types) {
            sb.append(type);
            sb.append('|');
        }
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
