package utilities;

import java.io.FileReader;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;

import model.TestFields;

public class Read {
	public static void main(String[] args) throws Exception {
		@SuppressWarnings("rawtypes")
		CsvToBean csv = new CsvToBean();

		String csvFilename = "src//utilities//fields.csv";
		CSVReader csvReader = new CSVReader(new FileReader(csvFilename));

		// Set column mapping strategy
		@SuppressWarnings({ "unchecked", "rawtypes" })
		List list = csv.parse(setColumMapping(), csvReader);

		for (Object object : list) {
			TestFields employee = (TestFields) object;
			System.out.println(employee);
		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private static ColumnPositionMappingStrategy setColumMapping() {
		ColumnPositionMappingStrategy strategy = new ColumnPositionMappingStrategy();
		strategy.setType(TestFields.class);
		String[] columns = new String[] { "name", "email", "phone", "employer", "experience", "position1", "position2",
				"position3", "file" };
		strategy.setColumnMapping(columns);
		return strategy;
	}
}
