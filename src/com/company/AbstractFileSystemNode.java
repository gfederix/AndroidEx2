package com.company;

public class AbstractFileSystemNode implements FileSystemNode {
    public final FileSystemNode getParent(){
        return this;
    }
    public  String getName(){
        return "";
    };
    public final String getPath(){
        return "";
    }
    public void setParent( FileSystemNode node ){
    }

}
