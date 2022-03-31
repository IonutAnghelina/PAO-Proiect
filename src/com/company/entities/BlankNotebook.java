package com.company.entities;

import java.util.Objects;

public class BlankNotebook extends Notebook{

    private String pageFormat;

    public BlankNotebook(int price, int noPages, String pageFormat) {
        super(price, noPages);
        this.pageFormat = pageFormat;
    }

    public String getPageFormat() {
        return pageFormat;
    }

    public void setPageFormat(String pageFormat) {
        this.pageFormat = pageFormat;
    }

    @Override
    public String toString() {
        return "BlankNotebook{" +
                "pageFormat='" + pageFormat + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        BlankNotebook that = (BlankNotebook) o;
        return Objects.equals(pageFormat, that.pageFormat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), pageFormat);
    }
}
