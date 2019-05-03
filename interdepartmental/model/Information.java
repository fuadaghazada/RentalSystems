package com.interdepartmental.model;

import java.util.ArrayList;

public interface Information {
    void post();
    ArrayList<String> list();
    void update(Object o);
    void delete();
}
