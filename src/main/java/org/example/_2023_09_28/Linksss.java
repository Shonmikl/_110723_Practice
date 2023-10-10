package org.example._2023_09_28;

import lombok.Getter;

public class Linksss {
    private String name;
    private Linksss linksss;
    private String path;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Linksss getLinksss() {
        return linksss;
    }

    public void setLinksss(Linksss linksss) {
        this.linksss = linksss;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}

class Main1 {
    public static void main(String[] args) {
        new Linksss().setName("source1");
    }
}
