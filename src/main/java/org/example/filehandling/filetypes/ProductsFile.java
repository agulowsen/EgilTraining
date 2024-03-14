package org.example.filehandling.filetypes;

import org.example.filehandling.dataobjects.Product;
import org.example.filehandling.interfaces.FileParser;
import org.example.filehandling.interfaces.FileReadable;
import org.example.filehandling.interfaces.FileSavable;
import org.example.filehandling.parsers.ProductsFileParser;

import java.util.ArrayList;
import java.util.List;

public class ProductsFile extends CustomFile implements FileReadable<Product>, FileSavable<Product> {

    ProductsFileParser productsFileParser;
    private List<Product> products;

    public ProductsFile(String fileName, String filePath, String fileFormat) {
        super(fileName, filePath, fileFormat);
        productsFileParser = new ProductsFileParser();
        products = new ArrayList<>();
    }

    @Override
    public FileParser<Product> getParser() {
        return productsFileParser;
    }


    @Override
    public String getFileContent() {
        StringBuilder builder = new StringBuilder();
        for (Product p : products) {
            builder.append(p).append("\n");
        }
        return builder.toString();
    }

    @Override
    public void setData(List<Product> data) {
        if(data == null) {
            products = new ArrayList<>();
            return;
        }
        products.clear();
        products.addAll(data);
    }
}
