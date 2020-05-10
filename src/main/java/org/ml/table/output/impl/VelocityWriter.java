package org.ml.table.output.impl;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.ml.table.Table;
import org.ml.table.render.RenderingContext;
import org.ml.tools.PropertyManager;
import org.ml.tools.logging.LoggerFactory;
import org.ml.tools.velocity.VelocityConfig;
import static org.ml.tools.velocity.VelocityConfig.RequiredKey;
import static org.ml.tools.velocity.VelocityConfig.OptionalKey;

/**
 *
 * @author osboxes
 */
public class VelocityWriter {

    private final static Logger LOGGER = LoggerFactory.getLogger(VelocityWriter.class.getName());
    private PropertyManager propertyManager;

    /**
     *
     */
    public enum KEY {
        renderingContext, table, renderer
    }

    /**
     *
     */
    public enum OPTIONAL_PROPERTY {
        CSS_FILE;
    }

    /**
     *
     */
    public VelocityWriter() {

    }

    /**
     *
     * @param propertyManager
     */
    public VelocityWriter(PropertyManager propertyManager) {
        if (propertyManager == null) {
            throw new NullPointerException("propertyManager may not be null");
        }
        this.propertyManager = propertyManager;
    }

    /**
     *
     * @param table
     * @param fileName
     * @throws Exception
     */
    public void write(Table table, String fileName) throws Exception {

        PropertyManager pm = new PropertyManager();
        if (propertyManager.containsProperty(RequiredKey.templateName)) {
            pm.setProperty(RequiredKey.templateName, propertyManager.getProperty(RequiredKey.templateName));
        } else {
            pm.setProperty(RequiredKey.templateName, "velocity/table.vm");
        }
        if (propertyManager.containsProperty(OptionalKey.templateDirectory)) {
            pm.setProperty(OptionalKey.templateDirectory, propertyManager.getProperty(OptionalKey.templateDirectory));
        }

        VelocityConfig velocityConfig = new VelocityConfig(pm);
        Template template = velocityConfig.getTemplate();
        VelocityContext context = new VelocityContext();
        context.put(KEY.renderingContext.toString(), RenderingContext.VELOCITY);
        context.put(KEY.table.toString(), table);
        for (String key : propertyManager.getProperties().keySet()) {
            context.put(key, propertyManager.getProperty(key));
        }

        BufferedWriter writer;
        File file = new File(fileName);
        if (file.getParentFile() != null) {
            file.getParentFile().mkdirs();
        }
        LOGGER.log(Level.INFO, "Writing output file {0}", fileName);
        if (file.exists()) {
            file.delete();
        }
        writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, false), StandardCharsets.UTF_8));
        template.merge(context, writer);
        writer.flush();
        writer.close();
    }

}
