import java.util.List;
class DeleteNumbers{
    static void delete(List<String> list) {
        for (String str :list ){
            System.out.println(str.replaceAll("[^A-Za-z,?/:]", ""));
        }
    }
}