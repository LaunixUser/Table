package org.ml.table.content;

/**
 * A helper class to represent URL type information attached to a cell as
 * content
 *
 * @author Dr. Matthias Laux
 */
public class UrlContent implements Comparable<UrlContent> {

    private String address = "";
    private String text = "";
    private String description = "";

    /**
     * @param address The actual URL
     * @param text The text to be displayed for the URL
     * @param description An additional description text which might be helpful,
     * e. g. as alternate text
     */
    public UrlContent(String address, String text, String description) {
        if (address == null) {
            throw new NullPointerException("address may not be null");
        }
        if (text == null) {
            throw new NullPointerException("text may not be null");
        }
        if (description == null) {
            throw new NullPointerException("description may not be null");
        }
        this.address = address;
        this.text = text;
        this.description = description;
    }

    /**
     * @param address
     * @param text
     */
    public UrlContent(String address, String text) {
        this(address, text, "");
    }

    /**
     * @return
     */
    public String getAddress() {
        return address;
    }

    /**
     * @return
     */
    public String getText() {
        return text;
    }

    /**
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param UrlContent
     * @return
     */
    @Override
    public int compareTo(UrlContent UrlContent) {
        if (UrlContent == null) {
            throw new NullPointerException("URLContent may not be null");
        }
        return getAddress().compareTo(UrlContent.getAddress());
    }
}
