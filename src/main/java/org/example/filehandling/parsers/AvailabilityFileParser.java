package org.example.filehandling.parsers;

import org.example.filehandling.dataobjects.ProductDetails;
import org.example.filehandling.interfaces.FileParser;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AvailabilityFileParser implements FileParser<ProductDetails> {

    @Override
    public List<ProductDetails> parseFile(Scanner scanner) {
        ArrayList<ProductDetails> products = new ArrayList<>();
        do {
            String productString = scanner.nextLine();
            String[] values = productString.split(",");
            ProductDetails product = new ProductDetails(
                    values[0], values[1], Integer.parseInt(values[2]));
            products.add(product);
        } while (scanner.hasNext());
        return products;
    }
}
