package com.arnab;

import java.io.*;
import java.util.Scanner;

public class WorkingWithFiles {
    public static void  main(String[] args){
        File file = createFile("src/note.txt");
//        readFile("src/note.txt");

        try {
            readFile2("src/note.txt", file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }


    // Reading files;
    static void readFile2 (String path, File file) throws FileNotFoundException {
        try {
            Scanner scanner = new Scanner(file);
            System.out.println(scanner.nextLine());
        }catch(FileNotFoundException e){
            throw new FileNotFoundException();
        }

    }
    static void readFile (String path){
        try {
            FileReader fileReader = new FileReader(path);
            System.out.println(fileReader.readAllLines());
            fileReader.close();

        }catch (IOException e){
            System.out.println(e);
        }
    }
    // writing files
    static void writeFile (File file){
        try {
            FileWriter fileWriter = new FileWriter(file, true);
            PrintWriter printWriter = new PrintWriter(fileWriter, true);

            printWriter.println("This is new text from the code");

            // printWriter.flush(); <--- if you pass auto-flash -> true you don't need to flash manually
            printWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static File createFile(String path){
        try {
            File file = new File(path);
            if(!file.exists()){
                file.createNewFile();
            }

            return  file;
        }catch (IOException e){
            System.out.println(e.getMessage());
            throw new IllegalStateException(e);
        }
    }
}
