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
