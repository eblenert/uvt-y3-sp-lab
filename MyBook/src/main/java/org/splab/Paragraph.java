package org.splab;

import org.splab.AlignStrategy.AlignStrategy;

public class Paragraph implements Element {
    private final String text;
    private AlignStrategy textAlignment = null;

    Paragraph(String text) {
        this.text = text;
    }

    public void print() {
        if (textAlignment == null) {
            System.out.println(text);
        } else {

            textAlignment.render(text);
        }
    }

    public void setAlignStrategy(AlignStrategy as) {
        this.textAlignment = as;
    }

    @Override
    public void add(Element e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void remove(Element e) {
        // TODO Auto-generated method stub

    }

    @Override
    public Element get(Integer n) {
        // TODO Auto-generated method stub
        return null;
    }
}
