package blake.json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/* Json Simple Library */
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/*******************************************************************
 *  readJson Class with main
 *  Description:  Read the entire flower list from the Json file
 *******************************************************************/
public class readJson {
    public static void main(String[] args) {
        // JSON parser object to parse read file
        JSONParser jsonParser = new JSONParser();

        try (FileReader reader = new FileReader("flowers.json")) {
            // Read JSON file
            Object obj = jsonParser.parse(reader);

            JSONArray flowerList = (JSONArray) obj;
            // Print entire Json file to screen
            //System.out.println(flowerList);

            // Iterate over flower array
            flowerList.forEach(flow -> flowerHelper.parseFlowerObject((JSONObject) flow));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
