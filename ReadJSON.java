package org.apache.maven.archetypes.maven_archetypes_quickstart;


import java.io.FileReader;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ReadJSON {
    public static void main(String[] args) throws Exception {
        JSONParser parser = new JSONParser();

        Object obj = parser.parse(new FileReader("JSON/student.json"));
        JSONObject jsonObject = (JSONObject) obj;

        String firstname = (String) jsonObject.get("firstname");
        String lastname  = (String) jsonObject.get("lastname");

        System.out.println("Firstname = " + firstname);
        System.out.println("Lastname  = " + lastname);
    }
}

