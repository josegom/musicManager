package com.josegom.musicManager.fileManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.ResourceBundle;

/**
 * Created by jmgomez on 24/07/14.
 */
public class FileManager {


    private static final ResourceBundle FICHERO_PROPERTIES_ATRIBUTOS = ResourceBundle.getBundle("musicManager");

    private final String path = FICHERO_PROPERTIES_ATRIBUTOS.getString("pathSource");
    /**
     * The Log.
     */
    private final static Logger logger = LoggerFactory.getLogger(FileManager.class);

    public String[] readAllSourcesFiles() {

        File folder = new File(path);
        String[] files = folder.list();
        for (int i=0;i<files.length;i++){
            System.out.println(files[i]);
        }
        return null;
    }


    public static void main(String args[])
    {
        new FileManager().readAllSourcesFiles();
    }



}
