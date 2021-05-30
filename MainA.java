import java.util.ArrayList;

public class MainA {


    static ArrayList<Integer> filterNumber(ArrayList<Integer> data, Integer key) {
        ArrayList<Integer> results = new ArrayList<>();
        for (Integer itm : data) {
            if(itm == key) {
                results.add(itm);
            }
        }
        return results;
    }

    public static void main(String[] args) {
        ArrayList<Integer> baseNumber = new ArrayList<>();
        for (int i = 0; i < 300; i++) {
            baseNumber.add((int)(Math.floor(Math.random() * 100) + 1));
        }
        ArrayList<Integer> results = filterNumber(baseNumber, 4);
        if(results.size() > 0) {
            for (Integer itm : results) {
                System.out.println("Nomor : " + itm);
            }
        } else {
            System.out.println("No data found");
        }
    }
}