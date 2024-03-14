package org.example.filehandling.interfaces;

public interface FileReadable<T> {

    FileParser<T> getParser();
    String getFilePath();
    String getFileName();
    String getFileFormat();

}
