package codewars;

public class AbbreviateTwoWords {

  public static String abbrevName(String name) {
    if (name.isEmpty()) {
      return "";
    } else {
      String[] arr = name.split(" ");
      return (arr[0].charAt(0) + "." + arr[1].charAt(0)).toUpperCase();
    }
  }
}