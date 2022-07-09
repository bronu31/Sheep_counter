import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*public class Main {
    public static void main(String[] args) {
        Boolean[] array1 = {true, null};
        System.out.println(countSheeps(array1));
    }
*/
    public class SheepCounter {
        public  int countSheeps(Boolean[] arrayOfSheeps) {
            List<Boolean> list = new ArrayList
                    (Arrays.asList(arrayOfSheeps));
            list.removeAll(Collections.singleton(null));
            return (int) list.stream().filter(aos -> aos == true).count();
        }
    }

