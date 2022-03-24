package com.company;

public class File implements FileSystemNode {
    private FileSystemNode parent;
    private String name;
    private String ext;

    public File(String name, String ext ){
        this.name = name;
        this.ext = ext;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setParent(FileSystemNode parent ){
        this.parent = parent;
    }

    @Override
    public FileSystemNode getParent(){
        return parent;
    }

    public String getExt() {
        return ext;
    }

    @Override
    public String getPath(){
        return parent.getPath() + name + "." + ext;
    }

}
