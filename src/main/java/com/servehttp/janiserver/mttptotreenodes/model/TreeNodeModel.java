package com.servehttp.janiserver.mttptotreenodes.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jesus Sanchez
 */
public class TreeNodeModel {
    
    private String id;
    private String value;
    private TreeNodeModel parent;
    private List<TreeNodeModel> childs = new ArrayList<>();
    private MTTPModel mttpModel;

    public TreeNodeModel() {
    }

    public TreeNodeModel(String id, String value, MTTPModel mttpModel) {
        this.id = id;
        this.value = value;
        this.mttpModel = mttpModel;
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

    public TreeNodeModel getParent() {
        return parent;
    }

    public void setParent(TreeNodeModel parent) {
        this.parent = parent;
    }

    public List<TreeNodeModel> getChilds() {
        return childs;
    }

    public void setChilds(List<TreeNodeModel> childs) {
        this.childs = childs;
    }

    public MTTPModel getMttpModel() {
        return mttpModel;
    }

    public void setMttpModel(MTTPModel mttpModel) {
        this.mttpModel = mttpModel;
    }

    @Override
    public String toString() {
        return "TreeNodeModel{" + "id=" + id + ", value=" + value + ", parent=" + parent + "}'";
    }
    
}
