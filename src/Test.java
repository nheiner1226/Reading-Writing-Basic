import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner fileNameInput = new Scanner(System.in);
        System.out.println("Enter the name of the file: ");
        String fileName = fileNameInput.nextLine();

        // Class instance
        CreateFile newFile = new CreateFile(fileName);
        newFile.FileCheckerCreator(fileName);
        newFile.WriteFileConsole();
        newFile.ReadFileConsole();

        ComponentGUI component = new ComponentGUI(newFile.ReadFileGUI());

    }

}
