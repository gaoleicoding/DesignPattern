package com.java.designpattern.pattern15_visitor;

import java.util.ArrayList;
import java.util.List;

class ObjectStructure {

    private List<Computer> computers = new ArrayList<Computer>();

    public void accept(Visitor visitor) {
        for (Computer c : computers) {
            c.accept(visitor);
        }

    }

    public void add(Computer computer) {
        computers.add(computer);
    }
}