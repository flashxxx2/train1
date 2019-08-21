

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


//        Scanner scaner = new Scanner(System.in);
//        System.out.println("ВВедите предложение");
//        String sentences = scaner.nextLine();
        String sentences = " Я кушою . устриц. на обед и ужин каждый день";
        String[] array = sentences.split(" ");
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(array));
        arrayList.remove(".");
        Comparator comparator = new ComparatorSentence();
        arrayList.sort(comparator);
        String listString = String.join(" ", arrayList);
        String result = listString.replaceAll(",", "");

        System.out.println(result + ".");

    }

}
