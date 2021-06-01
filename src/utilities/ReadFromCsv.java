package utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.opencsv.CSVReader;
import model.TestFields;

public class ReadFromCsv {
	
	public static void main(String... args) {
        List<TestFields> books = readFieldsFromCsv("src//utilities//fields.csv");
        for (TestFields b : books) {
            System.out.println(b);
        }
    }

	
	public static List<TestFields> readFieldsFromCsv(String fileName) {
        List<TestFields> fields = new ArrayList<>();
		CSVReader reader = null;
        
		try {
            //Get the CSVReader instance with specifying the delimiter to be used
            reader = new CSVReader(new FileReader(fileName),',');
            String [] nextLine;
            //Read one line at a time
            while ((nextLine = reader.readNext()) != null) 	{
                TestFields field = createField(nextLine);
                fields.add(field);
            }          

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        return fields;
    }

    private static TestFields createField(String[] metadata) {
        String name = metadata[0];
        String email = metadata[1];
        String phone = metadata[2];
        int experience = Integer.parseInt(metadata[3]);
        int position = Integer.parseInt(metadata[4]);
        String file = metadata[5];

        // create and return field of this metadata
        return new TestFields(name, email, phone, experience, position, file);
    }

}
