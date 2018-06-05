package fi.mooc.week3.ex059;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class ReverseWords {


  public static void main(String[] args) {
    // FIFO data type
    Stack<String> userStrings = new Stack<>();
    Scanner input = new Scanner(System.in);
    System.out.print("Type a word: ");
    String userString = input.nextLine();
    // while is over when it's empty line
    while (!userString.equals("")) {
      //splitting userString to seperate words at spaces
      List<String> userStringSeperateWords = new ArrayList<String>(
          Arrays.asList(userString.split("\\s+")));
      userStrings.addAll(userStringSeperateWords);
      System.out.print("Type a word or words: ");
      userString = input.nextLine();
    }

    System.out.println("\nYour words:");
    while (!userStrings.empty()) {
      System.out.println(userStrings.pop());
    }
  }
}