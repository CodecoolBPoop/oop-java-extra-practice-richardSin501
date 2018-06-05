package fi.mooc.week3.ex060;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class AlphebeticalStringPrinter {

  public static void main(String[] args) {
    List<String> userStrings = new ArrayList<String>();
    Scanner input = new Scanner(System.in);
    System.out.print("Type a word: ");
    String userString = input.nextLine();
    // while is over when it's empty line
    while (!userString.equals("")) {
      //splitting userString to seperate words at spaces
      userStrings.addAll(Arrays.asList(userString.split("\\s+")));
      System.out.print("Type a word or words: ");
      userString = input.nextLine();
    }

    Collections.sort(userStrings);

    for (String word : userStrings) {
      System.out.println(word);
    }

  }
}

