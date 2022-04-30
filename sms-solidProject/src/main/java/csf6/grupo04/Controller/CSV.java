package csf6.grupo04.Controller;

import java.io.File;
import java.io.FileWriter;
import com.opencsv.CSVWriter;
import java.io.IOException;

public class CSV{
    public static void writeInCSV(String filePath, String[] data){

        File file = new File(filePath);

        try {
            FileWriter outputfile = new FileWriter(file, true);
            CSVWriter writer = new CSVWriter(outputfile);

            writer.writeNext(data);
            writer.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
