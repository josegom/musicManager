package com.josegom.musicManager.fileManager.song;

/**
 * Created by jmgomez on 24/07/14.
 */
public class Language extends SimpleStorable {


    public Language(Integer id, String value) {
        super(id, value);
    }

    @Override
    protected String getName() {
        return "language";
    }
}
