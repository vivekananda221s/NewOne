package dbte;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

public class CSV {

	public static void main(String[] args) throws IOException
	{
		FileWriter fw = new FileWriter("C:\\Users\\vicky\\Desktop\\Create.CSV");
		
		
		
		Scanner inc = new Scanner(System.in);
		CSVWriter cw = new CSVWriter(fw);
		for(int i=0;i<20;i++)
		{
			String names[]= {"vivek","lovelyy"};
			cw.writeNext(names);
		}
		cw.close();
	}

}
