package csf6.grupo04.Controller;

import java.io.*;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.CSVWriter;

import java.util.List;

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

    public static void readInCSV(String filePath){
        try {
            FileReader filereader = new FileReader(filePath);
            CSVReader csvReader = new CSVReaderBuilder(filereader).build();

            List<String[]> allData = csvReader.readAll();

            for (String[] row : allData) {
                for (String cell : row) {
                    System.out.print("\t\t-\t\t" + cell);
                }
                System.out.println();
                System.out.println("\t\t\t -----------------------------------------------------------------------------------------" +
                        "----------------------------------------------------------------------------------------------------- \t\t\t");
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void searchInCSV(String filePath, String id){
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            boolean found = false;
            String line = null;

            while ((line = reader.readLine()) != null){
                String [] parts = line.split(",");
                int totalParts = parts.length;

                for (int i = 0; i < totalParts; i++){
                    if (id.compareTo(parts[i]) == 0){
                        System.out.println("Se encontro una coincidencia:");

                        for (int j = 0; j < parts.length; j++){
                            System.out.print("hola");
                        }

                        found = true;
                        break;
                    }
                }
            }

            if (found == false) {
                System.out.println("No se encontro ninguna coincidencia.");
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
