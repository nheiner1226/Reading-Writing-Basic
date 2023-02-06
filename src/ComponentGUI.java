import javax.swing.*;
import java.awt.*;

public class ComponentGUI {

    JFrame writeFrame = new JFrame();

    JPanel writePanel = new JPanel();

    JTextArea writeArea = new JTextArea("Text from the file will be written to this text box." + "\n");

    public ComponentGUI (String text)   {

        writeFrame.add(writePanel);
        writeFrame.setVisible(true);

        writePanel.add(writeArea);

        writeArea.setPreferredSize(new Dimension(400, 400));
        writeArea.append(text);

        writeFrame.pack();

        System.out.println("Frame is now visible.");

    }

}
