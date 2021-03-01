package com.facility.dal;

import com.facility.model.facility.Facility;

import java.beans.ExceptionListener;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;


public class XMLDB {

    public static void objectToXMl(Object obj) throws IOException  {
        FileOutputStream fos = new FileOutputStream("facility.xml");
        XMLEncoder encoder = new XMLEncoder(fos);
        encoder.setExceptionListener(new ExceptionListener() {
            @Override
            public void exceptionThrown(Exception e) {
                System.out.println(e.toString());
            }
        });
        encoder.writeObject(obj);
        encoder.close();
        fos.close();


    }

    public static Facility deserializeFromXML() throws IOException {
        FileInputStream fis = new FileInputStream("facility.xml");
        XMLDecoder decoder = new XMLDecoder(fis);
        Facility facility = (Facility) decoder.readObject();
        decoder.close();
        fis.close();
        return facility;
    }
}
