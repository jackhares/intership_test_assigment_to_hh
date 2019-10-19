import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {
        String[][] matr = {
                {"1", "2", "3"},
                {"4","5","6"},
                {"7","8","9"},
                {"","0",""}
        };
        String chislo;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        char[] x = reader.readLine().toCharArray();

        ArrayList<char[]> list = new ArrayList();


        for (int index = 0; index < x.length; index++){
            //TODO: избавиться от char
            chislo = String.valueOf(x[index]);

            x : for (int i = 0; i < matr.length; i++){
                for (int j = 0; j < matr[i].length; j++){

                    if (matr[i][j].equals(chislo) && !matr[i][j].isEmpty()){
//                        list.add(matr[i][j]);

                        if ( (i + 1) < matr.length && !matr[i + 1][j].isEmpty()){
//                            list.add(matr[i + 1][j]);
                            chislo += matr[i + 1][j];
                        } if ( (i - 1) >= 0 && !matr[i - 1][j].isEmpty()){
//                            list.add(matr[i - 1][j]);
                            chislo += matr[i - 1][j];
                        }
                        if (j + 1 < matr[i].length && !matr[i][j + 1].isEmpty()){
//                            list.add(matr[i][j + 1]);
                            chislo += matr[i][j + 1];
                        } if ( (j - 1) >= 0 && !matr[i][j - 1].isEmpty()){
//                            list.add(matr[i][j - 1]);
                            chislo += matr[i][j - 1];
                        }

                        list.add(chislo.toCharArray());
                        break x;
                    }

                }
            }

        }


    }

//    public static x()


}
