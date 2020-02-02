package blake.json;

import java.io.FileWriter;
import java.io.IOException;
/* Json Simple Library */
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/*******************************************************************
 *  writeJson Class with main
 *  Description: Write 5 flowers to the Json file
 *  I used Simple Json ideas and layout from:
 *  https://howtodoinjava.com/library/json-simple-read-write-json-examples/
 *******************************************************************/
public class writeJson {
    public static void main(String[] args) {
        // First Flower
        JSONObject flowerDetails = new JSONObject();
        flowerDetails.put("flowerName", "Daisy");
        flowerDetails.put("scientificName", "Bellis perennis");
        flowerDetails.put("color", "White");

        JSONObject flowerObject = new JSONObject();
        flowerObject.put("flower", flowerDetails);

        // Second Flower
        JSONObject flowerDetails2 = new JSONObject();
        flowerDetails2.put("flowerName", "Rose");
        flowerDetails2.put("scientificName", "Rosa");
        flowerDetails2.put("color", "Red");

        JSONObject flowerObject2 = new JSONObject();
        flowerObject2.put("flower", flowerDetails2);

        // Third Flower
        JSONObject flowerDetails3 = new JSONObject();
        flowerDetails3.put("flowerName", "Iris");
        flowerDetails3.put("scientificName", "Iris germanica");
        flowerDetails3.put("color", "Purple");

        JSONObject flowerObject3 = new JSONObject();
        flowerObject3.put("flower", flowerDetails3);

        // Fourth Flower
        JSONObject flowerDetails4 = new JSONObject();
        flowerDetails4.put("flowerName", "Narcissus");
        flowerDetails4.put("scientificName", "Narcissus pseudonarcissus");
        flowerDetails4.put("color", "Yellow");

        JSONObject flowerObject4 = new JSONObject();
        flowerObject4.put("flower", flowerDetails4);

        // Fifth Flower
        JSONObject flowerDetails5 = new JSONObject();
        flowerDetails5.put("flowerName", "Orchid");
        flowerDetails5.put("scientificName", "Orchidaceae");
        flowerDetails5.put("color", "White");

        JSONObject flowerObject5 = new JSONObject();
        flowerObject5.put("flower", flowerDetails5);

        // Add flowers to list
        JSONArray flowerList = new JSONArray();
        flowerList.add(flowerObject);
        flowerList.add(flowerObject2);
        flowerList.add(flowerObject3);
        flowerList.add(flowerObject4);
        flowerList.add(flowerObject5);

        // Write JSON file
        try (FileWriter file = new FileWriter("flowers.json")) {

            file.write(flowerList.toJSONString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
