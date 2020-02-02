package blake.json;

/* Json Simple Library */
import org.json.simple.JSONObject;

/*******************************************************************
 *  flowerHelper Class
 *  Description: Format the Json output and print it to the
 *  screen
 *  I used Simple Json ideas and layout from:
 *  https://howtodoinjava.com/library/json-simple-read-write-json-examples/
 *******************************************************************/
public class flowerHelper {
    public static void parseFlowerObject(JSONObject flower)
    {
        // Get flower object within list
        JSONObject flowerObject = (JSONObject) flower.get("flower");

        // Get flower name
        String flowerName = (String) flowerObject.get("flowerName");
        System.out.println("Flower name is " + flowerName);

        // Get flower scientific name
        String scientificName = (String) flowerObject.get("scientificName");
        System.out.println("Scientific name is " + scientificName);

        // Get flower color
        String color = (String) flowerObject.get("color");
        System.out.println("Color is " + color);

        // Line separator
        System.out.print("\n");
    }

}
