import java.util.HashMap;

public class Translator {
  static HashMap<Integer, String> numericAlpha = new HashMap<Integer, String>();

  public Translator(int[] numeric, String[] alphabetic) {
    for (int i = 0; i < alphabetic.length; i++) {
      numericAlpha.put(numeric[i], alphabetic[i]);
    }
  }

  public static String translate(Integer number) {
    return numericAlpha.get(number);
  }
}
