package com.company;

import javax.management.NotificationEmitter;
import java.util.ArrayList;

public class Folder implements FileSystemNode {
    private ArrayList<FileSystemNode> nodes;
    private  String name;
    private FileSystemNode parent;
    public Folder(String name,  FileSystemNode... nodes ){
        this.name = name;
        this.nodes = new ArrayList<>();
        for ( var node: nodes ){
            node.setParent( this );
            this.nodes.add( node );
        }
    }
    public  String getName(){
        return name;
    }
    public void setParent(FileSystemNode node ){
        parent = node;
    }

    public FileSystemNode getParent(){
       return parent;
    }

    public String getPath(){
        if ( name.equals("/") ){
            return "/";
        }
        return parent.getPath()  + name + "/";
    }

}
