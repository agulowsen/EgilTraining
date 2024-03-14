package org.example.filehandling.interfaces;

import java.util.List;
import java.util.Scanner;

public interface FileParser<T> {

    List<T> parseFile(Scanner scanner);
}
