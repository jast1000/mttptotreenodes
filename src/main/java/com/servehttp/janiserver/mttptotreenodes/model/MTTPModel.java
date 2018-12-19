package com.servehttp.janiserver.mttptotreenodes.model;

/**
 *
 * @author Jesus Sanchez
 */
public class MTTPModel {
    
    private String id;
    private String value;
    private Integer left;
    private Integer right;
    private Integer difference;
    
    public MTTPModel() {
    }

    public MTTPModel(String id, String value, Integer left, Integer right) {
        this.id = id;
        this.value = value;
        this.left = left;
        this.right = right;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getLeft() {
        return left;
    }

    public void setLeft(Integer left) {
        this.left = left;
    }

    public Integer getRight() {
        return right;
    }

    public void setRight(Integer right) {
        this.right = right;
    }

    public Integer getDifference() {
        return difference;
    }

    public void setDifference(Integer difference) {
        this.difference = difference;
    }

    @Override
    public String toString() {
        return "MTTPModel{" + "id=" + id + ", value=" + value + ", left=" + left + ", right=" + right + '}';
    }
    
}
