package com.josegom.musicManager.song;

/**
 * Created by jmgomez on 24/07/14.
 */
public class Tag extends SimpleStorable {


    public Tag(Integer id, String value) {
        super(id, value);
    }

    @Override
    protected String getName() {
        return "tag";
    }





}
