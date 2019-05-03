package com.interdepartmental.model;

import java.util.ArrayList;

public interface Allocation {
    void book();
    ArrayList<String> list();
    void update(Object o);
    void delete();
}
