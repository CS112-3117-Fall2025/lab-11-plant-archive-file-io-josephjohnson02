// TODO: Step 2 - Import file input statements here
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Main 
{
	public static void main(String[] args) 
	{
		//TEST FOR STEP 1 (you can delete/comment this out after completing step 1)
		//Plant test = new Plant("Stinging Nettle,65,anti-inflammatory and culinary");
		//System.out.println("test plant:\n" + test + "\n\n");


		ArrayList<Plant> plants = new ArrayList<>();
		//TODO: Step 2 - Declare + initialize variables for file input here
		try
		{
			FileInputStream fileInputStream = new FileInputStream("Forage.csv");

			Scanner scanner = new Scanner(fileInputStream);

			while (scanner.hasNextLine())
			{
				String line = scanner.nextLine();
				plants.add(new Plant(line));
			}

			scanner.close();
		}
		catch (FileNotFoundException fnfe)
		{
			System.out.println("File not found: " + fnfe.getMessage());
		}

		for (Plant plant : plants)
		{
			System.out.println(plant + "\n");
		}
	}
}