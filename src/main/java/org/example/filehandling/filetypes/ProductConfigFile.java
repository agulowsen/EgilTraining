package org.example.filehandling.filetypes;

import org.example.filehandling.dataobjects.ProductConfig;
import org.example.filehandling.interfaces.FileParser;
import org.example.filehandling.interfaces.FileReadable;
import org.example.filehandling.interfaces.FileSavable;
import org.example.filehandling.parsers.ConfigFileParser;

import java.util.ArrayList;
import java.util.List;

public class ProductConfigFile extends CustomFile implements FileReadable<ProductConfig>, FileSavable<ProductConfig> {

    ConfigFileParser productFileParser;
    private List<ProductConfig> productConfig;

    public ProductConfigFile(String fileName, String filePath, String fileFormat) {
        super(fileName, filePath, fileFormat);
        productFileParser = new ConfigFileParser();
        this.productConfig = new ArrayList<>();
    }


    @Override
    public FileParser<ProductConfig> getParser() {
        return productFileParser;
    }

    @Override
    public String getFileContent() {
        StringBuilder builder = new StringBuilder();
        for (ProductConfig config : productConfig ){
            builder.append(config).append("\n");
        }
        return builder.toString();
    }

    @Override
    public void setData(List<ProductConfig> data) {
        if(data == null){
            productConfig = new ArrayList<>();
            return;
        }
        productConfig.clear();
        productConfig.addAll(data);
    }
}
