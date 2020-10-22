package testOther;

import java.io.*;

public class FileUse {
    public static void main(String[] args) throws IOException {

        File dir = new File("temp"); // created file in memory, not save in disk.
        if (!dir.isDirectory()) {
            dir.mkdirs(); // add dirs or dir /as/s/s/
            System.out.println("create folder /temp");
        }

        File file = new File("temp/temp.txt");

        if (!file.isFile()) { // Test link is file
            file.createNewFile(); // file created in disk
            System.out.println("file");
        }

        //if (file.exists()){ // Test exists file
        System.out.println("write in file!");
        FileWriter fileWriter = new FileWriter(file); //open file for write and save
        fileWriter.write("srt1\n"); // add character string and add new line \n
        fileWriter.write("srt2\n");
        fileWriter.write("srt3\n");
        //fileWriter.flush(); // need use for save file
        //fileWriter.close(); // close and save
        //}
        if (file.isDirectory()) {
            System.out.println("dir");
        }
/*

        char[] c1 = new char[20]; //for FileWriter need know lenght, another add use BufferedWriter
        fileReader.read(c1);
        System.out.println(c1);
        *//*for(char c: c1){ // read all char
            System.out.print(c); //display char
        }*/
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter); // use for add save Buffer not need know length file
        bufferedWriter.write("str4");
        bufferedWriter.newLine(); // add new line
        bufferedWriter.write("str5");
        bufferedWriter.flush();
        bufferedWriter.close(); // close file

        FileReader fileReader = new FileReader(file); //open file for read
        BufferedReader bufferedReader = new BufferedReader(fileReader); // use BufferedReader
        while (bufferedReader.ready()) { // cycle for output all line
            System.out.println(bufferedReader.readLine()); // display read line
        }

    }
}
