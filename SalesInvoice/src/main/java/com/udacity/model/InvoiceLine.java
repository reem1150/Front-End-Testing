
package com.udacity.model;


public class InvoiceLine {
    private String itemName;
    private Double itemPrice;
    private int itemCount;
    private InvoiceHeader header;

    public InvoiceLine(String itemName, Double itemPrice, int itemcount, InvoiceHeader header) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemCount = itemcount;
        this.header = header;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(Double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getItemcount() {
        return itemCount;
    }

    public void setItemcount(int itemCount) {
        this.itemCount = itemCount;
    }

    public InvoiceHeader getHeader() {
        return header;
    }

    public void setHeader(InvoiceHeader header) {
        this.header = header;
    }

    @Override
    public String toString() {
        return "InvoiceLine{" + "itemName=" + itemName + ", itemPrice=" + itemPrice + ", itemcount=" + itemCount + '}';
    }
    
    public double getLineTotal(){
        return itemCount * itemPrice;
    }
    
    
}
