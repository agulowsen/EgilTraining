package org.example.filehandling;

import org.example.filehandling.interfaces.FileReadable;
import org.example.filehandling.interfaces.FileSavable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileController {
        public static <T> List<T> readFile(FileReadable<T> readable) {
        // Reads file
        String filePath = readable.getFilePath() + readable.getFileName() + "." + readable.getFileFormat();
        List<T> entries;
            try (FileInputStream fileInputStream = new FileInputStream(filePath);
                    Scanner scanner = new Scanner(fileInputStream)){
                entries = readable.getParser().parseFile(scanner);
            } catch (IOException e) {
                System.out.println("File not found : " + filePath);
                return new ArrayList<>();
            }
            return entries;
        }

        public static <T> void writeFile(FileSavable<T> fileSavable) {
            if(!Files.exists(Paths.get(fileSavable.getFilePath()))) {
                createFolder(fileSavable.getFilePath());
            }
            String filePath = fileSavable.getFilePath() + fileSavable.getFileName() + "." + fileSavable.getFileFormat();
            try (PrintWriter writer = new PrintWriter(filePath)) {
                writer.print(fileSavable.getFileContent());
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

    private static void createFolder(String folderPath) {
        new File(folderPath).mkdirs();
    }
}
