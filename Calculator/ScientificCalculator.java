import java.io.*;
import java.util.*;
//import java.lang.Math;

public class ScientificCalculator extends BasicCalculator //implements ScientificCalcultion
{
	public ScientificCalculator(){};

	public void resultSaveToFile(double result){

		BufferedWriter bw = null;
		try {
			String output = Double.toString(result);
			File file = new File("E:/Java/Calculator Output.txt");

			if(!file.exists()) {
				file.createNewFile();
				}

			FileWriter fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			bw.write(output);
    		bw.newLine();
			bw.flush();
			bw.close();
			System.out.println("Result Saved");

			}catch(IOException ioe) {
					ioe.printStackTrace();
					}
	}

	public void displayResult(){

		BufferedReader br = null;
		try {
			File file = new File("E:/Java/Calculator Output.txt");

			if(!file.exists()) {
				System.out.println("No History Found");
				}

			FileReader fr = new FileReader(file);
			br = new BufferedReader(fr);

			String record = br.readLine();

			System.out.println("Calculator Output Is : ");
			System.out.println(record);

			}catch(IOException ioe) {
					ioe.printStackTrace();
					}
	}

	public void scientificMain()
	{

		Scanner strInput = new Scanner(System.in);
		Scanner strInput2 = new Scanner(System.in);
        String choice,cont = "y";

        while( cont.equalsIgnoreCase("y") ) {

			System.out.println("Enter First Number:");
			double first = strInput2.nextDouble();
			System.out.println("Enter Second Number:");
			double second = strInput2.nextDouble();

        	System.out.println("\t\t Operations \n\n");

	        System.out.println("1. Addition ");
	        System.out.println("2. Subtraction ");
	        System.out.println("3. Multiplication ");
	        System.out.println("4. Division ");
			System.out.println("5. Square ");
			System.out.println("6. Cube ");
			System.out.println("7. To The Power ");
			System.out.println("8. EXIT ");

	        System.out.print("\n\n");
			System.out.println("Enter Your Operation: ");
	        choice = strInput.nextLine();

	        if( choice.equals("1") ) {
				ScientificCalculator obj= new ScientificCalculator();
				double result = obj.addition(first,second);
				obj.resultSaveToFile(result);
				obj.displayResult();

	        } else if( choice.equals("2") ) {
	        	ScientificCalculator obj= new ScientificCalculator();
				double result = obj.subtraction(first,second);
				obj.resultSaveToFile(result);
				obj.displayResult();


	        } else if( choice.equals("3") ) {
				ScientificCalculator obj= new ScientificCalculator();
				double result = obj.multiplication(first,second);
				obj.resultSaveToFile(result);
				obj.displayResult();


	        } else if( choice.equals("4") ) {
				ScientificCalculator obj= new ScientificCalculator();
				double result = obj.division(first,second);
				obj.resultSaveToFile(result);
				obj.displayResult();


	        } else if( choice.equals("5") ) {
				ScientificCalculator obj= new ScientificCalculator();
				double result = obj.square(first);
				obj.resultSaveToFile(result);
				obj.displayResult();


	        }else if( choice.equals("6") ) {
				ScientificCalculator obj= new ScientificCalculator();
				double result = obj.cube(first);
				obj.resultSaveToFile(result);
				obj.displayResult();


	        }else if( choice.equals("7") ) {
				ScientificCalculator obj= new ScientificCalculator();
				double result = obj.pow(first,second);
				obj.resultSaveToFile(result);
				obj.displayResult();


	        }else if( choice.equals("8") ) {
				System.exit(0);
	        }

	        System.out.println("Do you want to continue? Y/N");
	        cont = strInput.nextLine();

        }
	}
}
