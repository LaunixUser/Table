package org.ml.table.render;

import org.ml.table.Cell;

/**
 * @author Dr. Matthias Laux
 */
public interface IVelocityRenderer extends IRenderer {

    /**
     * This returns a string that can be embedded in a HTML page
     *
     * @param cell
     * @return
     */
    String renderCell(Cell cell);
}
