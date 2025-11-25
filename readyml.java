import org.yaml.snakeyaml.Yaml;
import java.io.InputStream;
import java.util.Map;

public class ReadYML {
    public static void main(String[] args) {
        Yaml yaml = new Yaml();

        InputStream input = ReadYML.class.getClassLoader()
                .getResourceAsStream("config.yml");

        Map<String, Object> data = yaml.load(input);

        System.out.println(data);
    }
}
