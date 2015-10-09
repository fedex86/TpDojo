package com.example.profesor.appdojo;

import android.util.Xml;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by alumno on 01/10/2015.
 */
public class XmlParse {

    private String xml;

     public XmlParse (String xml)
     {
         this.xml = xml;

     }

    public static List<Persona> parser (String xml)
    {
        XmlPullParser parser = Xml.newPullParser();
        List<Persona> personas = new ArrayList<Persona>();

        try
        {

            parser.setInput( new StringReader(xml));
            int event = parser.getEventType();

            while (event != XmlPullParser.END_DOCUMENT) {
                Persona persona = null;
                switch (event) {
                    case XmlPullParser.START_TAG: {

                        String tagName = parser.getName();
                        if (tagName.equals("persona")) {
                            persona = new Persona();
                            persona.setNombre(parser.getAttributeValue(null, "name"));
                            persona.setApellido(parser.getAttributeValue(null, "surname"));
                            persona.setUrl(parser.getAttributeValue(null, "img"));
                            persona.setTelefono(parser.nextText());
                            personas.add(persona);
                        }
                        break;
                    }
                    case XmlPullParser.END_TAG: {

                        break;
                    }
                }
                event = parser.next();
            }
        }
        catch (XmlPullParserException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return personas;
    }

    public static List<Noticia> parserNoticia (String xml)
    {
        XmlPullParser parser = Xml.newPullParser();
        List<Noticia> noticias = new ArrayList<Noticia>();

        try
        {

            parser.setInput( new StringReader(xml));
            int event = parser.getEventType();

            while (event != XmlPullParser.END_DOCUMENT) {
                Noticia noticia = null;
                switch (event) {
                    case XmlPullParser.START_TAG: {

                        String tagName = parser.getName();
                        if (tagName.equals("persona")) {
                            noticia = new Noticia();
                            //notic.setNombre(parser.getAttributeValue(null, "name"));
                            //persona.setApellido(parser.getAttributeValue(null, "surname"));
                            //persona.setUrl(parser.getAttributeValue(null, "img"));
                            //persona.setTelefono(parser.nextText());
                            //personas.add(persona);
                        }
                        break;
                    }
                    case XmlPullParser.END_TAG: {

                        break;
                    }
                }
                event = parser.next();
            }
        }
        catch (XmlPullParserException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return personas;
    }

}
