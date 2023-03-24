
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ścieżke pliku: ");
        String input_file = scanner.nextLine();

        File file = new File(input_file);
        FileInputStream fileInputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String line;
        int wordCount = 0;
        int characterCount = 0;
        int whiteSpaceCount = 0;
        int sentenceCount = 0;


        System.out.println("To są statyski tego pliku");

        while ((line = bufferedReader.readLine()) != null) {

                characterCount += line.length();
                String[] words = line.split("\\s+");
                wordCount += words.length;
                whiteSpaceCount += wordCount - 1;
                String[] sentence = line.split("[!?.:]+");
                sentenceCount += sentence.length;
        }
        System.out.println("Liczba słów: "+ wordCount);
        System.out.println("Liczba zdań: "+ sentenceCount);
        System.out.println("Liczba znaków: "+ characterCount);
        System.out.println("Liczba białych znaków: "+ whiteSpaceCount);







    }
}

