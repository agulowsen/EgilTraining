package org.example.filehandling.parsers;

import org.example.filehandling.dataobjects.Product;
import org.example.filehandling.interfaces.FileParser;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductsFileParser implements FileParser<Product> {

    @Override
    public List<Product> parseFile(Scanner scanner) {
        ArrayList<Product> products = new ArrayList<>();
        do {
            String productString = scanner.nextLine();
            String[] values = productString.split(",");
            Product product = new Product(values[1], values[0]);
            products.add(product);
        } while (scanner.hasNext());

        return products;
    }
}
