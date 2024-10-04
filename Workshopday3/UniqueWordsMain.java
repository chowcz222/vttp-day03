package Workshopday3;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.*;

public class UniqueWordsMain {

    public static void main(String[] args) throws FileNotFoundException,IOException {
        
        String inputFile = args[0];
        String outputFile = args[1];

        //Open inputFile for reading
        Reader reader = new FileReader(inputFile);
        BufferedReader bufferedReader = new BufferedReader(reader);

        Writer writer = new FileWriter(outputFile);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        String line = "";
        while (null != line) {
            //Read a Line
            line = bufferedReader.readLine();
            if (null== line)
                break;

            //Write to File
            bufferedWriter.write(line.replaceAll("\\p{Punct}", "").toLowerCase());
        }

        //close the file
        reader.close();
        //Flush remaining data to file
        bufferedWriter.flush();
        // writer.flush();
        writer.close();
    }
    
}
