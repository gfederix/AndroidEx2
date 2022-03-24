package com.company;

public interface FileSystemNode {
    public FileSystemNode getParent();
    void setParent(FileSystemNode node );
    public String getName();
    public String getPath();
}
