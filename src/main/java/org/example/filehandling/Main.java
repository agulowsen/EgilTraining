package org.example.filehandling;

import org.example.filehandling.dataobjects.Product;
import org.example.filehandling.dataobjects.ProductDetails;
import org.example.filehandling.filetypes.ProductsDetailsFile;
import org.example.filehandling.filetypes.ProductsFile;

import java.nio.file.FileSystems;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final String FILE_SEPERATOR = FileSystems.getDefault().getSeparator();
    private static final String lsHome = System.getProperty("user.home") + FILE_SEPERATOR + "egiltrening" + FILE_SEPERATOR;

    public static void main(String[] args) {

        CreateDummyFiles();

        ProductsFile productsFile = new ProductsFile("products_2",lsHome, "txt");
        List<Product> products = FileController.readFile(productsFile);

        ProductsDetailsFile paFile = new ProductsDetailsFile("products_details_2", lsHome, "config");
        List<ProductDetails> availabilities = FileController.readFile(paFile);

        printList(products);
        printDivider();
        printList(availabilities);

    }

    private static void CreateDummyFiles() {
        ProductsFile mockProductsFile = new ProductsFile("products_2", lsHome, "txt");
        List<Product> products = new ArrayList<>();
        products.add(new Product("Banana", "1"));
        products.add(new Product("Apple", "2"));
        products.add(new Product("Hamburger", "3"));
        mockProductsFile.setData(products);
        FileController.writeFile(mockProductsFile);

        ProductsDetailsFile productAvailabilityFile = new ProductsDetailsFile("products_details_2", lsHome, "config");
        List<ProductDetails> availabilities = new ArrayList<>();
        availabilities.add(new ProductDetails("1", "20-04-22",  400));
        availabilities.add(new ProductDetails("2", "22-04-22",  400));
        availabilities.add(new ProductDetails("3", "22-04-22", 400));
        productAvailabilityFile.setData(availabilities);
        FileController.writeFile(productAvailabilityFile);


    }

    private static void printDivider() {
        for(int i = 0; i < 60; i++) {
            System.out.print("-");
        }
        System.out.println("");
    }


    private static <T> void printList(List<T> list) {
        for (T t : list) {
            System.out.println(t);
        }
    }

}
