import com.fasterxml.jackson.databind.ObjectMapper;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class JsonUtil {

  private JsonUtil() {
  }
  private static final ObjectMapper objectMapper = new ObjectMapper();

  public static String convertToJson(Object object) {
    //TODO: change the code to pass the test
    String result = "";
    try {
      result = String.format("{\"name\":\"%s\",\"age\":%d}", ((Person)object).getName(), ((Person)object).getAge());
    } catch (Exception e) {
      e.printStackTrace();
    }
    return result;
  }
}
