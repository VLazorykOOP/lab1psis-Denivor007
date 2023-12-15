import java.util.Arrays;

public class Main {

    public static int findLongest(String sentence) {
        return Arrays.stream(sentence.split(" "))
                .max((l,r)->l.length()-r.length())
                .orElse("").length();
    }

    public static void main(String[] args) {
        System.out.println(findLongest("Hi, my name is Walter White"));
    }
}