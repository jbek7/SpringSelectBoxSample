package com.springapp.mvc;

import java.util.Collections;
import java.util.List;

public class MultiModel {
    private List<String> options = Collections.emptyList();

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }
}