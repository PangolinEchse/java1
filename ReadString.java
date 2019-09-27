import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class ReadString
{
    static List<String> read(Scanner in, List<String> list){
        while (true){
            String current = in.nextLine();
            if (current.equals(""))break;
            list.add(current);
        }
        return list;
    }
}
