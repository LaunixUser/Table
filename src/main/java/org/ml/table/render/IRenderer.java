package org.ml.table.render;

import org.ml.table.Table;

/**
 * This is a marker interface for renderers. Renderers can be attached to
 * {@link Table} instances where they handle specific formatting needs to cells
 * during output of the table's contents in various formats
 *
 * @author mlaux
 */
public interface IRenderer {

    /**
     * This can be used to indicate to a renderer that the content is a
     * percentage-type value
     */
    String HINT_PERCENTAGE = "percentage";
}
