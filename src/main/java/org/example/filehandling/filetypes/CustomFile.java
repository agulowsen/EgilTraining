package org.example.filehandling.filetypes;

public abstract class CustomFile {

    protected String fileName;
    protected String filePath;
    protected String fileFormat;

    public CustomFile(String fileName, String filePath, String fileFormat) {
        this.fileName = fileName;
        this.filePath = filePath;
        this.fileFormat = fileFormat;
    }

    public String getFileName() {
        return fileName;
    }

    public String getFilePath() {
        return filePath;
    }

    public String getFileFormat() {
        return fileFormat;
    }
}
