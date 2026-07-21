package application.tasktrackercli;

import tools.jackson.databind.ObjectMapper;
import tools.jackson.core.type.TypeReference;

import java.io.InputStream;

public class TaskTrackerCliApplication {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        InputStream is = TaskTrackerCliApplication.class
                .getClassLoader()
                .getResourceAsStream("info.json");
        Info info = mapper.readValue(is, Info.class);

        System.out.println(info.getAppName());
        System.out.println(info.getVersion());
        System.out.println(info.getAuthor());

    }
}
