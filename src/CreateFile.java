import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class CreateFile {

    String fileName;

    public CreateFile (String fileName)   {
        this.fileName = fileName;
    }



    // Checks if file exists
    public void FileCheckerCreator (String fileName)   {

        File textFile = new File(fileName);


        // Create files
        try {
            // File exists
            if (textFile.exists() == true) {
                textFile.delete();
                textFile.createNewFile();
                System.out.println("File overwritten.");
            }

            // File doesn't exist
            if (textFile.exists() == false) {
                System.out.println("File created.");
            }

        }

        catch (IOException ioe)   {
            ioe.printStackTrace();
        }

    }



    // Write input to text file
    public void WriteFileConsole ()   {

        System.out.println("Writing to file.");

        System.out.println("How many lines of text do you want to write?");
        Scanner userScan = new Scanner(System.in);
        int userCount = userScan.nextInt();

        int lineCount = 0;

        ArrayList <String> body = new ArrayList<>();

        while (lineCount < userCount)   {

            Scanner writerScan = new Scanner(System.in);
            System.out.println("Enter a line of text.");
            String writtenLine = writerScan.nextLine();

            body.add(writtenLine);
            lineCount++;
        }

        try   {

            PrintWriter printWriter = new PrintWriter(fileName);
            BufferedWriter bufferedWriter = new BufferedWriter(printWriter);

            for (String line:body)   {

                bufferedWriter.write(line + "\n");

            }

            // Write data here
            bufferedWriter.close();

        }

        catch (IOException ioe)   {
            ioe.printStackTrace();
        }

    }



    // Read file to console
    public void ReadFileConsole ()   {

        System.out.println("Reading to console.");

        File textFile = new File(fileName);


        try   {
            Scanner fileReader = new Scanner(textFile);

            while (fileReader.hasNextLine())   {
                String line = fileReader.nextLine();
                System.out.println(line);
            }

        }

        catch (FileNotFoundException fnfe)   {
            fnfe.printStackTrace();
        }

    }



    public String ReadFileGUI ()   {

        System.out.println("Reading to GUI.");

        File textFile = new File(fileName);

        String body = "";


        try   {
            Scanner fileReader = new Scanner(textFile);

            while (fileReader.hasNextLine())   {
                body += fileReader.nextLine() + "\n";
            }

        }

        catch (FileNotFoundException fnfe)   {
            fnfe.printStackTrace();
        }

        return body;

    }

}
