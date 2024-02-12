package LibraryRegisterVer1;

import java.util.Scanner;

/**
 * LibraryRegisterVer1.Main - класс запуска программы;
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input your number: ");
        int num = in.nextInt();
        LibraryObjectRepository repositoryOfLibrary = new LibraryObjectRepository();
         System.out.println(repositoryOfLibrary.findLibraryObject(num));

    }
}
