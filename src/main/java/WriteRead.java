import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class WriteRead {
    public static void main(String[] args) throws Exception {
        int k1 = 2;
        int k2 = 9;
        newFile( k1, k2);
    }

    public static void newFile(int k1, int k2) throws Exception {
        FileWriter nFile = new FileWriter("file1.txt");

        for(int i = k1; i <= k2; i++) {

            nFile.write(i+"\n");

        }

        nFile.write("Хокку \nПодобен лучу самурайский клинок \nИ тот затупился \nПроклятая килька в томате");

        nFile.close();
        FileReader fr= new FileReader("file1.txt");
        Scanner scan = new Scanner(fr);

        int i = 1;

        while (scan.hasNextLine()) {
            System.out.println(i + " : " + scan.nextLine());
            i++;
        }

        fr.close();
    }
}
