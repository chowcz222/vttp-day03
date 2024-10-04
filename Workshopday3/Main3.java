package Workshopday3;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.*;

public class Main3 {

    public static void main(String[] args) throws FileNotFoundException,IOException {

        Path p = Paths.get("C:/Users/bleac/VISA/day 03/src/Workshopday3/catinthehat.txt");
        InputStream fis = new FileInputStream(p.toFile());
        FileReader fr = new FileReader(p.toFile());
        BufferedReader br = new BufferedReader(fr);
        Path p2 = Paths.get("C:/Users/bleac/VISA/day 03/src/Workshopday3/write.txt");
        OutputStream ois = new FileOutputStream(p2.toFile());
        FileWriter fWriter = new FileWriter(p2.toFile());
        BufferedWriter bWriter = new BufferedWriter(fWriter);


        //FileReader to FileWriter
        char[] buffer=new char[1024];
        int len;
        while ( ( len=fr.read(buffer) ) >= 0 )
          {
          fWriter.write(buffer, 0, len);
          }


        String line = br.readLine();
		while (line != null) {
			// System.out.println(line);
			// read next line
            bWriter.write(line);
			line = br.readLine();
		}

        

            


    
        fis.close();
        ois.close();
        fr.close();
        fWriter.close();
        bWriter.close();


    }
    
}
