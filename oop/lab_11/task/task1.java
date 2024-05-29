import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static String path = "resources\\example.txt";
    static String[] temp;
    static char[] arr = {'.' ,'–','(', ')'};
    public static void main(String[] args) {

        try(FileReader reader = new FileReader(path);
            Scanner scanner = new Scanner(reader)){
                temp = scanner.nextLine().split(" ");

            System.out.println(contains(temp, arr));
        } catch (FileNotFoundException e){
            System.out.println("Wrong path " + e.getMessage());
        }catch (IOException e){
            System.out.println("Exception " + e.getMessage());
        }
    }
    public static int contains(String[] temp,char[] arr){
        int count = 0;
        char[] chars = Arrays.toString(temp).toCharArray();
        for (char value  : arr) {
            for (char s : chars) {
                if (value == s) count++;
            }
        }
        return count;
    }
}
