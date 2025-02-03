import java.util.HashSet;
import java.util.Random;
import java.util.Set;

class Robot {
    private String name = "";
    private static Set listName = new HashSet<>();

     Robot(){
        generateName();
    }
    String getName() {
        return name;
    }
    String generateName() {
        Random r = new Random();
        do {
            for (int i = 0; i < 2; i++) {
                name += (char) (r.nextInt(26) + 'A');
            }
            for (int j = 0; j < 3; j++) {
                name += r.nextInt(10);
            }

        }  while (listName.contains(name));
        listName.add(name);
        return name;
    }

    void reset() {
        listName.remove(name);
        name = "";
        generateName();
    }

}