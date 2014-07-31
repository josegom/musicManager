package com.josegom.musicManager.song;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by jmgomez on 24/07/14.
 */
public abstract class SimpleStorable<T> {

    protected Integer id;
    protected String value;

    protected abstract String getName();
    Set<T> allT = null;

    public SimpleStorable(Integer id, String value) {
        this.id = id;
        this.value = value;

    }

    public Set<T> getAll()  {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        try {
            SAXParser saxParser = factory.newSAXParser();
            allT = new HashSet<>();
            saxParser.parse( new File("."+File.separator+"src"+File.separator+"main"+File.separator+"resources"+File.separator+getName()+".xml") , new SongTagHandler(this.getClass()));
        } catch (ParserConfigurationException | SAXException  | IOException e) {
            e.printStackTrace();
        }


        return allT;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SimpleStorable songTag = (SimpleStorable) o;

        if (id != null ? !id.equals(songTag.id) : songTag.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    private void setId(Integer id){
        this.id = id;
    }

    private void setValue(String value){
        this.value = value;
    }

    class SongTagHandler extends DefaultHandler {

        Class type ;
        public SongTagHandler (Class type){
            this.type = type;
        }

        public void startElement(String uri, String localName, String qName,
                                 Attributes attributes) throws SAXException {
            SimpleStorable st = null;
            try {
                st = (SimpleStorable)type.newInstance();
                st.setId(Integer.parseInt(attributes.getValue(0)));
                st.setValue(attributes.getValue(1));
                allT.add((T)st);
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }

        }

    }

}