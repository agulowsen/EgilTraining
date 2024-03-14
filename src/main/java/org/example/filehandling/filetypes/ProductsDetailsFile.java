package org.example.filehandling.filetypes;

import org.example.filehandling.dataobjects.ProductDetails;
import org.example.filehandling.interfaces.FileParser;
import org.example.filehandling.interfaces.FileReadable;
import org.example.filehandling.interfaces.FileSavable;
import org.example.filehandling.parsers.AvailabilityFileParser;

import java.util.ArrayList;
import java.util.List;

public class ProductsDetailsFile extends CustomFile implements FileReadable<ProductDetails>, FileSavable<ProductDetails> {

    AvailabilityFileParser productFileParser;
    private List<ProductDetails> productDetails;

    public ProductsDetailsFile(String fileName, String filePath, String fileFormat) {
        super(fileName, filePath, fileFormat);
        productFileParser = new AvailabilityFileParser();
        this.productDetails = new ArrayList<>();
    }

    @Override
    public FileParser<ProductDetails> getParser() {
        return productFileParser;
    }

    @Override
    public String getFileContent() {
        StringBuilder builder = new StringBuilder();
        for (ProductDetails p : productDetails) {
            builder.append(p).append("\n");
        }
        return builder.toString();
    }

    @Override
    public void setData(List<ProductDetails> data) {
        if(data == null)  {
            productDetails = new ArrayList<>();
            return;
        }
        productDetails.clear();
        productDetails.addAll(data);
    }
}
