import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import classes.FbiAdt;
import csvio.CSVContactsReader;


public class ExcelReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FbiAdt[] fbiArray = CSVContactsReader.readEntityList("fbi2006.csv", ",");
		
		for(FbiAdt fbi : fbiArray) System.out.println(fbi);
		
	}

}
