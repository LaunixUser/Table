package org.ml.table.content;

/**
 * @author Dr. Matthias Laux
 */
public class UrlContent implements Comparable<UrlContent> {

    private String address = "";
    private String text = "";
    private String description = "";

    /**
     * @param address
     * @param text
     * @param description
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
