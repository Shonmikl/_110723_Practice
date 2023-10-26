package org.example._2023_10_26;

import java.util.ArrayList;

public class ParamMethod {
    public <T> T get(ArrayList<T> al) {
        return al.get(0);
    }
}