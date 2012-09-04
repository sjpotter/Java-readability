package com.basistech.readability;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import com.basistech.readability.AbstractPageReader;
import com.basistech.readability.PageReadException;
import com.basistech.readability.PageReader;


public class StringPageReader extends AbstractPageReader implements PageReader {
    String htmltext;
    
    public void setString(String s) {
        htmltext = s;
    }
    
    
    @Override
    public String readPage(String arg) throws PageReadException {
        try {
            return readContent(new ByteArrayInputStream(htmltext.getBytes()), null);
        } catch (IOException e) {
            throw new PageReadException("Failed to use string", e);
        }
    }

}
