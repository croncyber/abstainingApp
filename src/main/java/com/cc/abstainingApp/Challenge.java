package com.cc.abstainingApp;

import lombok.Data;

@Data
public class Challenge {
    private final String name;
    private final long duration;

    public Challenge(String name, long duration) {
        this.name = name;
        this.duration = duration;
    }

}
