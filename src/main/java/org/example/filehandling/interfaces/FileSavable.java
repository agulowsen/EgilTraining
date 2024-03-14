package org.example.filehandling.interfaces;

import java.util.List;

public interface FileSavable<T> {
    String getFilePath();
    String getFileName();
    String getFileFormat();
    String getFileContent();
    void setData(List<T> data);

}
