package Services;

import java.io.File;
import java.io.IOException;

public class Autonode {

    public static void main(String[] args) throws InterruptedException {
        File file = new File("src/Services/Scripts/Bilka.json");
        File file2 = new File("src/Services/Scripts/Foetex.json");

        if (file.delete() && file2.delete()) {
            System.out.println("Success");
        } else {
            System.out.println("Failed");
        }

        ProcessBuilder pb1 = new ProcessBuilder("node", "src/Services/Scripts/bilka.js");

        ProcessBuilder pb2 = new ProcessBuilder("node", "src/Services/Scripts/foetex.js");

        pb1.redirectOutput(ProcessBuilder.Redirect.INHERIT);
        pb2.redirectOutput(ProcessBuilder.Redirect.INHERIT);

        Node(pb1);

        Node(pb2);


    }

    private static void Node(ProcessBuilder pb) throws InterruptedException {
        try {
            Process p = pb.start();
            p.waitFor();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
