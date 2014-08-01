package com.josegom.musicManager.musicPlayer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by jmgomez on 1/08/14.
 */

/**
 * This class is for UNIX and need the file music.sh with contend
  * echo $1
 * rhythmbox-client --play-uri="$1"
 *
 * in the pat

 */
public class RytmboxPlayer {

    private final static Logger logger = LoggerFactory.getLogger(RytmboxPlayer.class);

    public void play(String file){
        try {

             Runtime.getRuntime().exec( new String[]{"music.sh", file});
        } catch (IOException  e) {
            e.printStackTrace();
        }
    }
}
