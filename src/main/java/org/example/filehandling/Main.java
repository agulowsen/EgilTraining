package org.example.filehandling;

import org.example.filehandling.dataobjects.Product;
import org.example.filehandling.dataobjects.ProductConfig;
import org.example.filehandling.dataobjects.ProductDetails;
import org.example.filehandling.dataobjects.SHA1337encryption;
import org.example.filehandling.filetypes.ProductConfigFile;
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

        ProductsDetailsFile pdFile = new ProductsDetailsFile("products_details_2", lsHome, "config");
        List<ProductDetails> availabilities = FileController.readFile(pdFile);

        ProductConfigFile pcFile = new ProductConfigFile("products_config_2", lsHome, "config");
        List<ProductConfig> configs = FileController.readFile(pcFile);

        printList(products);
        printDivider();
        printList(availabilities);
        printDivider();
        printList(configs);
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



        ProductConfigFile productsConfigFile = new ProductConfigFile("products_config_2", lsHome, "config");
        List<ProductConfig> configs = new ArrayList<>();
        configs.add(new ProductConfig( "1", "Flåklypa", "Mysil Bergsprekken", SHA1337encryption.SECRETKEY_1.generatePublicKey()));
        configs.add(new ProductConfig("2","Flåklypa",  "Reodor Felgen", SHA1337encryption.SECRETKEY_2.generatePublicKey()));
        configs.add(new ProductConfig("3", "Ørkenlandet (kuwait)",  "Ben Redic Fy Fazan", SHA1337encryption.SECRETKEY_3.generatePublicKey()));
        configs.add(new ProductConfig( "4", "Volda", "Solan Gundersen", SHA1337encryption.SECRETKEY_4.generatePublicKey()));
        configs.add(new ProductConfig("5","Alvdal",  "Emanuel Desperados", SHA1337encryption.SECRETKEY_5.generatePublicKey()));
        configs.add(new ProductConfig("6", "Bergen",  "Rudolf Blodstrupmoen", SHA1337encryption.SECRETKEY_6.generatePublicKey()));
        configs.add(new ProductConfig( "7", "Legoland", "Ollvar O. Kleppvold", SHA1337encryption.SECRETKEY_7.generatePublicKey()));
        configs.add(new ProductConfig("8","Ramstadsletta",  "Hallstein Bronskimlet d.a.", SHA1337encryption.SECRETKEY_8.generatePublicKey()));
        configs.add(new ProductConfig("9", "Krokryggen Gamlehjem",  "Melvind Snerken", SHA1337encryption.SECRETKEY_9.generatePublicKey()));
        configs.add(new ProductConfig( "10", "Skien", "Myrullbråten", SHA1337encryption.SECRETKEY_10.generatePublicKey()));
        configs.add(new ProductConfig("11","Bermuda",  "Olram Slåpen", SHA1337encryption.SECRETKEY_11.generatePublicKey()));
        configs.add(new ProductConfig("12", "Tromsø",  "Baron Von Wärenschiöld", SHA1337encryption.SECRETKEY_12.generatePublicKey()));
        configs.add(new ProductConfig( "13", "Ryfylkeheiene", "Sindre Surklerud", SHA1337encryption.SECRETKEY_13.generatePublicKey()));
        configs.add(new ProductConfig("14","Belgiske Kongo",  "Enkefru Stengenfhøn-Glad", SHA1337encryption.SECRETKEY_14.generatePublicKey()));
        configs.add(new ProductConfig("15", "Ørkenlandet (kuwait)",  "Randolph Småfix", SHA1337encryption.SECRETKEY_15.generatePublicKey()));
        configs.add(new ProductConfig( "16", "Nederland", "Vigfus Skonken", SHA1337encryption.SECRETKEY_16.generatePublicKey()));
        configs.add(new ProductConfig("17","I ei osp attmed Glomma",  "Barbro Kjølstad", SHA1337encryption.SECRETKEY_17.generatePublicKey()));
        configs.add(new ProductConfig("18", "Gjettum",  "Aurikla Wedel-Jørgensen", SHA1337encryption.SECRETKEY_18.generatePublicKey()));
        productsConfigFile.setData(configs);
        FileController.writeFile(productsConfigFile);
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