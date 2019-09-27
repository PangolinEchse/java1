import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
public class Text
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> list = new ArrayList<String>();
        ReadString.read(in,list);
        ListOut.listOut(list);
        DeleteNumbers.delete(list);
    }
}
