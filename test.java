import java.io.*;
import java.util.Scanner;

import static java.awt.SystemColor.text;

public class test {
    public static void main(String[] args) throws IOException {
        System.out.println("select");
        System.out.println("1 create an entry" + "\n2 open the entry" + "\n3" + "\n4");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        switch (x) {
            case 1:
                System.out.println("enter the name");
                FileWriter writer = new FileWriter("res.txt");
                Scanner wow = new Scanner(System.in);
                String a = wow.nextLine();
                writer.append(a);
                System.out.println("entry create");
                writer.close();
                break;
            case 2:
                String text = "";
                try {
                    Reader reader = new FileReader("res.txt");
                    while (reader.ready()) {
                        text += (char) reader.read();
                    }
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
                System.out.println(text);
                break;
        }
    }
}