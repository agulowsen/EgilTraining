package org.example.filehandling.parsers;

import org.example.filehandling.dataobjects.ProductConfig;
import org.example.filehandling.interfaces.FileParser;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConfigFileParser implements FileParser<ProductConfig> {
    @Override
    public List<ProductConfig> parseFile(Scanner scanner) {
        ArrayList<ProductConfig> products = new ArrayList<>();
        do{
            String productString = scanner.nextLine();
            String[] values = productString.split(",");


            ProductConfig product = new ProductConfig(values[0], values[1], values[2], values[3]);
            products.add(product);
        } while (scanner.hasNext());
        return products;
    }
}
