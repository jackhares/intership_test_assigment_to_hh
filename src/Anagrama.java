import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Anagrama {
    static int size;
    static int count;
    static char[] arrChar = new char[100];

    public static void main(String[] args) throws IOException{
        System.out.println("Enter word:");

        String input = getString();

        size = input.length();

        for ( int  index = 0; index < size; index++)
            arrChar[index] = input.charAt(index);

        doAnagram(size);

    }

    private static void doAnagram(int newSize) {
        if (newSize == 1)
            return;

        for (int index = 0; index < newSize; index++)
        {
            doAnagram(newSize - 1);

            if (newSize == 2)
                displayWord();
            rotate(newSize);
        }


    }

    private static void rotate(int newSize) {
        int j;

        int position = size - newSize;

        char temp = arrChar[position];

        for (j = position + 1; j < size; j++)
            arrChar[j - 1] = arrChar[j];
        arrChar[j - 1] = temp;

    }

    private static void displayWord() {
    }

    private static String getString() throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(inputStreamReader);

        String br = reader.readLine();

        return br;

    }

}
