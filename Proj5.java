// Hash Table

import java.util.HashMap;

public class Proj5 {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        
        map.put("Megan Haber", 441485);
        map.put("Roger Waters", 445628);
        map.put("David Gilmour", 442375);
        map.put("Lady Gaga", 440972);
        
        if (map.isEmpty()){
            System.out.println("The map is empty.");
        }
        else {
            System.out.println("Size of Hash Map: " + map.size());
            System.out.println(map);
            System.out.println("\nID Numbers:");
            System.out.println("Megan Haber: " + map.get("Megan Haber"));
            System.out.println("Roger Waters: " + map.get("Roger Waters"));
            System.out.println("David Gilmour: " + map.get("David Gilmour"));
            System.out.println("Lady Gaga: " + map.get("Lady Gaga"));
        }
    }
    
}
